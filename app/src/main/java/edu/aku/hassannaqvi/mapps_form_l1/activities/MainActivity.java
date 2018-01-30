package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.ClustersContract;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.FormsContract;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.LHWsContract;
import edu.aku.hassannaqvi.mapps_form_l1.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;
import edu.aku.hassannaqvi.mapps_form_l1.get.GetFollowups;
import edu.aku.hassannaqvi.mapps_form_l1.sync.SyncForms;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.lblheader)
    TextView lblheader;
    @BindView(R.id.recordSummary)
    TextView recordSummary;

    @BindView(R.id.spClusters)
    Spinner spClusters;
    @BindView(R.id.mpl1aLHWs)
    Spinner mpl1aLHWs;
    @BindView(R.id.testing)
    TextView testing;

    @BindView(R.id.syncDevice)
    Button syncDevice;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    DatabaseHelper db;
    List<String> clustersName;
    HashMap<String, String> cluster;
    List<String> LHWsName;
    HashMap<String, String> LHWs;
    private ProgressDialog pd;
    private Boolean exit = false;
    private String rSumText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        lblheader.setText("Welcome! You're assigned to block ' " + " '" + MainApp.username);
        if (Integer.valueOf(Arrays.toString(MainApp.versionName.split(".", 0))) < 1) {
            testing.setVisibility(View.VISIBLE);
        }
        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }

        // Reset working variables
        MainApp.child_name = "Test";

        /*TagID Start*/
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(R.drawable.tagimg);
        img.setPadding(0, 15, 0, 15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }
        /*TagID End*/


        db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = db.getTodayForms();
        Collection<FormsContract> unsyncedForms = db.getUnsyncedForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size() + "\r\n";
        rSumText += "\r\n";
        if (todaysForms.size() > 0) {
            rSumText += "\tFORMS' LIST: \r\n";
            String iStatus;
            rSumText += "--------------------------------------------------\r\n";
            rSumText += "[ FORM_ID ] \t[Form Status] \t[Sync Status]----------\r\n";
            rSumText += "--------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                if (fc.getIstatus() != null) {
                    switch (fc.getIstatus()) {
                        case "1":
                            iStatus = "\tComplete";
                            break;
                        case "2":
                            iStatus = "\tIncomplete";
                            break;
                        case "3":
                            iStatus = "\tRefused";
                            break;
                        case "4":
                            iStatus = "\tRefused";
                            break;
                        default:
                            iStatus = "\tN/A";
                    }
                } else {
                    iStatus = "\tN/A";
                }

                rSumText += fc.get_ID();

                rSumText += " " + iStatus + " ";

                rSumText += (fc.getSynced() == null ? "\t\tNot Synced" : "\t\tSynced");
                rSumText += "\r\n";
                rSumText += "--------------------------------------------------\r\n";
            }
        }
        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Data Download: \t" + syncPref.getString("LastDownSyncServer", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Data Upload: \t" + syncPref.getString("LastUpSyncServer", "Never Synced");
            rSumText += "\r\n";
            rSumText += "\r\n";
            rSumText += "Unsynced Forms: \t" + unsyncedForms.size();
            rSumText += "\r\n";
        }
        Log.d(TAG, "onCreate: " + rSumText);
        recordSummary.setText(rSumText);

        fillSpinners(this);


        //pl1aLHWs.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.LHWsName));


    }


    public void fillSpinners(Context mContext) {
        Collection<ClustersContract> clusterCollection = db.getAllClusters();

        clustersName = new ArrayList<>();

        cluster = new HashMap<>();

        if (clusterCollection.size() != 0) {
            for (ClustersContract c : clusterCollection) {
                clustersName.add(c.getClusterName());
                cluster.put(c.getClusterName(), c.getClusterCode());
            }

            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(mContext,
                    android.R.layout.simple_dropdown_item_1line, clustersName);

            // attaching data adapter to spinner
            spClusters.setAdapter(dataAdapter);

            spClusters.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    //((TextView) parent.getChildAt(0)).setTextColor(getResources().getColor(R.color.colorPrimary));
                    MainApp.curCluster = cluster.get(spClusters.getSelectedItem().toString());
                    Log.d("Selected Cluster", MainApp.curCluster);

                    LHWsName = new ArrayList<>();
                    LHWs = new HashMap<>();

                    Collection<LHWsContract> collectionLHWs = db.getLHWsByCluster(MainApp.curCluster);
                    for (LHWsContract lhws : collectionLHWs) {
                        LHWsName.add(lhws.getLhwName());
                        LHWs.put(lhws.getLhwName(), lhws.getLhwId());
                        Collections.sort(LHWsName);
                    }

                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getBaseContext(),
                            android.R.layout.simple_dropdown_item_1line, LHWsName);

                    mpl1aLHWs.setAdapter(dataAdapter2);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


        }

        mpl1aLHWs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //((TextView) parent.getChildAt(0)).setTextColor(getResources().getColor(R.color.colorPrimary));
                Log.d("Selected LHWs", LHWs.get(mpl1aLHWs.getSelectedItem().toString()));
                MainApp.selectedLhw = LHWs.get(mpl1aLHWs.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void openForm(View v) {
        if (!MainApp.curCluster.equals("")) {
            if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null && !MainApp.username.equals("0000")) {
                Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                startActivity(oF);
            } else {

                builder = new AlertDialog.Builder(MainActivity.this);
                ImageView img = new ImageView(getApplicationContext());
                img.setImageResource(R.drawable.tagimg);
                img.setPadding(0, 15, 0, 15);
                builder.setCustomTitle(img);

                final EditText input = new EditText(MainActivity.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        m_Text = input.getText().toString();
                        if (!m_Text.equals("")) {
                            editor.putString("tagName", m_Text);
                            editor.commit();

                            if (!MainApp.username.equals("0000")) {
                                Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                                startActivity(oF);
                            }
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }

        } else {
            Toast.makeText(this, "Sync cluster's from login page", Toast.LENGTH_SHORT).show();
        }
    }


    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        Intent iE = new Intent(this, SectionEActivity.class);
        startActivity(iE);
    }

    public void openF(View v) {
        Intent iF = new Intent(this, SectionFActivity.class);
        startActivity(iF);
    }


    public void testGPS(View v) {

        SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        Log.d("MAP", "testGPS: " + sharedPref.getAll().toString());
        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("Map", entry.getKey() + ": " + entry.getValue().toString());
        }

    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    /*public void CheckCluster(View v) {
        if (!areaCode.getText().toString().isEmpty()) {

            areaCode.setError(null);

            Intent Clist = new Intent(getApplicationContext(), FormsList.class);
            Clist.putExtra("areaCode", areaCode.getText().toString());
            startActivity(Clist);
        } else {
            Toast.makeText(this, "Error(Empty): Data Required", Toast.LENGTH_SHORT).show();
            areaCode.setError("Error(Empty): Data Required");
        }
    }*/

    /*  public void syncSg(View view) {

          // Require permissions INTERNET & ACCESS_NETWORK_STATE
          ConnectivityManager connMgr = (ConnectivityManager)
                  getSystemService(Context.CONNECTIVITY_SERVICE);
          NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
          if (networkInfo != null && networkInfo.isConnected()) {
              Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
              new SyncForms(this, false).execute();

  *//*            Toast.makeText(getApplicationContext(), "Syncing Census", Toast.LENGTH_SHORT).show();
            new SyncCensus(this).execute();

            Toast.makeText(getApplicationContext(), "Syncing Deceased", Toast.LENGTH_SHORT).show();
            new SyncDeceased(this).execute();*//*

//            Toast.makeText(getApplicationContext(), "Syncing Mother", Toast.LENGTH_SHORT).show();
//            new SyncMother(this).execute();

*//*            Toast.makeText(getApplicationContext(), "Syncing IM", Toast.LENGTH_SHORT).show();
            new SyncIM(this).execute();*//*

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }*/
    public void syncServer(View view) {

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {

        //String usersUrl = AppMain._HOST_URL + "virband/api/users.php";
        //String randsUrl = AppMain._HOST_URL + "virband/api/random.php"; // url to sync randomise data
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            // Sync Randomization
            /*Toast.makeText(getApplicationContext(), "Getting Enrollomization", Toast.LENGTH_SHORT).show();
            new GetEnroll(this).execute();*/

            Toast.makeText(getApplicationContext(), "Getting Followups", Toast.LENGTH_SHORT).show();
            new GetFollowups(this).execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();
        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity

            startActivity(new Intent(this, LoginActivity.class));

        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }
}

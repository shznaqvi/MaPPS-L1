package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;

public class SectionBActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    @BindView(R.id.activity_section_b)
    ScrollView activitySectionB;
    @BindView(R.id.mpl1ba001)
    RadioGroup mpl1ba001;
    @BindView(R.id.mpl1ba001a)
    RadioButton mpl1ba001a;
    @BindView(R.id.mpl1ba001b)
    RadioButton mpl1ba001b;
    @BindView(R.id.mpl1ba002)
    RadioGroup mpl1ba002;
    @BindView(R.id.mpl1ba002a)
    RadioButton mpl1ba002a;
    @BindView(R.id.mpl1ba002b)
    RadioButton mpl1ba002b;
    @BindView(R.id.mpl1ba003)
    RadioGroup mpl1ba003;
    @BindView(R.id.mpl1ba003a)
    RadioButton mpl1ba003a;
    @BindView(R.id.mpl1ba003b)
    RadioButton mpl1ba003b;
    @BindView(R.id.mpl1ba003c)
    RadioButton mpl1ba003c;
    @BindView(R.id.mpl1ba004)
    RadioGroup mpl1ba004;
    @BindView(R.id.mpl1ba004a)
    RadioButton mpl1ba004a;
    @BindView(R.id.mpl1ba004b)
    RadioButton mpl1ba004b;
    @BindView(R.id.mpl1ba005)
    RadioGroup mpl1ba005;
    @BindView(R.id.mpl1ba005a)
    RadioButton mpl1ba005a;
    @BindView(R.id.mpl1ba005b)
    RadioButton mpl1ba005b;
    @BindView(R.id.mpl1ba005c)
    RadioButton mpl1ba005c;
    @BindView(R.id.mpl1ba006a)
    RadioGroup mpl1ba006a;
    @BindView(R.id.mpl1ba006aa)
    RadioButton mpl1ba006aa;
    @BindView(R.id.mpl1ba006ab)
    RadioButton mpl1ba006ab;
    @BindView(R.id.mpl1ba006b)
    RadioGroup mpl1ba006b;
    @BindView(R.id.mpl1ba006ba)
    RadioButton mpl1ba006ba;
    @BindView(R.id.mpl1ba006bb)
    RadioButton mpl1ba006bb;
    @BindView(R.id.mpl1ba006c)
    RadioGroup mpl1ba006c;
    @BindView(R.id.mpl1ba006ca)
    RadioButton mpl1ba006ca;
    @BindView(R.id.mpl1ba006cb)
    RadioButton mpl1ba006cb;
    @BindView(R.id.mpl1ba006d)
    RadioGroup mpl1ba006d;
    @BindView(R.id.mpl1ba006da)
    RadioButton mpl1ba006da;
    @BindView(R.id.mpl1ba006db)
    RadioButton mpl1ba006db;
    @BindView(R.id.mpl1ba006e)
    RadioGroup mpl1ba006e;
    @BindView(R.id.mpl1ba006ea)
    RadioButton mpl1ba006ea;
    @BindView(R.id.mpl1ba006eb)
    RadioButton mpl1ba006eb;
    @BindView(R.id.mpl1ba006f)
    RadioGroup mpl1ba006f;
    @BindView(R.id.mpl1ba006fa)
    RadioButton mpl1ba006fa;
    @BindView(R.id.mpl1ba006fb)
    RadioButton mpl1ba006fb;
    @BindView(R.id.mpl1ba006g)
    RadioGroup mpl1ba006g;
    @BindView(R.id.mpl1ba006ga)
    RadioButton mpl1ba006ga;
    @BindView(R.id.mpl1ba006gb)
    RadioButton mpl1ba006gb;
    @BindView(R.id.mpl1ba006h)
    RadioGroup mpl1ba006h;
    @BindView(R.id.mpl1ba006ha)
    RadioButton mpl1ba006ha;
    @BindView(R.id.mpl1ba006hb)
    RadioButton mpl1ba006hb;
    @BindView(R.id.mpl1ba006i)
    RadioGroup mpl1ba006i;
    @BindView(R.id.mpl1ba006ia)
    RadioButton mpl1ba006ia;
    @BindView(R.id.mpl1ba006ib)
    RadioButton mpl1ba006ib;
    @BindView(R.id.mpl1ba006j)
    RadioGroup mpl1ba006j;
    @BindView(R.id.mpl1ba006ja)
    RadioButton mpl1ba006ja;
    @BindView(R.id.mpl1ba006jb)
    RadioButton mpl1ba006jb;
    @BindView(R.id.mpl1ba006k)
    RadioGroup mpl1ba006k;
    @BindView(R.id.mpl1ba006ka)
    RadioButton mpl1ba006ka;
    @BindView(R.id.mpl1ba006kb)
    RadioButton mpl1ba006kb;
    @BindView(R.id.mpl1ba006l)
    RadioGroup mpl1ba006l;
    @BindView(R.id.mpl1ba006la)
    RadioButton mpl1ba006la;
    @BindView(R.id.mpl1ba006lb)
    RadioButton mpl1ba006lb;
    @BindView(R.id.mpl1ba007a)
    RadioGroup mpl1ba007a;
    @BindView(R.id.mpl1ba007aa)
    RadioButton mpl1ba007aa;
    @BindView(R.id.mpl1ba007ab)
    RadioButton mpl1ba007ab;
    @BindView(R.id.mpl1ba007b)
    RadioGroup mpl1ba007b;
    @BindView(R.id.mpl1ba007ba)
    RadioButton mpl1ba007ba;
    @BindView(R.id.mpl1ba007bb)
    RadioButton mpl1ba007bb;
    @BindView(R.id.mpl1ba007c)
    RadioGroup mpl1ba007c;
    @BindView(R.id.mpl1ba007ca)
    RadioButton mpl1ba007ca;
    @BindView(R.id.mpl1ba007cb)
    RadioButton mpl1ba007cb;
    @BindView(R.id.mpl1ba007d)
    RadioGroup mpl1ba007d;
    @BindView(R.id.mpl1ba007da)
    RadioButton mpl1ba007da;
    @BindView(R.id.mpl1ba007db)
    RadioButton mpl1ba007db;
    @BindView(R.id.mpl1ba007e)
    RadioGroup mpl1ba007e;
    @BindView(R.id.mpl1ba007ea)
    RadioButton mpl1ba007ea;
    @BindView(R.id.mpl1ba007eb)
    RadioButton mpl1ba007eb;
    @BindView(R.id.mpl1ba007f)
    RadioGroup mpl1ba007f;
    @BindView(R.id.mpl1ba007fa)
    RadioButton mpl1ba007fa;
    @BindView(R.id.mpl1ba007fb)
    RadioButton mpl1ba007fb;
    @BindView(R.id.mpl1ba007g)
    RadioGroup mpl1ba007g;
    @BindView(R.id.mpl1ba007ga)
    RadioButton mpl1ba007ga;
    @BindView(R.id.mpl1ba007gb)
    RadioButton mpl1007gb;
    @BindView(R.id.mpl1ba007h)
    RadioGroup mpl1ba007h;
    @BindView(R.id.mpl1ba007ha)
    RadioButton mpl1ba007ha;
    @BindView(R.id.mpl1ba007hb)
    RadioButton mpl1ba007hb;
    @BindView(R.id.mpl1ba007i)
    RadioGroup mpl1ba007i;
    @BindView(R.id.mpl1ba007ia)
    RadioButton mpl1ba007ia;
    @BindView(R.id.mpl1ba007ib)
    RadioButton mpl1ba007ib;
    @BindView(R.id.mpl1ba007j)
    RadioGroup mpl1ba007j;
    @BindView(R.id.mpl1ba007ja)
    RadioButton mpl1ba007ja;
    @BindView(R.id.mpl1ba007jb)
    RadioButton mpl1ba007jb;
    @BindView(R.id.mpl1ba007k)
    RadioGroup mpl1ba007k;
    @BindView(R.id.mpl1ba007ka)
    RadioButton mpl1ba007ka;
    @BindView(R.id.mpl1ba007kb)
    RadioButton mpl1ba007kb;
    @BindView(R.id.mpl1ba007l)
    RadioGroup mpl1ba007l;
    @BindView(R.id.mpl1ba007la)
    RadioButton mpl1ba007la;
    @BindView(R.id.mpl1ba007lb)
    RadioButton mplba1007lb;
    @BindView(R.id.mpl1ba007m)
    RadioGroup mpl1ba007m;
    @BindView(R.id.mpl1ba007ma)
    RadioButton mpl1ba007ma;
    @BindView(R.id.mpl1ba007mb)
    RadioButton mpl1ba007mb;
    @BindView(R.id.mpl1ba007n)
    RadioGroup mpl1ba007n;
    @BindView(R.id.mpl1ba007na)
    RadioButton mpl1ba007na;
    @BindView(R.id.mpl1ba007nb)
    RadioButton mpl1ba007nb;
    @BindView(R.id.mpl1ba007o)
    RadioGroup mpl1ba007o;
    @BindView(R.id.mpl1ba007oa)
    RadioButton mpl1ba007oa;
    @BindView(R.id.mpl1ba007ob)
    RadioButton mpl1ba007ob;

    @BindView(R.id.fldGrp001)
    LinearLayout fldGrp001;
    @BindView(R.id.fldGrp003)
    LinearLayout fldGrp003;
    @BindView(R.id.fldGrp004)
    LinearLayout fldGrp004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);


        mpl1ba001b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001.setVisibility(View.GONE);
                    mpl1ba002.clearCheck();
                }
            }
        });

        mpl1ba003a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp003.setVisibility(View.GONE);
                    mpl1ba004.clearCheck();
                    mpl1ba005.clearCheck();
                } else {
                    fldGrp003.setVisibility(View.VISIBLE);
                }
            }
        });

        mpl1ba004b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp004.setVisibility(View.VISIBLE);
                } else {
                    fldGrp004.setVisibility(View.GONE);
                    mpl1ba005.clearCheck();
                }
            }
        });



    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, MainActivity.class);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();


                startActivity(new Intent(this, MainActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

       /* long updcount = db.addForm(AppMain.fc);

        AppMain.fc.setID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            AppMain.fc.setUID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            db.updateFormID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }*/
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

//        AppMain.VillageName = cravillage.getText().toString();

       /* SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        AppMain.fc = new FormsContract();

        AppMain.fc.setUserName(AppMain.username);
        AppMain.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        AppMain.fc.setFormDate((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());
        AppMain.fc.setTagId(sharedPref.getString("tagName", ""));*/
        JSONObject sa = new JSONObject();

       /* setGPS();

        AppMain.fc.setsA(String.valueOf(sa));*/

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        return true;

    }

   /* public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

//        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            AppMain.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            AppMain.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            AppMain.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            AppMain.fc.setGpsTime(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }

    }*/

}

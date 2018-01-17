package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.EnrolledContract;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.FormsContract;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    @BindView(R.id.mpl1a001)
    EditText mpl1a001;
    @BindView(R.id.mpl1a003)
    EditText mpl1a003;
    @BindView(R.id.mpl1a00301)
    RadioGroup mpl1a00301;
    @BindView(R.id.mpl1a00301a)
    RadioButton mpl1a00301a;
    @BindView(R.id.mpl1a00301b)
    RadioButton mpl1a00301b;
    @BindView(R.id.mpl1a00301c)
    RadioButton mpl1a00301c;
    @BindView(R.id.mpl1a00301d)
    RadioButton mpl1a00301d;
    @BindView(R.id.mpl1a00301e)
    RadioButton mpl1a00301e;
    @BindView(R.id.mpl1a00301f)
    RadioButton mpl1a00301f;
    @BindView(R.id.mpl1a00301g)
    RadioButton mpl1a00301g;
    @BindView(R.id.mpl1a00301h)
    RadioButton mpl1a00301h;
    @BindView(R.id.mpl1a00301i)
    RadioButton mpl1a00301i;
    @BindView(R.id.mpl1a00301j)
    RadioButton mpl1a00301j;
    @BindView(R.id.mpl1a00301k)
    RadioButton mpl1a00301k;
    @BindView(R.id.mpl1a00301l)
    RadioButton mpl1a00301l;
    @BindView(R.id.mpl1a002)
    Spinner mpl1a002;
    @BindView(R.id.mpl1a004)
    RadioGroup mpl1a004;
    @BindView(R.id.mpl1a004a)
    RadioButton mpl1a004a;
    @BindView(R.id.mpl1a004b)
    RadioButton mpl1a004b;
    @BindView(R.id.mpl1a004c)
    RadioButton mpl1a004c;
    @BindView(R.id.fldGrp005)
    LinearLayout fldGrp005;
    @BindView(R.id.mpl1a005)
    EditText mpl1a005;
    @BindView(R.id.mpl1a006)
    EditText mpl1a006;
    /*@BindView(R.id.mpl1a007)
    EditText mpl1a007;
    @BindView(R.id.mpl1a008)
    EditText mpl1a008;*/
    //  @BindView(R.id.mpl1a008a)
    //EditText mpl1a008a;
    @BindView(R.id.mpl1a009)
    RadioGroup mpl1a009;
    @BindView(R.id.mpl1a009a)
    RadioButton mpl1a009a;
    @BindView(R.id.mpl1a009b)
    RadioButton mpl1a009b;
    @BindView(R.id.mpl1a009c)
    RadioButton mpl1a009c;
    @BindView(R.id.mpl1a009d)
    RadioButton mpl1a009d;
    /*@BindView(R.id.mpl1aLHWs)
    Spinner mpl1aLHWs;*/
    @BindView(R.id.fldGrpmpl1a002)
    LinearLayout fldGrpmpl1a002;
    @BindView(R.id.checkParticipants)
    Button checkParticipants;

    //List<String> LHWsName;
    DatabaseHelper db;
    //HashMap<String, String> LHWs;

    /*List<String> ParticipantsName;
    HashMap<String, EnrolledContract> ParticipantsMap;*/
    Boolean flag = false;
    Boolean end = false;
    //Boolean checked = false;

    Collection<EnrolledContract> Econtract;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);


       /* MainApp.ParticipantsName = new ArrayList<>();

        MainApp.ParticipantsMap = new HashMap<>();*/

        if (MainApp.checked) {
            mpl1a002.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.ParticipantsName));
            fldGrpmpl1a002.setVisibility(View.VISIBLE);
            mpl1a001.setText(MainApp.hhno);
            mpl1a001.setEnabled(false);
            checkParticipants.setEnabled(false);
        } else {

            mpl1a001.setText(null);
            mpl1a001.setEnabled(true);
            checkParticipants.setEnabled(true);
        }

        mpl1a004c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp005.setVisibility(View.VISIBLE);
                } else {
                    fldGrp005.setVisibility(View.GONE);
                    mpl1a005.setText(null);
                }
            }
        });

//        Fill spinners



        /*LHWsName = new ArrayList<>();

        LHWs = new HashMap<>();*/





        mpl1a001.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainApp.checked = false;

                if (!MainApp.checked) {
                    fldGrpmpl1a002.setVisibility(View.GONE);
                    mpl1a001.setError("Please check household number first");

                } else {
                    MainApp.checked = true;
                    mpl1a001.setError(null);
                    //MainApp.hhno = mpl1a001.getText().toString();
                }


            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        mpl1a002.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (mpl1a002.getSelectedItemPosition()!=0){

                    mpl1a003.setText(MainApp.ParticipantsMap.get(mpl1a002.getSelectedItem().toString())
                            .getLUID());
                    MainApp.position = i;

                }else {
                    mpl1a003.setText(null);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @OnClick(R.id.checkParticipants)
    void onCheckParticipantsClick() {
        //TODO implement

        MainApp.checked = true;
        db = new DatabaseHelper(this);

        if (!mpl1a001.getText().toString().isEmpty()) {

            mpl1a001.setError(null);

            MainApp.ParticipantsName.add("Select Participant..");

            Econtract = db.getEnrollByHousehold(MainApp.curCluster, MainApp.selectedLhw, mpl1a001.getText().toString());

            Toast.makeText(this,"Eligible Women found = " + Econtract.size(),Toast.LENGTH_SHORT).show();

            MainApp.totalWmCount = Econtract.size();

            if (Econtract.size() != 0) {

                //MainApp.Eparticipant = new ArrayList<>();

                for (EnrolledContract ec : Econtract) {

                    MainApp.ParticipantsName.add(ec.getWomen_name().toUpperCase());
                    MainApp.ParticipantsMap.put(ec.getWomen_name().toUpperCase(), new EnrolledContract(ec));

                    MainApp.Eparticipant.add(new EnrolledContract(ec));
                }

                Toast.makeText(this, "Participant Found", Toast.LENGTH_LONG).show();


                fldGrpmpl1a002.setVisibility(View.VISIBLE);

                flag = true;

                mpl1a002.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.ParticipantsName));


            } else {

                fldGrpmpl1a002.setVisibility(View.GONE);

                flag = false;

                Toast.makeText(this, "No Participant Found", Toast.LENGTH_LONG).show();
            }
        } else {
            mpl1a001.setError("This data is Required!");
        }
    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        end = true;
        //if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        //}


        //MainApp.endActivity(this, this);
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

                //MainApp.wmCount++;

                if (mpl1a004a.isChecked()) {
                    startActivity(new Intent(this, SectionBActivity.class));

                } else if (mpl1a004b.isChecked()) {

                    startActivity(new Intent(this, SectionCActivity.class));

                } else {
                    startActivity(new Intent(this, SectionDActivity.class));
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormsUID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

//        AppMain.VillageName = cravillage.getText().toString();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fc = new FormsContract();

        MainApp.fc.setUser(MainApp.username);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setFormDate((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());
        MainApp.fc.setTagId(sharedPref.getString("tagName", ""));

        MainApp.fc.setClustercode(MainApp.curCluster);
        MainApp.fc.setLhwCode(MainApp.selectedLhw);
        MainApp.fc.setHousehold(mpl1a001.getText().toString());

        if (mpl1a002.getSelectedItemPosition() != 0) {
            MainApp.fc.setSno(MainApp.ParticipantsMap.get(mpl1a002.getSelectedItem()).getSno());
            MainApp.fc.setLUID(MainApp.ParticipantsMap.get(mpl1a002.getSelectedItem()).getLUID());
        }

        JSONObject sa = new JSONObject();

        sa.put("mpl1a001", mpl1a001.getText().toString());
        sa.put("mpl1a002", mpl1a002.getSelectedItem().toString());
        sa.put("mpl1a003", mpl1a003.getText().toString());
        sa.put("mpl1a00301", mpl1a00301a.isChecked() ? "1"
                : mpl1a00301b.isChecked() ? "2"
                : mpl1a00301c.isChecked() ? "3"
                : mpl1a00301d.isChecked() ? "4"
                : mpl1a00301e.isChecked() ? "5"
                : mpl1a00301f.isChecked() ? "6"
                : mpl1a00301g.isChecked() ? "7"
                : mpl1a00301h.isChecked() ? "8"
                : mpl1a00301i.isChecked() ? "9"
                : mpl1a00301j.isChecked() ? "10"
                : mpl1a00301k.isChecked() ? "11"
                : mpl1a00301l.isChecked() ? "12" : "0");

        sa.put("mpl1a004", mpl1a004a.isChecked() ? "1" : mpl1a004b.isChecked() ? "2" : mpl1a004c.isChecked() ? "3" : "0");
        sa.put("mpl1a005", mpl1a005.getText().toString());
        sa.put("mpl1a006", mpl1a006.getText().toString());
        //sa.put("mpl1a008a", mpl1a008a.getText().toString());
        sa.put("mpl1a009", mpl1a009a.isChecked() ? "1" : mpl1a009b.isChecked() ? "2" : mpl1a009c.isChecked() ? "3" :
                mpl1a009d.isChecked() ? "4" : "0");
        sa.put("appver", MainApp.versionName + "." + MainApp.versionCode);
        MainApp.hhno = mpl1a001.getText().toString();

        setGPS();

        MainApp.fc.setsA(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    public boolean ValidateForm() {

        // =================== mpl1a001 ====================
        if (mpl1a001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a001), Toast.LENGTH_SHORT).show();
            mpl1a001.setError("This data is required");
            mpl1a001.requestFocus();
            Log.d(TAG, " mpl1a001 :empty ");
            return false;
        } else {
            mpl1a001.setError(null);
        }

        if (Integer.valueOf(mpl1a001.getText().toString().isEmpty() ? "0" : mpl1a001.getText().toString()) == 0) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a001), Toast.LENGTH_SHORT).show();
            mpl1a001.setError("Invalid: Data cannot be Zero");
            mpl1a001.requestFocus();
            Log.i(TAG, "mpl1a001: Invalid data is 0");
            return false;
        } else {
            mpl1a001.setError(null);
        }

        if (mpl1a002.getSelectedItem().equals("Select Participant..")) {

            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a002), Toast.LENGTH_SHORT).show();

            ((TextView) mpl1a002.getSelectedView()).setError("This Data is Required");


            Log.i(TAG, "mpl1a002: This Data is Required!");

            return false;

        } else {

            ((TextView) mpl1a002.getSelectedView()).setError(null);

        }

        // =================== mpl1a003 ====================
        /*if (mpl1a003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a003), Toast.LENGTH_SHORT).show();
            mpl1a003.setError("This data is required");
            mpl1a003.requestFocus();
            Log.d(TAG, " mpl1a003 :empty ");
            return false;
        } else {
            mpl1a003.setError(null);
        }*/

/*        if (Integer.valueOf(mpl1a003.getText().toString().isEmpty() ? "0" : mpl1a003.getText().toString()) == 0) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a003), Toast.LENGTH_SHORT).show();
            mpl1a003.setError("Invalid: Data cannot be Zero");
            Log.i(TAG, "mpl1a003: Invalid data is 0");
            return false;
        } else {
            mpl1a003.setError(null);
        }*/

        // =================== mpl1a002 ====================
        /*if (mpl1a002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a002), Toast.LENGTH_SHORT).show();
            mpl1a002.setError("This data is required");
            Log.d(TAG, " mpl1a002 :empty ");
            return false;
        } else {
            mpl1a002.setError(null);
        }*/

        if (mpl1a00301.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a00301), Toast.LENGTH_SHORT).show();
            mpl1a00301a.setError("This data is Required!");

            mpl1a00301a.setFocusableInTouchMode(true);
            mpl1a00301a.setFocusable(true);
            mpl1a00301a.requestFocus();
            Log.i(TAG, "mpl1a00301: This Data is Required!");
            return false;
        } else {
            mpl1a00301a.setError(null);
        }

        //=================== mpl1a004 ==============
        if (mpl1a004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a004), Toast.LENGTH_SHORT).show();
            mpl1a004c.setError("This data is Required!");

            mpl1a004c.setFocusableInTouchMode(true);
            mpl1a004c.setFocusable(true);
            mpl1a004c.requestFocus();
            Log.i(TAG, "mpl1a004: This Data is Required!");
            return false;
        } else {
            mpl1a004c.setError(null);
        }

        if (mpl1a004c.isChecked()) {
            // =================== mpl1a005 ====================
            if (mpl1a005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a005), Toast.LENGTH_SHORT).show();
                mpl1a005.setError("This data is required");
                mpl1a005.requestFocus();
                Log.d(TAG, " mpl1a005 :empty ");
                return false;
            } else {
                mpl1a005.setError(null);
            }

            if (Integer.valueOf(mpl1a005.getText().toString().isEmpty() ? "0" : mpl1a005.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a005), Toast.LENGTH_SHORT).show();
                mpl1a005.setError("Invalid: Data cannot be Zero");
                mpl1a005.requestFocus();
                Log.i(TAG, "mpl1a005: Invalid data is 0");
                return false;
            } else {
                mpl1a005.setError(null);
            }
        }

        // =================== mpl1a006 ====================
        if (mpl1a006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a006), Toast.LENGTH_SHORT).show();
            mpl1a006.setError("This data is required");
            mpl1a006.requestFocus();
            Log.d(TAG, " mpl1a006 :empty ");
            return false;
        } else {
            mpl1a006.setError(null);
        }

        // =================== mpl1a007 ====================
        /*if (mpl1a007.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a007), Toast.LENGTH_SHORT).show();
            mpl1a007.setError("This data is required");
            Log.d(TAG, " mpl1a007 :empty ");
            return false;
        } else {
            mpl1a007.setError(null);
        }*/

        // =================== mpl1a007 ====================
        /*if (mpl1a008a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a008a), Toast.LENGTH_SHORT).show();
            mpl1a008a.setError("This data is required");
            Log.d(TAG, " mpl1a008a :empty ");
            return false;
        } else {
            mpl1a008a.setError(null);
        }
*/
        // =================== mpl1a008 ====================
        /*if (mpl1a008.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a008), Toast.LENGTH_SHORT).show();
            mpl1a008.setError("This data is required");
            Log.d(TAG, " mpl1a008 :empty ");
            return false;
        } else {
            mpl1a008.setError(null);
        }
*/
        //=================== mpl1a009 ==============
        if (mpl1a009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a009), Toast.LENGTH_SHORT).show();
            mpl1a009a.setError("This data is Required!");
            mpl1a009a.setFocusableInTouchMode(true);
            mpl1a009a.setFocusable(true);
            mpl1a009a.requestFocus();

            Log.i(TAG, "mpl1a009: This Data is Required!");
            return false;
        } else {
            mpl1a009a.setError(null);
        }


        return true;

    }

    public void setGPS() {
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

            MainApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            MainApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            MainApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            MainApp.fc.setGpsTime(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }

    }

    @Override
    public void onBackPressed() {
        if (MainApp.checked) {
            Toast.makeText(getApplicationContext(), "You can not go back",
                    Toast.LENGTH_SHORT).show();

        } else {
            MainApp.ParticipantsMap.clear();
            MainApp.ParticipantsName.clear();
            startActivity(new Intent(this, MainActivity.class));

        }
    }


}
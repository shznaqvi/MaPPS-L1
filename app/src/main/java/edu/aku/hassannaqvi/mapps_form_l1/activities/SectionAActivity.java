package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.contracts.FormsContract;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();

    @BindView(R.id.mpl1a001)
    EditText mpl1a001;
    @BindView(R.id.mpl1a002)
    EditText mpl1a002;
    @BindView(R.id.mpl1a003)
    EditText mpl1a003;
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
    @BindView(R.id.mpl1a007)
    EditText mpl1a007;
    @BindView(R.id.mpl1a008)
    EditText mpl1a008;
    //  @BindView(R.id.mpl1a008a)
    EditText mpl1a008a;
    @BindView(R.id.mpl1a009)
    RadioGroup mpl1a009;
    @BindView(R.id.mpl1a009a)
    RadioButton mpl1a009a;
    @BindView(R.id.mpl1a009b)
    RadioButton mpl1a009b;
    @BindView(R.id.mpl1a009c)
    RadioButton mpl1a009c;
    @BindView(R.id.mpl1aLHWs)
    Spinner mpl1aLHWs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);


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

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
*/

        MainApp.endActivity(this, this);
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
        JSONObject sa = new JSONObject();

        sa.put("mpl1a001", mpl1a001.getText().toString());
        sa.put("mpl1a002", mpl1a002.getText().toString());
        sa.put("mpl1a003", mpl1a003.getText().toString());
        sa.put("mpl1a004", mpl1a004a.isChecked() ? "1" : mpl1a004b.isChecked() ? "2" : mpl1a004c.isChecked() ? "3" : "0");
        sa.put("mpl1a005", mpl1a005.getText().toString());
        sa.put("mpl1a006", mpl1a006.getText().toString());
        sa.put("mpl1a007", mpl1a007.getText().toString());
        sa.put("mpl1a008a", mpl1a008a.getText().toString());
        sa.put("mpl1a008", mpl1a008.getText().toString());
        sa.put("mpl1a009", mpl1a009a.isChecked() ? "1" : mpl1a009b.isChecked() ? "2" : mpl1a009c.isChecked() ? "3" : "0");

        setGPS();

        MainApp.fc.setsA(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        // =================== mpl1a001 ====================
        if (mpl1a001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a001), Toast.LENGTH_SHORT).show();
            mpl1a001.setError("This data is required");
            Log.d(TAG, " mpl1a001 :empty ");
            return false;
        } else {
            mpl1a001.setError(null);
        }

        if (Integer.valueOf(mpl1a001.getText().toString()) == 0) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a001), Toast.LENGTH_SHORT).show();
            mpl1a001.setError("Invalid: Data cannot be Zero");
            Log.i(TAG, "mpl1a001: Invalid data is 0");
            return false;
        } else {
            mpl1a001.setError(null);
        }

        // =================== mpl1a002 ====================
        if (mpl1a002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a002), Toast.LENGTH_SHORT).show();
            mpl1a002.setError("This data is required");
            Log.d(TAG, " mpl1a002 :empty ");
            return false;
        } else {
            mpl1a002.setError(null);
        }

        if (Integer.valueOf(mpl1a002.getText().toString()) == 0) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a002), Toast.LENGTH_SHORT).show();
            mpl1a002.setError("Invalid: Data cannot be Zero");
            Log.i(TAG, "mpl1a002: Invalid data is 0");
            return false;
        } else {
            mpl1a002.setError(null);
        }

        // =================== mpl1a003 ====================
        if (mpl1a003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a003), Toast.LENGTH_SHORT).show();
            mpl1a003.setError("This data is required");
            Log.d(TAG, " mpl1a003 :empty ");
            return false;
        } else {
            mpl1a003.setError(null);
        }

        //=================== mpl1a004 ==============
        if (mpl1a004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a004), Toast.LENGTH_SHORT).show();
            mpl1a004c.setError("This data is Required!");
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
                Log.d(TAG, " mpl1a005 :empty ");
                return false;
            } else {
                mpl1a005.setError(null);
            }

            if (Integer.valueOf(mpl1a005.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1a005), Toast.LENGTH_SHORT).show();
                mpl1a005.setError("Invalid: Data cannot be Zero");
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
            Log.d(TAG, " mpl1a006 :empty ");
            return false;
        } else {
            mpl1a006.setError(null);
        }

        // =================== mpl1a007 ====================
        if (mpl1a007.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a007), Toast.LENGTH_SHORT).show();
            mpl1a007.setError("This data is required");
            Log.d(TAG, " mpl1a007 :empty ");
            return false;
        } else {
            mpl1a007.setError(null);
        }

        // =================== mpl1a007 ====================
        if (mpl1a008a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a008a), Toast.LENGTH_SHORT).show();
            mpl1a008a.setError("This data is required");
            Log.d(TAG, " mpl1a008a :empty ");
            return false;
        } else {
            mpl1a008a.setError(null);
        }

        // =================== mpl1a008 ====================
        if (mpl1a008.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a008), Toast.LENGTH_SHORT).show();
            mpl1a008.setError("This data is required");
            Log.d(TAG, " mpl1a008 :empty ");
            return false;
        } else {
            mpl1a008.setError(null);
        }

        //=================== mpl1a009 ==============
        if (mpl1a009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1a009), Toast.LENGTH_SHORT).show();
            mpl1a009c.setError("This data is Required!");
            Log.i(TAG, "mpl1a009: This Data is Required!");
            return false;
        } else {
            mpl1a009c.setError(null);
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


}
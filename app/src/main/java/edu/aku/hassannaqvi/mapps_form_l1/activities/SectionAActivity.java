package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;

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
    @BindView(R.id.mpl1a009)
    RadioGroup mpl1a009;
    @BindView(R.id.mpl1a009a)
    RadioButton mpl1a009a;
    @BindView(R.id.mpl1a009b)
    RadioButton mpl1a009b;
    @BindView(R.id.mpl1a009c)
    RadioButton mpl1a009c;

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
package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
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

public class SectionFActivity extends Activity {

    @BindView(R.id.mpl1d001)
    RadioGroup mpl1d001;
    @BindView(R.id.mpl1d001a)
    RadioButton mpl1d001a;
    @BindView(R.id.mpl1d001b)
    RadioButton mpl1d001b;
    @BindView(R.id.fldGrp001)
    LinearLayout fldGrp001;
    @BindView(R.id.mpl1d002)
    EditText mpl1d002;
    @BindView(R.id.mpl1d003)
    EditText mpl1d003;
    @BindView(R.id.mpl1d004)
    EditText mpl1d004;
    @BindView(R.id.mpl1d005)
    EditText mpl1d005;
    @BindView(R.id.mpl1d006)
    RadioGroup mpl1d006;
    @BindView(R.id.mpl1d006a)
    RadioButton mpl1d006a;
    @BindView(R.id.mpl1d006b)
    RadioButton mpl1d006b;
    @BindView(R.id.mpl1d006c)
    RadioButton mpl1d006c;
    @BindView(R.id.mpl1d006d)
    RadioButton mpl1d006d;
    @BindView(R.id.mpl1d006e)
    RadioButton mpl1d006e;
    @BindView(R.id.mpl1d006x)
    EditText mpl1d006x;
    @BindView(R.id.fldGrp006)
    LinearLayout fldGrp006;
    @BindView(R.id.mpl1d007a)
    CheckBox mpl1d007a;
    @BindView(R.id.mpl1d007b)
    CheckBox mpl1d007b;
    @BindView(R.id.mpl1d007c)
    CheckBox mpl1d007c;
    @BindView(R.id.mpl1d007d)
    CheckBox mpl1d007d;
    @BindView(R.id.mpl1d007e)
    CheckBox mpl1d007e;
    @BindView(R.id.mpl1d007f)
    CheckBox mpl1d007f;
    @BindView(R.id.mpl1d007g)
    CheckBox mpl1d007g;
    @BindView(R.id.mpl1d00788)
    CheckBox mpl1d00788;
    @BindView(R.id.mpl1d00788x)
    EditText mpl1d00788x;
    @BindView(R.id.mpl1d008)
    RadioGroup mpl1d008;
    @BindView(R.id.mpl1d008a)
    RadioButton mpl1d008a;
    @BindView(R.id.mpl1d008b)
    RadioButton mpl1d008b;
    @BindView(R.id.mpl1d009)
    EditText mpl1d009;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

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
                Intent endSec = new Intent(this, EndingActivity.class);
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


                startActivity(new Intent(this, EndingActivity.class));

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

   
}


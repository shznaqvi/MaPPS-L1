package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.CheckBox;
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

public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();

    @BindView(R.id.mpl1c001)
    RadioGroup mpl1c001;
    @BindView(R.id.mpl1c001a)
    RadioButton mpl1c001a;
    @BindView(R.id.mpl1c001b)
    RadioButton mpl1c001b;
    @BindView(R.id.mpl1c001c)
    RadioButton mpl1c001c;
    @BindView(R.id.mpl1c001d)
    RadioButton mpl1c001d;
    @BindView(R.id.fldGrp001)
    LinearLayout fldGrp001;
    @BindView(R.id.mpl1c002)
    RadioGroup mpl1c002;
    @BindView(R.id.mpl1c002a)
    RadioButton mpl1c002a;
    @BindView(R.id.mpl1c002b)
    RadioButton mpl1c002b;
    @BindView(R.id.mpl1c002c)
    RadioButton mpl1c002c;
    @BindView(R.id.fldGrp002)
    LinearLayout fldGrp002;
    @BindView(R.id.mpl1c003)
    EditText mpl1c003;
    @BindView(R.id.mpl1c004)
    EditText mpl1c004;
    @BindView(R.id.mpl1c005)
    EditText mpl1c005;
    @BindView(R.id.mpl1c006)
    EditText mpl1c006;
    @BindView(R.id.mpl1c007)
    RadioGroup mpl1c007;
    @BindView(R.id.mpl1c007a)
    RadioButton mpl1c007a;
    @BindView(R.id.mpl1c007b)
    RadioButton mpl1c007b;
    @BindView(R.id.mpl1c007c)
    RadioButton mpl1c007c;
    @BindView(R.id.mpl1c007d)
    RadioButton mpl1c007d;
    @BindView(R.id.mpl1c007e)
    RadioButton mpl1c007e;
    @BindView(R.id.mpl1c007x)
    EditText mpl1c007x;
    @BindView(R.id.fldGrp007)
    LinearLayout fldGrp007;
    @BindView(R.id.mpl1c008a)
    CheckBox mpl1c008a;
    @BindView(R.id.mpl1c008b)
    CheckBox mpl1c008b;
    @BindView(R.id.mpl1c008c)
    CheckBox mpl1c008c;
    @BindView(R.id.mpl1c008d)
    CheckBox mpl1c008d;
    @BindView(R.id.mpl1c008e)
    CheckBox mpl1c008e;
    @BindView(R.id.mpl1c008f)
    CheckBox mpl1c008f;
    @BindView(R.id.mpl1c008g)
    CheckBox mpl1c008g;
    @BindView(R.id.mpl1c00888)
    CheckBox mpl1c00888;
    @BindView(R.id.mpl1c00888x)
    EditText mpl1c00888x;
    @BindView(R.id.mpl1c009)
    RadioGroup mpl1c009;
    @BindView(R.id.mpl1c009a)
    RadioButton mpl1c009a;
    @BindView(R.id.mpl1c009b)
    RadioButton mpl1c009b;
    @BindView(R.id.mpl1c010)
    EditText mpl1c010;
    @BindView(R.id.mpl1c011)
    RadioGroup mpl1c011;
    @BindView(R.id.mpl1c011a)
    RadioButton mpl1c011a;
    @BindView(R.id.mpl1c011b)
    RadioButton mpl1c011b;
    @BindView(R.id.mpl1c012a)
    CheckBox mpl1c012a;
    @BindView(R.id.mpl1c012b)
    CheckBox mpl1c012b;
    @BindView(R.id.mpl1c012c)
    CheckBox mpl1c012c;
    @BindView(R.id.mpl1c01288)
    CheckBox mpl1c01288;
    @BindView(R.id.mpl1c01288x)
    EditText mpl1c01288x;
    @BindView(R.id.mpl1c013)
    RadioGroup mpl1c013;
    @BindView(R.id.mpl1c013a)
    RadioButton mpl1c013a;
    @BindView(R.id.mpl1c013b)
    RadioButton mpl1c013b;
    @BindView(R.id.mpl1c013c)
    RadioButton mpl1c013c;
    @BindView(R.id.mpl1c013d)
    RadioButton mpl1c013d;
    @BindView(R.id.mpl1c014)
    EditText mpl1c014;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        mpl1c001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c001d.isChecked()) {
                    fldGrp001.setVisibility(View.GONE);
                    mpl1c002.clearCheck();
                    mpl1c003.setText(null);
                    mpl1c004.setText(null);
                    mpl1c005.setText(null);
                    mpl1c006.setText(null);
                    mpl1c007.clearCheck();
                    mpl1c007x.setText(null);
                    mpl1c008a.setChecked(false);
                    mpl1c008b.setChecked(false);
                    mpl1c008c.setChecked(false);
                    mpl1c008d.setChecked(false);
                    mpl1c008e.setChecked(false);
                    mpl1c008f.setChecked(false);
                    mpl1c008g.setChecked(false);
                    mpl1c00888.setChecked(false);
                    mpl1c00888x.setText(null);
                    mpl1c009.clearCheck();
                    mpl1c010.setText(null);
                    mpl1c011.clearCheck();
                    mpl1c012a.setChecked(false);
                    mpl1c012b.setChecked(false);
                    mpl1c012c.setChecked(false);
                    mpl1c01288.setChecked(false);
                    mpl1c01288x.setText(null);
                    mpl1c013.clearCheck();
                    mpl1c014.setText(null);

                } else {
                    fldGrp001.setVisibility(View.VISIBLE);

                }
            }
        });

        mpl1c002.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c002c.isChecked()) {
                    fldGrp002.setVisibility(View.GONE);
                    mpl1c003.setText(null);
                    mpl1c004.setText(null);
                    mpl1c005.setText(null);
                    mpl1c006.setText(null);
                    mpl1c007.clearCheck();
                    mpl1c007x.setText(null);
                    mpl1c008a.setChecked(false);
                    mpl1c008b.setChecked(false);
                    mpl1c008c.setChecked(false);
                    mpl1c008d.setChecked(false);
                    mpl1c008e.setChecked(false);
                    mpl1c008f.setChecked(false);
                    mpl1c008g.setChecked(false);
                    mpl1c00888.setChecked(false);
                    mpl1c00888x.setText(null);
                    mpl1c009.clearCheck();
                    mpl1c010.setText(null);

                } else {
                    fldGrp002.setVisibility(View.VISIBLE);

                }
            }
        });

        mpl1c007c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1c007x.setVisibility(View.VISIBLE);
                } else {
                    mpl1c007x.setVisibility(View.GONE);
                    mpl1c008a.setChecked(false);
                    mpl1c008b.setChecked(false);
                    mpl1c008c.setChecked(false);
                    mpl1c008d.setChecked(false);
                    mpl1c008e.setChecked(false);
                    mpl1c008f.setChecked(false);
                    mpl1c008g.setChecked(false);
                    mpl1c00888.setChecked(false);
                    mpl1c00888x.setText(null);
                }
            }
        });

        mpl1c007e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp007.setVisibility(View.VISIBLE);
                } else {
                    fldGrp007.setVisibility(View.GONE);
                    mpl1c007x.setText(null);
                }
            }
        });

        mpl1c00888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1c00888x.setVisibility(View.VISIBLE);
                } else {
                    mpl1c00888x.setVisibility(View.GONE);
                    mpl1c00888x.setText(null);
                }
            }
        });

        mpl1c01288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1c01288x.setVisibility(View.VISIBLE);
                } else {
                    mpl1c01288x.setVisibility(View.GONE);
                    mpl1c01288x.setText(null);
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


                startActivity(new Intent(this, SectionFActivity.class));

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

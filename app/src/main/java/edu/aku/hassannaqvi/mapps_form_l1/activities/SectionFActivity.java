package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
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
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

public class SectionFActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();

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

        mpl1d001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1d001b.isChecked()) {
                    fldGrp001.setVisibility(View.GONE);
                    mpl1d002.setText(null);
                    mpl1d003.setText(null);
                    mpl1d004.setText(null);
                    mpl1d005.setText(null);
                    mpl1d006.clearCheck();
                    mpl1d006x.setText(null);
                    mpl1d007a.setChecked(false);
                    mpl1d007b.setChecked(false);
                    mpl1d007c.setChecked(false);
                    mpl1d007d.setChecked(false);
                    mpl1d007e.setChecked(false);
                    mpl1d007f.setChecked(false);
                    mpl1d007g.setChecked(false);
                    mpl1d00788.setChecked(false);
                    mpl1d00788x.setText(null);
                    mpl1d008.clearCheck();
                    mpl1d009.setText(null);

                } else {
                    fldGrp001.setVisibility(View.VISIBLE);

                }
            }
        });

        mpl1d006c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1d006x.setVisibility(View.VISIBLE);
                } else {
                    mpl1d006x.setVisibility(View.GONE);
                    mpl1d006x.setText(null);
                }
            }
        });


        mpl1d006.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1d006e.isChecked()) {
                    fldGrp006.setVisibility(View.VISIBLE);
                } else {
                    fldGrp006.setVisibility(View.GONE);
                    mpl1d006x.setText(null);
                    mpl1d007a.setChecked(false);
                    mpl1d007b.setChecked(false);
                    mpl1d007c.setChecked(false);
                    mpl1d007d.setChecked(false);
                    mpl1d007e.setChecked(false);
                    mpl1d007f.setChecked(false);
                    mpl1d007g.setChecked(false);
                    mpl1d00788.setChecked(false);
                    mpl1d00788x.setText(null);
                }
            }
        });

        mpl1d00788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1d00788x.setVisibility(View.VISIBLE);
                } else {
                    mpl1d00788x.setVisibility(View.GONE);
                    mpl1d00788x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        /*Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

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


                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", true);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sf = new JSONObject();

        sf.put("mpl1d001", mpl1d001a.isChecked() ? "1" : mpl1d001b.isChecked() ? "2" : "0");
        sf.put("mpl1d002", mpl1d002.getText().toString());
        sf.put("mpl1d003", mpl1d003.getText().toString());
        sf.put("mpl1d004", mpl1d004.getText().toString());
        sf.put("mpl1d005", mpl1d005.getText().toString());
        sf.put("mpl1d006", mpl1d006a.isChecked() ? "1" : mpl1d006b.isChecked() ? "2" : mpl1d006c.isChecked() ? "3" : mpl1d006d.isChecked() ? "4" : mpl1d006e.isChecked() ? "5" : "0");
        sf.put("mpl1d006x", mpl1d006x.getText().toString());
        sf.put("mpl1d007a", mpl1d007a.isChecked() ? "1" : "0");
        sf.put("mpl1d007b", mpl1d007b.isChecked() ? "2" : "0");
        sf.put("mpl1d007c", mpl1d007c.isChecked() ? "3" : "0");
        sf.put("mpl1d007d", mpl1d007d.isChecked() ? "4" : "0");
        sf.put("mpl1d007e", mpl1d007e.isChecked() ? "5" : "0");
        sf.put("mpl1d007f", mpl1d007f.isChecked() ? "6" : "0");
        sf.put("mpl1d007g", mpl1d007g.isChecked() ? "7" : "0");
        sf.put("mpl1d00788", mpl1d00788.isChecked() ? "88" : "0");
        sf.put("mpl1d00788x", mpl1d00788x.getText().toString());
        sf.put("mpl1d008", mpl1d008a.isChecked() ? "1" : mpl1d008b.isChecked() ? "2" : "0");
        sf.put("mpl1d009", mpl1d009.getText().toString());


        MainApp.fc.setsF(String.valueOf(sf));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== mpl1d001 ==============
        if (mpl1d001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1d001), Toast.LENGTH_SHORT).show();
            mpl1d001b.setError("This data is Required!");
            Log.i(TAG, "mpl1d001: This Data is Required!");
            return false;
        } else {
            mpl1d001b.setError(null);
        }

        if (mpl1d001a.isChecked()) {
            //=================== mpl1d002 ==============
            if (mpl1d002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c002), Toast.LENGTH_SHORT).show();
                mpl1d002.setError("This data is required");
                Log.d(TAG, " mpl1d002 :empty ");
                return false;
            } else {
                mpl1d002.setError(null);
            }

            if (Integer.valueOf(mpl1d002.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1d002), Toast.LENGTH_SHORT).show();
                mpl1d002.setError("Invalid: Data cannot be Zero");
                Log.i(TAG, "mpl1d002: Invalid data is 0");
                return false;
            } else {
                mpl1d002.setError(null);
            }

            //=================== mpl1d003 ==============
            if (mpl1d003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c003), Toast.LENGTH_SHORT).show();
                mpl1d003.setError("This data is required");
                Log.d(TAG, " mpl1d003 :empty ");
                return false;
            } else {
                mpl1d003.setError(null);
            }

            if (Integer.valueOf(mpl1d003.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1d003), Toast.LENGTH_SHORT).show();
                mpl1d003.setError("Invalid: Data cannot be Zero");
                Log.i(TAG, "mpl1d003: Invalid data is 0");
                return false;
            } else {
                mpl1d003.setError(null);
            }

            //=================== mpl1d004 ==============
            if (mpl1d004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c004), Toast.LENGTH_SHORT).show();
                mpl1d004.setError("This data is required");
                Log.d(TAG, " mpl1d004 :empty ");
                return false;
            } else {
                mpl1d004.setError(null);
            }

            if (Integer.valueOf(mpl1d004.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1d004), Toast.LENGTH_SHORT).show();
                mpl1d004.setError("Invalid: Data cannot be Zero");
                Log.i(TAG, "mpl1d004: Invalid data is 0");
                return false;
            } else {
                mpl1d004.setError(null);
            }

            //=================== mpl1d005 ==============
            if (mpl1d005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c005), Toast.LENGTH_SHORT).show();
                mpl1d005.setError("This data is required");
                Log.d(TAG, " mpl1d005 :empty ");
                return false;
            } else {
                mpl1d005.setError(null);
            }

            if (Integer.valueOf(mpl1d005.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1d005), Toast.LENGTH_SHORT).show();
                mpl1d005.setError("Invalid: Data cannot be Zero");
                Log.i(TAG, "mpl1d005: Invalid data is 0");
                return false;
            } else {
                mpl1d005.setError(null);
            }


            //=================== mpl1d006 ==============
            if (mpl1d006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1d006), Toast.LENGTH_SHORT).show();
                mpl1d006e.setError("This data is Required!");
                Log.i(TAG, "mpl1d006: This Data is Required!");
                return false;
            } else {
                mpl1d006e.setError(null);
            }

            if (mpl1d006c.isChecked() && mpl1d006x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c006) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1d006x.setError("This data is required");
                Log.d(TAG, " mpl1d006x :empty ");
                return false;
            } else {
                mpl1d006x.setError(null);
            }

            if (mpl1d006e.isChecked()) {
                // ====================== mpl1c008 ===================
                if (!(mpl1d007a.isChecked() || mpl1d007b.isChecked() || mpl1d007c.isChecked() || mpl1d007d.isChecked()
                        || mpl1d007e.isChecked() || mpl1d007f.isChecked() || mpl1d007g.isChecked() || mpl1d00788.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mpl1c007), Toast.LENGTH_LONG).show();
                    mpl1d00788.setError("This data is Required!");    // Set Error on last check box
                    Log.i(TAG, "mpl1d007: This data is Required!");
                    return false;
                } else {
                    mpl1d00788.setError(null);
                }

                if (mpl1d00788.isChecked() && mpl1d00788x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    mpl1d00788x.setError("This data is required");
                    Log.d(TAG, " mpl1d00788x :empty ");
                    return false;
                } else {
                    mpl1d00788x.setError(null);
                }
            }

            //=================== mpl1d008 ==============
            if (mpl1d008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1d008), Toast.LENGTH_SHORT).show();
                mpl1d008b.setError("This data is Required!");
                Log.i(TAG, "mpl1d008: This Data is Required!");
                return false;
            } else {
                mpl1d008b.setError(null);
            }

            //=================== mpl1d009 ==============
            if (mpl1d009.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c009), Toast.LENGTH_SHORT).show();
                mpl1d009.setError("This data is required");
                Log.d(TAG, " mpl1d009 :empty ");
                return false;
            } else {
                mpl1d009.setError(null);
            }

        }
        return true;

    }

   
}


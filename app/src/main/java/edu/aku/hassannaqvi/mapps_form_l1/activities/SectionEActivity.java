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
    RadioGroup mpl1c004;
    @BindView(R.id.mpl1c004a)
    RadioButton mpl1c004a;
    @BindView(R.id.mpl1c004b)
    RadioButton mpl1c004b;
    @BindView(R.id.fldGrp005)
    LinearLayout fldGrp005;
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
    @BindView(R.id.mpl1c007x)
    EditText mpl1c007x;
    @BindView(R.id.mpl1c007d)
    RadioButton mpl1c007d;
    @BindView(R.id.mpl1c007e)
    RadioButton mpl1c007e;
    @BindView(R.id.mpl1c007f)
    RadioButton mpl1c007f;
    @BindView(R.id.mpl1c007g)
    RadioButton mpl1c007g;
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
    @BindView(R.id.mpl1c008h)
    CheckBox mpl1c008h;
    @BindView(R.id.mpl1c008i)
    CheckBox mpl1c008i;
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
    @BindView(R.id.fldGrpmpl1c010)
    LinearLayout fldGrpmpl1c010;
    @BindView(R.id.mpl1c010)
    EditText mpl1c010;
    @BindView(R.id.mpl1c011)
    RadioGroup mpl1c011;
    @BindView(R.id.mpl1c011a)
    RadioButton mpl1c011a;
    @BindView(R.id.mpl1c011b)
    RadioButton mpl1c011b;
    @BindView(R.id.fldGrp012)
    LinearLayout fldGrp012;
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
                    mpl1c004.clearCheck();
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
                    mpl1c008h.setChecked(false);
                    mpl1c008i.setChecked(false);
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
                    mpl1c004.clearCheck();
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
                    mpl1c008h.setChecked(false);
                    mpl1c008i.setChecked(false);
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
                    mpl1c007x.setText(null);
                }
            }
        });


        /*mpl1c007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c007e.isChecked()) {
                    fldGrp007.setVisibility(View.VISIBLE);
                } else {
                    fldGrp007.setVisibility(View.GONE);
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
                }
            }
        });*/

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

        mpl1c011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c011a.isChecked()) {
                    fldGrp012.setVisibility(View.VISIBLE);
                } else {
                    fldGrp012.setVisibility(View.GONE);
                    mpl1c012a.setChecked(false);
                    mpl1c012b.setChecked(false);
                    mpl1c012c.setChecked(false);
                    mpl1c01288.setChecked(false);
                    mpl1c01288x.setText(null);
                    mpl1c013.clearCheck();
                }
            }
        });

        mpl1c009.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c009a.isChecked()) {
                    fldGrpmpl1c010.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmpl1c010.setVisibility(View.GONE);
                    mpl1c010.setText(null);
                }
            }
        });

        mpl1c004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1c004a.isChecked()) {
                    fldGrp005.setVisibility(View.VISIBLE);
                } else {
                    fldGrp005.setVisibility(View.GONE);
                    mpl1c005.setText(null);
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


                if (mpl1c001d.isChecked()) {
                    Intent endSec = new Intent(this, EndingActivity.class);
                    endSec.putExtra("complete", true);
                    startActivity(endSec);
                } else if (mpl1c002c.isChecked()) {
                    Intent endSec = new Intent(this, EndingActivity.class);
                    endSec.putExtra("complete", true);
                    startActivity(endSec);
                } else {
                    Intent endSec = new Intent(this, SectionFActivity.class);
                    startActivity(endSec);
                }



            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSE();

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


        JSONObject se = new JSONObject();

        se.put("mpl1c001", mpl1c001a.isChecked() ? "1" : mpl1c001b.isChecked() ? "2" : mpl1c001c.isChecked() ? "3" : mpl1c001d.isChecked() ? "4" : "0");
        se.put("mpl1c002", mpl1c002a.isChecked() ? "1" : mpl1c002b.isChecked() ? "2" : mpl1c002c.isChecked() ? "3" : "0");
        se.put("mpl1c003", mpl1c003.getText().toString());
        se.put("mpl1c004", mpl1c004a.isChecked() ? "1" : mpl1c004b.isChecked() ? "2" : "0");
        se.put("mpl1c005", mpl1c005.getText().toString());
        se.put("mpl1c006", mpl1c006.getText().toString());
        se.put("mpl1c007", mpl1c007a.isChecked() ? "1" : mpl1c007b.isChecked() ? "2" : mpl1c007c.isChecked() ? "3" : mpl1c007d.isChecked() ? "4" : mpl1c007e.isChecked() ? "5" : "0");
        se.put("mpl1c007x", mpl1c007x.getText().toString());
        se.put("mpl1c008a", mpl1c008a.isChecked() ? "1" : "0");
        se.put("mpl1c008b", mpl1c008b.isChecked() ? "2" : "0");
        se.put("mpl1c008c", mpl1c008c.isChecked() ? "3" : "0");
        se.put("mpl1c008d", mpl1c008d.isChecked() ? "4" : "0");
        se.put("mpl1c008e", mpl1c008e.isChecked() ? "5" : "0");
        se.put("mpl1c008f", mpl1c008f.isChecked() ? "6" : "0");
        se.put("mpl1c008g", mpl1c008g.isChecked() ? "7" : "0");
        se.put("mpl1c008h", mpl1c008h.isChecked() ? "8" : "0");
        se.put("mpl1c008i", mpl1c008i.isChecked() ? "9" : "0");
        se.put("mpl1c00888", mpl1c00888.isChecked() ? "88" : "0");
        se.put("mpl1c00888x", mpl1c00888x.getText().toString());
        se.put("mpl1c009", mpl1c009a.isChecked() ? "1" : mpl1c009b.isChecked() ? "2" : "0");
        se.put("mpl1c010", mpl1c010.getText().toString());
        se.put("mpl1c011", mpl1c011a.isChecked() ? "1" : mpl1c011b.isChecked() ? "2" : "0");
        se.put("mpl1c012a", mpl1c012a.isChecked() ? "1" : "0");
        se.put("mpl1c012b", mpl1c012b.isChecked() ? "2" : "0");
        se.put("mpl1c012c", mpl1c012c.isChecked() ? "3" : "0");
        se.put("mpl1c01288", mpl1c01288.isChecked() ? "88" : "0");
        se.put("mpl1c01288x", mpl1c01288x.getText().toString());
        se.put("mpl1c013", mpl1c013a.isChecked() ? "1" : mpl1c013b.isChecked() ? "2" : mpl1c013c.isChecked() ? "3" : mpl1c013d.isChecked() ? "4" : "0");
        se.put("mpl1c014", mpl1c014.getText().toString());


        MainApp.fc.setsE(String.valueOf(se));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== mpl1c001 ==============
        if (mpl1c001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c001), Toast.LENGTH_SHORT).show();
            mpl1c001d.setError("This data is Required!");
            Log.i(TAG, "mpl1c001: This Data is Required!");
            return false;
        } else {
            mpl1c001d.setError(null);
        }

        if (!(mpl1c001d.isChecked())) {
            //=================== mpl1c002 ==============
            if (mpl1c002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c002), Toast.LENGTH_SHORT).show();
                mpl1c002c.setError("This data is Required!");
                Log.i(TAG, "mpl1c002: This Data is Required!");
                return false;
            } else {
                mpl1c002c.setError(null);
            }


            if (!(mpl1c002c.isChecked())) {
                //=================== mpl1c003 ==============
                if (mpl1c003.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c003), Toast.LENGTH_SHORT).show();
                    mpl1c003.setError("This data is required");
                    Log.d(TAG, " mpl1c003 :empty ");
                    return false;
                } else {
                    mpl1c003.setError(null);
                }

                if (Integer.valueOf(mpl1c003.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1c003), Toast.LENGTH_SHORT).show();
                    mpl1c003.setError("Invalid: Data cannot be Zero");
                    Log.i(TAG, "mpl1c003: Invalid data is 0");
                    return false;
                } else {
                    mpl1c003.setError(null);
                }

                //=================== mpl1c004 ==============
                if (mpl1c004.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c004), Toast.LENGTH_SHORT).show();
                    mpl1c004a.setError("This data is required");
                    Log.d(TAG, " mpl1c004 :empty ");
                    return false;
                } else {
                    mpl1c004a.setError(null);
                }

                if (mpl1c004a.isChecked()) {
                    //=================== mpl1c005 ==============
                    if (mpl1c005.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c005), Toast.LENGTH_SHORT).show();
                        mpl1c005.setError("This data is required");
                        Log.d(TAG, " mpl1c005 :empty ");
                        return false;
                    } else {
                        mpl1c005.setError(null);
                    }

                    if (Integer.valueOf(mpl1c005.getText().toString()) == 0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1c005), Toast.LENGTH_SHORT).show();
                        mpl1c005.setError("Invalid: Data cannot be Zero");
                        Log.i(TAG, "mpl1c005: Invalid data is 0");
                        return false;
                    } else {
                        mpl1c005.setError(null);
                    }
                }

                //=================== mpl1c006 ==============
                if (mpl1c006.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c006), Toast.LENGTH_SHORT).show();
                    mpl1c006.setError("This data is required");
                    Log.d(TAG, " mpl1c006 :empty ");
                    return false;
                } else {
                    mpl1c006.setError(null);
                }

                if (Integer.valueOf(mpl1c006.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mpl1c006), Toast.LENGTH_SHORT).show();
                    mpl1c006.setError("Invalid: Data cannot be Zero");
                    Log.i(TAG, "mpl1c006: Invalid data is 0");
                    return false;
                } else {
                    mpl1c006.setError(null);
                }

                //=================== mpl1c007 ==============
                if (mpl1c007.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c007), Toast.LENGTH_SHORT).show();
                    mpl1c007e.setError("This data is Required!");
                    Log.i(TAG, "mpl1c007: This Data is Required!");
                    return false;
                } else {
                    mpl1c007e.setError(null);
                }

                if (mpl1c007c.isChecked() && mpl1c007x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c007) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                    mpl1c007x.setError("This data is required");
                    Log.d(TAG, " mpl1c007x :empty ");
                    return false;
                } else {
                    mpl1c007x.setError(null);
                }


                //if (mpl1c007e.isChecked()) {
                    // ====================== mpl1c008 ===================
                    if (!(mpl1c008a.isChecked() || mpl1c008b.isChecked() || mpl1c008c.isChecked() || mpl1c008d.isChecked()
                            || mpl1c008e.isChecked() || mpl1c008f.isChecked() || mpl1c008g.isChecked() || mpl1c008h.isChecked()
                            || mpl1c008i.isChecked()
                            || mpl1c00888.isChecked())) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mpl1c008), Toast.LENGTH_LONG).show();
                        mpl1c00888.setError("This data is Required!");    // Set Error on last check box
                        Log.i(TAG, "mpl1c008: This data is Required!");
                        return false;
                    } else {
                        mpl1c00888.setError(null);
                    }

                    if (mpl1c00888.isChecked() && mpl1c00888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        mpl1c00888x.setError("This data is required");
                        Log.d(TAG, " mpl1c00888x :empty ");
                        return false;
                    } else {
                        mpl1c00888x.setError(null);
                    }
                //}
                //=================== mpl1c009 ==============
                if (mpl1c009.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c009), Toast.LENGTH_SHORT).show();
                    mpl1c009b.setError("This data is Required!");
                    Log.i(TAG, "mpl1c009: This Data is Required!");
                    return false;
                } else {
                    mpl1c009b.setError(null);
                }

                if  (mpl1c009a.isChecked()) {
                    //=================== mpl1c010 ==============
                    if (mpl1c010.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c010), Toast.LENGTH_SHORT).show();
                        mpl1c010.setError("This data is required");
                        Log.d(TAG, " mpl1c010 :empty ");
                        return false;
                    } else {
                        mpl1c010.setError(null);
                    }
                }
            }
            //=================== mpl1c011 ==============
            if (mpl1c011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c011), Toast.LENGTH_SHORT).show();
                mpl1c011b.setError("This data is Required!");
                Log.i(TAG, "mpl1c011: This Data is Required!");
                return false;
            } else {
                mpl1c011b.setError(null);
            }

            if (mpl1c011a.isChecked()) {
                // ====================== mpl1c012 ===================
                if (!(mpl1c012a.isChecked() || mpl1c012b.isChecked() || mpl1c012c.isChecked() || mpl1c01288.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mpl1c012), Toast.LENGTH_LONG).show();
                    mpl1c01288.setError("This data is Required!");    // Set Error on last check box
                    Log.i(TAG, "mpl1c012: This data is Required!");
                    return false;
                } else {
                    mpl1c01288.setError(null);
                }

                if (mpl1c01288.isChecked() && mpl1c01288x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c012) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    mpl1c01288x.setError("This data is required");
                    Log.d(TAG, " mpl1c01288x :empty ");
                    return false;
                } else {
                    mpl1c01288x.setError(null);
                }

                //=================== mpl1c013 ==============
                if (mpl1c013.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c013), Toast.LENGTH_SHORT).show();
                    mpl1c013d.setError("This data is Required!");
                    Log.i(TAG, "mpl1c013: This Data is Required!");
                    return false;
                } else {
                    mpl1c013d.setError(null);
                }
            }

            //=================== mpl1c014 ==============
            if (mpl1c014.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1c014), Toast.LENGTH_SHORT).show();
                mpl1c014.setError("This data is required");
                Log.d(TAG, " mpl1c014 :empty ");
                return false;
            } else {
                mpl1c014.setError(null);
            }

        }


        return true;

    }


}

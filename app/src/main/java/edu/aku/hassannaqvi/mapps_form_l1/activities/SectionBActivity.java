package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

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
    RadioButton mpl1ba007gb;
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
    RadioButton mpl1ba007lb;
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


        mpl1ba001a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        mpl1ba004a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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


                startActivity(new Intent(this, SectionEActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSB();

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

        JSONObject sb = new JSONObject();

        sb.put("mpl1ba001", mpl1ba001a.isChecked() ? "1" : mpl1ba001b.isChecked() ? "2" : "0");
        sb.put("mpl1ba002", mpl1ba002a.isChecked() ? "1" : mpl1ba002b.isChecked() ? "2" : "0");
        sb.put("mpl1ba003", mpl1ba003a.isChecked() ? "1" : mpl1ba003b.isChecked() ? "2" : mpl1ba003c.isChecked() ? "3" : "0");
        sb.put("mpl1ba004", mpl1ba004a.isChecked() ? "1" : mpl1ba004b.isChecked() ? "2" : "0");
        sb.put("mpl1ba005", mpl1ba005a.isChecked() ? "1" : mpl1ba005b.isChecked() ? "2" : mpl1ba005c.isChecked() ? "3" : "0");
        sb.put("mpl1ba006a", mpl1ba006aa.isChecked() ? "1" : mpl1ba006ab.isChecked() ? "2" : "0");
        sb.put("mpl1ba006b", mpl1ba006ba.isChecked() ? "1" : mpl1ba006bb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006c", mpl1ba006ca.isChecked() ? "1" : mpl1ba006cb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006d", mpl1ba006da.isChecked() ? "1" : mpl1ba006db.isChecked() ? "2" : "0");
        sb.put("mpl1ba006e", mpl1ba006ea.isChecked() ? "1" : mpl1ba006eb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006f", mpl1ba006fa.isChecked() ? "1" : mpl1ba006fb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006g", mpl1ba006ga.isChecked() ? "1" : mpl1ba006gb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006h", mpl1ba006ha.isChecked() ? "1" : mpl1ba006hb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006i", mpl1ba006ia.isChecked() ? "1" : mpl1ba006ib.isChecked() ? "2" : "0");
        sb.put("mpl1ba006j", mpl1ba006ja.isChecked() ? "1" : mpl1ba006jb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006k", mpl1ba006ka.isChecked() ? "1" : mpl1ba006kb.isChecked() ? "2" : "0");
        sb.put("mpl1ba006l", mpl1ba006la.isChecked() ? "1" : mpl1ba006lb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007a", mpl1ba007aa.isChecked() ? "1" : mpl1ba007ab.isChecked() ? "2" : "0");
        sb.put("mpl1ba007b", mpl1ba007ba.isChecked() ? "1" : mpl1ba007bb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007c", mpl1ba007ca.isChecked() ? "1" : mpl1ba007cb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007d", mpl1ba007da.isChecked() ? "1" : mpl1ba007db.isChecked() ? "2" : "0");
        sb.put("mpl1ba007e", mpl1ba007ea.isChecked() ? "1" : mpl1ba007eb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007f", mpl1ba007fa.isChecked() ? "1" : mpl1ba007fb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007g", mpl1ba007ga.isChecked() ? "1" : mpl1ba007gb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007h", mpl1ba007ha.isChecked() ? "1" : mpl1ba007hb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007i", mpl1ba007ia.isChecked() ? "1" : mpl1ba007ib.isChecked() ? "2" : "0");
        sb.put("mpl1ba007j", mpl1ba007ja.isChecked() ? "1" : mpl1ba007jb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007k", mpl1ba007ka.isChecked() ? "1" : mpl1ba007kb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007l", mpl1ba007la.isChecked() ? "1" : mpl1ba007lb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007m", mpl1ba007ma.isChecked() ? "1" : mpl1ba007mb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007n", mpl1ba007na.isChecked() ? "1" : mpl1ba007nb.isChecked() ? "2" : "0");
        sb.put("mpl1ba007o", mpl1ba007oa.isChecked() ? "1" : mpl1ba007ob.isChecked() ? "2" : "0");


        MainApp.fc.setsB(String.valueOf(sb));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== mpl1ba001 ==============
        if (mpl1ba001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba001), Toast.LENGTH_SHORT).show();
            mpl1ba001b.setError("This data is Required!");
            Log.i(TAG, "mpl1ba001: This Data is Required!");
            return false;
        } else {
            mpl1ba001b.setError(null);
        }

        if (mpl1ba001a.isChecked()) {

            //=================== mpl1ba002 ==============
            if (mpl1ba002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba002), Toast.LENGTH_SHORT).show();
                mpl1ba002b.setError("This data is Required!");
                Log.i(TAG, "mpl1ba002: This Data is Required!");
                return false;
            } else {
                mpl1ba002b.setError(null);
            }

        }
        //=================== mpl1ba003 ==============
        if (mpl1ba003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba003), Toast.LENGTH_SHORT).show();
            mpl1ba003c.setError("This data is Required!");
            Log.i(TAG, "mpl1ba003: This Data is Required!");
            return false;
        } else {
            mpl1ba003c.setError(null);
        }


        if (mpl1ba003b.isChecked() || mpl1ba003c.isChecked()) {
            //=================== mpl1ba004 ==============
            if (mpl1ba004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba004), Toast.LENGTH_SHORT).show();
                mpl1ba004b.setError("This data is Required!");
                Log.i(TAG, "mpl1ba004: This Data is Required!");
                return false;
            } else {
                mpl1ba004b.setError(null);
            }

            if (mpl1ba004b.isChecked()) {
                //=================== mpl1ba005 ==============
                if (mpl1ba005.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba005), Toast.LENGTH_SHORT).show();
                    mpl1ba005c.setError("This data is Required!");
                    Log.i(TAG, "mpl1ba005: This Data is Required!");
                    return false;
                } else {
                    mpl1ba005c.setError(null);
                }
            }
        }
        //=================== mpl1ba006a ==============
        if (mpl1ba006a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006a), Toast.LENGTH_SHORT).show();
            mpl1ba006ab.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006a: This Data is Required!");
            return false;
        } else {
            mpl1ba006ab.setError(null);
        }

        //=================== mpl1ba006b ==============
        if (mpl1ba006b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006b), Toast.LENGTH_SHORT).show();
            mpl1ba006bb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006b: This Data is Required!");
            return false;
        } else {
            mpl1ba006bb.setError(null);
        }

        //=================== mpl1ba006c ==============
        if (mpl1ba006c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006c), Toast.LENGTH_SHORT).show();
            mpl1ba006cb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006c: This Data is Required!");
            return false;
        } else {
            mpl1ba006cb.setError(null);
        }

        //=================== mpl1ba006d ==============
        if (mpl1ba006d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006d), Toast.LENGTH_SHORT).show();
            mpl1ba006db.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006d: This Data is Required!");
            return false;
        } else {
            mpl1ba006db.setError(null);
        }

        //=================== mpl1ba006e ==============
        if (mpl1ba006e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006e), Toast.LENGTH_SHORT).show();
            mpl1ba006eb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006e: This Data is Required!");
            return false;
        } else {
            mpl1ba006eb.setError(null);
        }

        //=================== mpl1ba006f ==============
        if (mpl1ba006f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006f), Toast.LENGTH_SHORT).show();
            mpl1ba006fb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006f: This Data is Required!");
            return false;
        } else {
            mpl1ba006fb.setError(null);
        }

        //=================== mpl1ba006g ==============
        if (mpl1ba006g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006g), Toast.LENGTH_SHORT).show();
            mpl1ba006gb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006g: This Data is Required!");
            return false;
        } else {
            mpl1ba006gb.setError(null);
        }

        //=================== mpl1ba006h ==============
        if (mpl1ba006h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006h), Toast.LENGTH_SHORT).show();
            mpl1ba006hb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006h: This Data is Required!");
            return false;
        } else {
            mpl1ba006hb.setError(null);
        }

        //=================== mpl1ba006i ==============
        if (mpl1ba006i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006i), Toast.LENGTH_SHORT).show();
            mpl1ba006ib.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006i: This Data is Required!");
            return false;
        } else {
            mpl1ba006ib.setError(null);
        }

        //=================== mpl1ba006j ==============
        if (mpl1ba006j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006j), Toast.LENGTH_SHORT).show();
            mpl1ba006jb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006j: This Data is Required!");
            return false;
        } else {
            mpl1ba006jb.setError(null);
        }

        //=================== mpl1ba006k ==============
        if (mpl1ba006k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006k), Toast.LENGTH_SHORT).show();
            mpl1ba006kb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006k: This Data is Required!");
            return false;
        } else {
            mpl1ba006kb.setError(null);
        }

        //=================== mpl1ba006l ==============
        if (mpl1ba006l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006l), Toast.LENGTH_SHORT).show();
            mpl1ba006lb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006l: This Data is Required!");
            return false;
        } else {
            mpl1ba006lb.setError(null);
        }

        //=================== mpl1ba006 ==============
        if (mpl1ba006a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba006a), Toast.LENGTH_SHORT).show();
            mpl1ba006ab.setError("This data is Required!");
            Log.i(TAG, "mpl1ba006a: This Data is Required!");
            return false;
        } else {
            mpl1ba006ab.setError(null);
        }

        //=================== mpl1ba007a ==============
        if (mpl1ba007a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007a), Toast.LENGTH_SHORT).show();
            mpl1ba007ab.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007a: This Data is Required!");
            return false;
        } else {
            mpl1ba007ab.setError(null);
        }

        //=================== mpl1ba007b ==============
        if (mpl1ba007b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007b), Toast.LENGTH_SHORT).show();
            mpl1ba007bb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007b: This Data is Required!");
            return false;
        } else {
            mpl1ba007bb.setError(null);
        }

        //=================== mpl1ba007c ==============
        if (mpl1ba007c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007c), Toast.LENGTH_SHORT).show();
            mpl1ba007cb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007c: This Data is Required!");
            return false;
        } else {
            mpl1ba007cb.setError(null);
        }

        //=================== mpl1ba007d ==============
        if (mpl1ba007d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007d), Toast.LENGTH_SHORT).show();
            mpl1ba007db.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007d: This Data is Required!");
            return false;
        } else {
            mpl1ba007db.setError(null);
        }

        //=================== mpl1ba007e ==============
        if (mpl1ba007e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007e), Toast.LENGTH_SHORT).show();
            mpl1ba007eb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007e: This Data is Required!");
            return false;
        } else {
            mpl1ba007eb.setError(null);
        }

        //=================== mpl1ba007f ==============
        if (mpl1ba007f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007f), Toast.LENGTH_SHORT).show();
            mpl1ba007fb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007f: This Data is Required!");
            return false;
        } else {
            mpl1ba007fb.setError(null);
        }

        //=================== mpl1ba007g ==============
        if (mpl1ba007g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007g), Toast.LENGTH_SHORT).show();
            mpl1ba007gb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007g: This Data is Required!");
            return false;
        } else {
            mpl1ba007gb.setError(null);
        }

        //=================== mpl1ba007h ==============
        if (mpl1ba007h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007h), Toast.LENGTH_SHORT).show();
            mpl1ba007hb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007h: This Data is Required!");
            return false;
        } else {
            mpl1ba007hb.setError(null);
        }

        //=================== mpl1ba007i ==============
        if (mpl1ba007i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007i), Toast.LENGTH_SHORT).show();
            mpl1ba007ib.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007i: This Data is Required!");
            return false;
        } else {
            mpl1ba007ib.setError(null);
        }

        //=================== mpl1ba007j ==============
        if (mpl1ba007j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007j), Toast.LENGTH_SHORT).show();
            mpl1ba007jb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007j: This Data is Required!");
            return false;
        } else {
            mpl1ba007jb.setError(null);
        }

        //=================== mpl1ba007k ==============
        if (mpl1ba007k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007k), Toast.LENGTH_SHORT).show();
            mpl1ba007kb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007k: This Data is Required!");
            return false;
        } else {
            mpl1ba007kb.setError(null);
        }

        //=================== mpl1ba007l ==============
        if (mpl1ba007l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007l), Toast.LENGTH_SHORT).show();
            mpl1ba007lb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007l: This Data is Required!");
            return false;
        } else {
            mpl1ba007lb.setError(null);
        }

        //=================== mpl1ba007m ==============
        if (mpl1ba007m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007m), Toast.LENGTH_SHORT).show();
            mpl1ba007mb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007m: This Data is Required!");
            return false;
        } else {
            mpl1ba007mb.setError(null);
        }

        //=================== mpl1ba007n ==============
        if (mpl1ba007n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007n), Toast.LENGTH_SHORT).show();
            mpl1ba007nb.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007n: This Data is Required!");
            return false;
        } else {
            mpl1ba007nb.setError(null);
        }

        //=================== mpl1ba007o ==============
        if (mpl1ba007o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1ba007o), Toast.LENGTH_SHORT).show();
            mpl1ba007ob.setError("This data is Required!");
            Log.i(TAG, "mpl1ba007o: This Data is Required!");
            return false;
        } else {
            mpl1ba007ob.setError(null);
        }

        return true;

    }



}

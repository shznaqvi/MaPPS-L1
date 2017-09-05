package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
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

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();

    @BindView(R.id.mpl1bb001a)
    RadioGroup mpl1bb001a;
    @BindView(R.id.mpl1bb001aa)
    RadioButton mpl1bb001aa;
    @BindView(R.id.mpl1bb001ab)
    RadioButton mpl1bb001ab;
    @BindView(R.id.mpl1bb001b)
    RadioGroup mpl1bb001b;
    @BindView(R.id.mpl1bb001ba)
    RadioButton mpl1bb001ba;
    @BindView(R.id.mpl1bb001bb)
    RadioButton mpl1bb001bb;
    @BindView(R.id.mpl1bb001c)
    RadioGroup mpl1bb001c;
    @BindView(R.id.mpl1bb001ca)
    RadioButton mpl1bb001ca;
    @BindView(R.id.mpl1bb001cb)
    RadioButton mpl1bb001cb;
    @BindView(R.id.mpl1bb001d)
    RadioGroup mpl1bb001d;
    @BindView(R.id.mpl1bb001da)
    RadioButton mpl1bb001da;
    @BindView(R.id.mpl1bb001db)
    RadioButton mpl1bb001db;
    @BindView(R.id.mpl1bb001e)
    RadioGroup mpl1bb001e;
    @BindView(R.id.mpl1bb001ea)
    RadioButton mpl1bb001ea;
    @BindView(R.id.mpl1bb001eb)
    RadioButton mpl1bb001eb;
    @BindView(R.id.mpl1bb001f)
    RadioGroup mpl1bb001f;
    @BindView(R.id.mpl1bb001fa)
    RadioButton mpl1bb001fa;
    @BindView(R.id.mpl1bb001fb)
    RadioButton mpl1bb001fb;
    @BindView(R.id.mpl1bb001g)
    RadioGroup mpl1bb001g;
    @BindView(R.id.mpl1bb001ga)
    RadioButton mpl1bb001ga;
    @BindView(R.id.mpl1bb001gb)
    RadioButton mpl1bb001gb;
    @BindView(R.id.mpl1bb001h)
    RadioGroup mpl1bb001h;
    @BindView(R.id.mpl1bb001ha)
    RadioButton mpl1bb001ha;
    @BindView(R.id.mpl1bb001hb)
    RadioButton mpl1bb001hb;
    @BindView(R.id.mpl1bb001i)
    RadioGroup mpl1bb001i;
    @BindView(R.id.mpl1bb001ia)
    RadioButton mpl1bb001ia;
    @BindView(R.id.mpl1bb001ib)
    RadioButton mpl1bb001ib;
    @BindView(R.id.mpl1bb001j)
    RadioGroup mpl1bb001j;
    @BindView(R.id.mpl1bb001ja)
    RadioButton mpl1bb001ja;
    @BindView(R.id.mpl1bb001jb)
    RadioButton mpl1bb001jb;
    @BindView(R.id.mpl1bb001k)
    RadioGroup mpl1bb001k;
    @BindView(R.id.mpl1bb001ka)
    RadioButton mpl1bb001ka;
    @BindView(R.id.mpl1bb001kb)
    RadioButton mpl1bb001kb;
    @BindView(R.id.mpl1bb001l)
    RadioGroup mpl1bb001l;
    @BindView(R.id.mpl1bb001la)
    RadioButton mpl1bb001la;
    @BindView(R.id.mpl1bb001lb)
    RadioButton mpl1bb001lb;
    @BindView(R.id.mpl1bb001m)
    RadioGroup mpl1bb001m;
    @BindView(R.id.mpl1bb001ma)
    RadioButton mpl1bb001ma;
    @BindView(R.id.mpl1bb001mb)
    RadioButton mpl1bb001mb;
    @BindView(R.id.mpl1bb001n)
    RadioGroup mpl1bb001n;
    @BindView(R.id.mpl1bb001na)
    RadioButton mpl1bb001na;
    @BindView(R.id.mpl1bb001nb)
    RadioButton mpl1bb001nb;
    @BindView(R.id.mpl1bb001o)
    RadioGroup mpl1bb001o;
    @BindView(R.id.mpl1bb001oa)
    RadioButton mpl1bb001oa;
    @BindView(R.id.mpl1bb001ob)
    RadioButton mpl1bb001ob;
    @BindView(R.id.mpl1bb001p)
    RadioGroup mpl1bb001p;
    @BindView(R.id.mpl1bb001pa)
    RadioButton mpl1bb001pa;
    @BindView(R.id.mpl1bb001pb)
    RadioButton mpl1bb001pb;
    @BindView(R.id.fldGrp001p)
    LinearLayout fldGrp001p;
    @BindView(R.id.mpl1bb001p1)
    RadioGroup mpl1bb001p1;
    @BindView(R.id.mpl1bb001p1a)
    RadioButton mpl1bb001p1a;
    @BindView(R.id.mpl1bb001p1b)
    RadioButton mpl1bb001p1b;
    @BindView(R.id.mpl1bb001p1c)
    RadioButton mpl1bb001p1c;
    @BindView(R.id.mpl1bb001p2)
    RadioGroup mpl1bb001p2;
    @BindView(R.id.mpl1bb001p2a)
    RadioButton mpl1bb001p2a;
    @BindView(R.id.mpl1bb001p2b)
    RadioButton mpl1bb001p2b;
    @BindView(R.id.mpl1bb001p2c)
    RadioButton mpl1bb001p2c;
    @BindView(R.id.mpl1bb001p3)
    RadioGroup mpl1bb001p3;
    @BindView(R.id.mpl1bb001p3a)
    RadioButton mpl1bb001p3a;
    @BindView(R.id.mpl1bb001p3b)
    RadioButton mpl1bb001p3b;
    @BindView(R.id.mpl1bb001p3c)
    RadioButton mpl1bb001p3c;
    @BindView(R.id.mpl1bb001p4)
    RadioGroup mpl1bb001p4;
    @BindView(R.id.mpl1bb001p4a)
    RadioButton mpl1bb001p4a;
    @BindView(R.id.mpl1bb001p4b)
    RadioButton mpl1bb001p4b;
    @BindView(R.id.mpl1bb001p4c)
    RadioButton mpl1bb001p4c;
    @BindView(R.id.mpl1bb001q)
    RadioGroup mpl1bb001q;
    @BindView(R.id.mpl1bb001qa)
    RadioButton mpl1bb001qa;
    @BindView(R.id.mpl1bb001qb)
    RadioButton mpl1bb001qb;
    @BindView(R.id.mpl1bb002a)
    RadioGroup mpl1bb002a;
    @BindView(R.id.mpl1bb002aa)
    RadioButton mpl1bb002aa;
    @BindView(R.id.mpl1bb002ab)
    RadioButton mpl1bb002ab;
    @BindView(R.id.mpl1bb002b)
    RadioGroup mpl1bb002b;
    @BindView(R.id.mpl1bb002ba)
    RadioButton mpl1bb002ba;
    @BindView(R.id.mpl1bb002bb)
    RadioButton mpl1bb002bb;
    @BindView(R.id.mpl1bb002c)
    RadioGroup mpl1bb002c;
    @BindView(R.id.mpl1bb002ca)
    RadioButton mpl1bb002ca;
    @BindView(R.id.mpl1bb002cb)
    RadioButton mpl1bb002cb;
    @BindView(R.id.mpl1bb002d)
    RadioGroup mpl1bb002d;
    @BindView(R.id.mpl1bb002da)
    RadioButton mpl1bb002da;
    @BindView(R.id.mpl1bb002db)
    RadioButton mpl1bb002db;
    @BindView(R.id.mpl1bb002e)
    RadioGroup mpl1bb002e;
    @BindView(R.id.mpl1bb002ea)
    RadioButton mpl1bb002ea;
    @BindView(R.id.mpl1bb002eb)
    RadioButton mpl1bb002eb;
    @BindView(R.id.mpl1bb002f)
    RadioGroup mpl1bb002f;
    @BindView(R.id.mpl1bb002fa)
    RadioButton mpl1bb002fa;
    @BindView(R.id.mpl1bb002fb)
    RadioButton mpl1bb002fb;
    @BindView(R.id.mpl1bb002g)
    RadioGroup mpl1bb002g;
    @BindView(R.id.mpl1bb002ga)
    RadioButton mpl1bb002ga;
    @BindView(R.id.mpl1bb002gb)
    RadioButton mpl1bb002gb;
    @BindView(R.id.mpl1bb002h)
    RadioGroup mpl1bb002h;
    @BindView(R.id.mpl1bb002ha)
    RadioButton mpl1bb002ha;
    @BindView(R.id.mpl1bb002hb)
    RadioButton mpl1bb002hb;
    @BindView(R.id.mpl1bb002i)
    RadioGroup mpl1bb002i;
    @BindView(R.id.mpl1bb002ia)
    RadioButton mpl1bb002ia;
    @BindView(R.id.mpl1bb002ib)
    RadioButton mpl1bb002ib;
    @BindView(R.id.mpl1bb002j)
    RadioGroup mpl1bb002j;
    @BindView(R.id.mpl1bb002ja)
    RadioButton mpl1bb002ja;
    @BindView(R.id.mpl1bb002jb)
    RadioButton mpl1bb002jb;
    @BindView(R.id.mpl1bb002k)
    RadioGroup mpl1bb002k;
    @BindView(R.id.mpl1bb002ka)
    RadioButton mpl1bb002ka;
    @BindView(R.id.mpl1bb002kb)
    RadioButton mpl1bb002kb;
    @BindView(R.id.mpl1bb002l)
    RadioGroup mpl1bb002l;
    @BindView(R.id.mpl1bb002la)
    RadioButton mpl1bb002la;
    @BindView(R.id.mpl1bb002lb)
    RadioButton mpl1bb002lb;
    @BindView(R.id.mpl1bb002m)
    RadioGroup mpl1bb002m;
    @BindView(R.id.mpl1bb002ma)
    RadioButton mpl1bb002ma;
    @BindView(R.id.mpl1bb002mb)
    RadioButton mpl1bb002mb;
    @BindView(R.id.mpl1bb002n)
    RadioGroup mpl1bb002n;
    @BindView(R.id.mpl1bb002na)
    RadioButton mpl1bb002na;
    @BindView(R.id.mpl1bb002nb)
    RadioButton mpl1bb002nb;
    @BindView(R.id.mpl1bb002o)
    RadioGroup mpl1bb002o;
    @BindView(R.id.mpl1bb002oa)
    RadioButton mpl1bb002oa;
    @BindView(R.id.mpl1bb002ob)
    RadioButton mpl1bb002ob;
    @BindView(R.id.mpl1bb002p)
    RadioGroup mpl1bb002p;
    @BindView(R.id.mpl1bb002pa)
    RadioButton mpl1bb002pa;
    @BindView(R.id.mpl1bb002pb)
    RadioButton mpl1bb002pb;
    @BindView(R.id.mpl1bb002q)
    RadioGroup mpl1bb002q;
    @BindView(R.id.mpl1bb002qa)
    RadioButton mpl1bb002qa;
    @BindView(R.id.mpl1bb002qb)
    RadioButton mpl1bb002qb;
    @BindView(R.id.mpl1bb002r)
    RadioGroup mpl1bb002r;
    @BindView(R.id.mpl1bb002ra)
    RadioButton mpl1bb002ra;
    @BindView(R.id.mpl1bb002rb)
    RadioButton mpl1bb002rb;
    @BindView(R.id.mpl1bb002s)
    RadioGroup mpl1bb002s;
    @BindView(R.id.mpl1bb002sa)
    RadioButton mpl1bb002sa;
    @BindView(R.id.mpl1bb002sb)
    RadioButton mpl1bb002sb;
    @BindView(R.id.mpl1bb002t)
    RadioGroup mpl1bb002t;
    @BindView(R.id.mpl1bb002ta)
    RadioButton mpl1bb002ta;
    @BindView(R.id.mpl1bb002tb)
    RadioButton mpl1bb002tb;
    @BindView(R.id.mpl1bb002u)
    RadioGroup mpl1bb002u;
    @BindView(R.id.mpl1bb002ua)
    RadioButton mpl1bb002ua;
    @BindView(R.id.mpl1bb002ub)
    RadioButton mpl1bb002ub;
    @BindView(R.id.mpl1bb002v)
    RadioGroup mpl1bb002v;
    @BindView(R.id.mpl1bb002va)
    RadioButton mpl1bb002va;
    @BindView(R.id.mpl1bb002vb)
    RadioButton mpl1bb002vb;
    @BindView(R.id.mpl1bb002w)
    RadioGroup mpl1bb002w;
    @BindView(R.id.mpl1bb002wa)
    RadioButton mpl1bb002wa;
    @BindView(R.id.mpl1bb002wb)
    RadioButton mpl1bb002wb;
    @BindView(R.id.mpl1bb002x)
    RadioGroup mpl1bb002x;
    @BindView(R.id.mpl1bb002xa)
    RadioButton mpl1bb002xa;
    @BindView(R.id.mpl1bb002xb)
    RadioButton mpl1bb002xb;
    @BindView(R.id.mpl1bb002y)
    RadioGroup mpl1bb002y;
    @BindView(R.id.mpl1bb002ya)
    RadioButton mpl1bb002ya;
    @BindView(R.id.mpl1bb002yb)
    RadioButton mpl1bb002yb;
    @BindView(R.id.mpl1bb002z)
    RadioGroup mpl1bb002z;
    @BindView(R.id.mpl1bb002za)
    RadioButton mpl1bb002za;
    @BindView(R.id.mpl1bb002zb)
    RadioButton mpl1bb002zb;
    @BindView(R.id.mpl1bb002aaa)
    RadioGroup mpl1bb002aaa;
    @BindView(R.id.mpl1bb002aaaa)
    RadioButton mpl1bb002aaaa;
    @BindView(R.id.mpl1bb002aaab)
    RadioButton mpl1bb002aaab;
    @BindView(R.id.mpl1bb002bbb)
    RadioGroup mpl1bb002bbb;
    @BindView(R.id.mpl1bb002bbba)
    RadioButton mpl1bb002bbba;
    @BindView(R.id.mpl1bb002bbbb)
    RadioButton mpl1bb002bbbb;
    @BindView(R.id.mpl1bb002ccc)
    RadioGroup mpl1bb002ccc;
    @BindView(R.id.mpl1bb002ccca)
    RadioButton mpl1bb002ccca;
    @BindView(R.id.mpl1bb002cccb)
    RadioButton mpl1bb002cccb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        mpl1bb001pb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001p.setVisibility(View.GONE);
                } else {
                    fldGrp001p.setVisibility(View.VISIBLE);
                    mpl1bb001p1.clearCheck();
                    mpl1bb001p2.clearCheck();
                    mpl1bb001p3.clearCheck();
                    mpl1bb001p4.clearCheck();
                    mpl1bb001q.clearCheck();
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


                startActivity(new Intent(this, SectionDActivity.class));

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

    


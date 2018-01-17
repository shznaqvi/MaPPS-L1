package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
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
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

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
    @BindView(R.id.mpl1bb001fx)
    EditText mpl1bb001fx;
    @BindView(R.id.mpl1bb001g)
    RadioGroup mpl1bb001g;
    @BindView(R.id.mpl1bb001ga)
    RadioButton mpl1bb001ga;
    @BindView(R.id.mpl1bb001gb)
    RadioButton mpl1bb001gb;
    @BindView(R.id.mpl1bb001gx)
    EditText mpl1bb001gx;
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
    @BindView(R.id.mpl1bb001lx)
    EditText mpl1bb001lx;
    @BindView(R.id.mpl1bb001m)
    RadioGroup mpl1bb001m;
    @BindView(R.id.mpl1bb001ma)
    RadioButton mpl1bb001ma;
    @BindView(R.id.mpl1bb001mb)
    RadioButton mpl1bb001mb;
    @BindView(R.id.mpl1bb001mx)
    EditText mpl1bb001mx;
    @BindView(R.id.mpl1bb001n)
    RadioGroup mpl1bb001n;
    @BindView(R.id.mpl1bb001na)
    RadioButton mpl1bb001na;
    @BindView(R.id.mpl1bb001nb)
    RadioButton mpl1bb001nb;
    @BindView(R.id.mpl1bb001nx)
    EditText mpl1bb001nx;
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
    @BindView(R.id.mpl1bb001px)
    EditText mpl1bb001px;
    @BindView(R.id.fldGrp001p)
    LinearLayout fldGrp001p;
    @BindView(R.id.mpl1bb001p1)
    RadioGroup mpl1bb001p1;
    @BindView(R.id.mpl1bb001p1a)
    RadioButton mpl1bb001p1a;
    @BindView(R.id.mpl1bb001p1b)
    RadioButton mpl1bb001p1b;
    @BindView(R.id.mpl1bb001p199)
    RadioButton mpl1bb001p199;
    @BindView(R.id.mpl1bb001p2)
    RadioGroup mpl1bb001p2;
    @BindView(R.id.mpl1bb001p2a)
    RadioButton mpl1bb001p2a;
    @BindView(R.id.mpl1bb001p2b)
    RadioButton mpl1bb001p2b;
    @BindView(R.id.mpl1bb001p299)
    RadioButton mpl1bb001p299;
    @BindView(R.id.mpl1bb001p3)
    RadioGroup mpl1bb001p3;
    @BindView(R.id.mpl1bb001p3a)
    RadioButton mpl1bb001p3a;
    @BindView(R.id.mpl1bb001p3b)
    RadioButton mpl1bb001p3b;
    @BindView(R.id.mpl1bb001p399)
    RadioButton mpl1bb001p399;
    @BindView(R.id.mpl1bb001p4)
    RadioGroup mpl1bb001p4;
    @BindView(R.id.mpl1bb001p4a)
    RadioButton mpl1bb001p4a;
    @BindView(R.id.mpl1bb001p4b)
    RadioButton mpl1bb001p4b;
    @BindView(R.id.mpl1bb001p499)
    RadioButton mpl1bb001p499;
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

    @BindView(R.id.mpl1bb002cccx)
    EditText mpl1bb002cccx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        mpl1bb001p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1bb001pa.isChecked()) {
                    fldGrp001p.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001p.setVisibility(View.GONE);
                    mpl1bb001px.setText(null);
                    mpl1bb001p1.clearCheck();
                    mpl1bb001p2.clearCheck();
                    mpl1bb001p3.clearCheck();
                    mpl1bb001p4.clearCheck();

                }
            }
        });

        mpl1bb001fa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001fx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001fx.setVisibility(View.GONE);
                    mpl1bb001fx.setText(null);
                }
            }
        });

        mpl1bb001ga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001gx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001gx.setVisibility(View.GONE);
                    mpl1bb001gx.setText(null);
                }
            }
        });

        mpl1bb001la.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001lx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001lx.setVisibility(View.GONE);
                    mpl1bb001lx.setText(null);
                }
            }
        });

        mpl1bb001ma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001mx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001mx.setVisibility(View.GONE);
                    mpl1bb001mx.setText(null);
                }
            }
        });
        mpl1bb001na.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001nx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001nx.setVisibility(View.GONE);
                    mpl1bb001nx.setText(null);
                }
            }
        });

        mpl1bb001pa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb001px.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb001px.setVisibility(View.GONE);
                    mpl1bb001px.setText(null);
                }
            }
        });

        mpl1bb002ccca.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bb002cccx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bb002cccx.setVisibility(View.GONE);
                    mpl1bb002cccx.setText(null);
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
//       }

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


                startActivity(new Intent(this, SectionEActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSC();

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


        JSONObject sc = new JSONObject();

        sc.put("mpl1bb001a", mpl1bb001aa.isChecked() ? "1" : mpl1bb001ab.isChecked() ? "2" : "0");
        sc.put("mpl1bb001b", mpl1bb001ba.isChecked() ? "1" : mpl1bb001bb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001c", mpl1bb001ca.isChecked() ? "1" : mpl1bb001cb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001d", mpl1bb001da.isChecked() ? "1" : mpl1bb001db.isChecked() ? "2" : "0");
        sc.put("mpl1bb001e", mpl1bb001ea.isChecked() ? "1" : mpl1bb001eb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001f", mpl1bb001fa.isChecked() ? "1" : mpl1bb001fb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001fx", mpl1bb001fx.getText().toString());
        sc.put("mpl1bb001g", mpl1bb001ga.isChecked() ? "1" : mpl1bb001gb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001gx", mpl1bb001gx.getText().toString());
        sc.put("mpl1bb001h", mpl1bb001ha.isChecked() ? "1" : mpl1bb001hb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001i", mpl1bb001ia.isChecked() ? "1" : mpl1bb001ib.isChecked() ? "2" : "0");
        sc.put("mpl1bb001j", mpl1bb001ja.isChecked() ? "1" : mpl1bb001jb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001k", mpl1bb001ka.isChecked() ? "1" : mpl1bb001kb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001l", mpl1bb001la.isChecked() ? "1" : mpl1bb001lb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001lx", mpl1bb001lx.getText().toString());
        sc.put("mpl1bb001m", mpl1bb001ma.isChecked() ? "1" : mpl1bb001mb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001mx", mpl1bb001mx.getText().toString());
        sc.put("mpl1bb001n", mpl1bb001na.isChecked() ? "1" : mpl1bb001nb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001nx", mpl1bb001nx.getText().toString());
        sc.put("mpl1bb001o", mpl1bb001oa.isChecked() ? "1" : mpl1bb001ob.isChecked() ? "2" : "0");
        sc.put("mpl1bb001p", mpl1bb001pa.isChecked() ? "1" : mpl1bb001pb.isChecked() ? "2" : "0");
        sc.put("mpl1bb001px", mpl1bb001px.getText().toString());
        sc.put("mpl1bb001p1", mpl1bb001p1a.isChecked() ? "1" : mpl1bb001p1b.isChecked() ? "2" : mpl1bb001p199.isChecked() ? "99" : "0");
        sc.put("mpl1bb001p2", mpl1bb001p2a.isChecked() ? "1" : mpl1bb001p2b.isChecked() ? "2" : mpl1bb001p299.isChecked() ? "99" : "0");
        sc.put("mpl1bb001p3", mpl1bb001p3a.isChecked() ? "1" : mpl1bb001p3b.isChecked() ? "2" : mpl1bb001p399.isChecked() ? "99" : "0");
        sc.put("mpl1bb001p4", mpl1bb001p4a.isChecked() ? "1" : mpl1bb001p4b.isChecked() ? "2" : mpl1bb001p499.isChecked() ? "99" : "0");
        sc.put("mpl1bb001q", mpl1bb001qa.isChecked() ? "1" : mpl1bb001qb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002a", mpl1bb002aa.isChecked() ? "1" : mpl1bb002ab.isChecked() ? "2" : "0");
        sc.put("mpl1bb002b", mpl1bb002ba.isChecked() ? "1" : mpl1bb002bb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002c", mpl1bb002ca.isChecked() ? "1" : mpl1bb002cb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002d", mpl1bb002da.isChecked() ? "1" : mpl1bb002db.isChecked() ? "2" : "0");
        sc.put("mpl1bb002e", mpl1bb002ea.isChecked() ? "1" : mpl1bb002eb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002f", mpl1bb002fa.isChecked() ? "1" : mpl1bb002fb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002g", mpl1bb002ga.isChecked() ? "1" : mpl1bb002gb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002h", mpl1bb002ha.isChecked() ? "1" : mpl1bb002hb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002i", mpl1bb002ia.isChecked() ? "1" : mpl1bb002ib.isChecked() ? "2" : "0");
        sc.put("mpl1bb002j", mpl1bb002ja.isChecked() ? "1" : mpl1bb002jb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002k", mpl1bb002ka.isChecked() ? "1" : mpl1bb002kb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002l", mpl1bb002la.isChecked() ? "1" : mpl1bb002lb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002m", mpl1bb002ma.isChecked() ? "1" : mpl1bb002mb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002n", mpl1bb002na.isChecked() ? "1" : mpl1bb002nb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002o", mpl1bb002oa.isChecked() ? "1" : mpl1bb002ob.isChecked() ? "2" : "0");
        sc.put("mpl1bb002p", mpl1bb002pa.isChecked() ? "1" : mpl1bb002pb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002q", mpl1bb002qa.isChecked() ? "1" : mpl1bb002qb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002r", mpl1bb002ra.isChecked() ? "1" : mpl1bb002rb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002s", mpl1bb002sa.isChecked() ? "1" : mpl1bb002sb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002t", mpl1bb002ta.isChecked() ? "1" : mpl1bb002tb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002u", mpl1bb002ua.isChecked() ? "1" : mpl1bb002ub.isChecked() ? "2" : "0");
        sc.put("mpl1bb002v", mpl1bb002va.isChecked() ? "1" : mpl1bb002vb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002w", mpl1bb002wa.isChecked() ? "1" : mpl1bb002wb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002x", mpl1bb002xa.isChecked() ? "1" : mpl1bb002xb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002y", mpl1bb002ya.isChecked() ? "1" : mpl1bb002yb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002z", mpl1bb002za.isChecked() ? "1" : mpl1bb002zb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002aaa", mpl1bb002aaaa.isChecked() ? "1" : mpl1bb002aaab.isChecked() ? "2" : "0");
        sc.put("mpl1bb002bbb", mpl1bb002bbba.isChecked() ? "1" : mpl1bb002bbbb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002ccc", mpl1bb002ccca.isChecked() ? "1" : mpl1bb002cccb.isChecked() ? "2" : "0");
        sc.put("mpl1bb002cccx", mpl1bb002cccx.getText().toString());


        MainApp.fc.setsC(String.valueOf(sc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== mpl1bb001a ==============
        if (mpl1bb001a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001a), Toast.LENGTH_SHORT).show();
            mpl1bb001ab.setError("This data is Required!");
            mpl1bb001ab.setFocusableInTouchMode(true);
            mpl1bb001ab.setFocusable(true);
            mpl1bb001ab.requestFocus();
            Log.i(TAG, "mpl1bb001a: This Data is Required!");
            return false;
        } else {
            mpl1bb001ab.setError(null);
        }

        //=================== mpl1bb001b ==============
        if (mpl1bb001b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001b), Toast.LENGTH_SHORT).show();
            mpl1bb001bb.setError("This data is Required!");
            mpl1bb001bb.setFocusableInTouchMode(true);
            mpl1bb001bb.setFocusable(true);
            mpl1bb001bb.requestFocus();
            Log.i(TAG, "mpl1bb001b: This Data is Required!");
            return false;
        } else {
            mpl1bb001bb.setError(null);
        }

        //=================== mpl1bb001c ==============
        if (mpl1bb001c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001c), Toast.LENGTH_SHORT).show();
            mpl1bb001cb.setError("This data is Required!");
            mpl1bb001cb.setFocusableInTouchMode(true);
            mpl1bb001cb.setFocusable(true);
            mpl1bb001cb.requestFocus();
            Log.i(TAG, "mpl1bb001c: This Data is Required!");
            return false;
        } else {
            mpl1bb001cb.setError(null);
        }

        //=================== mpl1bb001d ==============
        if (mpl1bb001d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001d), Toast.LENGTH_SHORT).show();
            mpl1bb001db.setError("This data is Required!");
            mpl1bb001db.setFocusableInTouchMode(true);
            mpl1bb001db.setFocusable(true);
            mpl1bb001db.requestFocus();
            Log.i(TAG, "mpl1bb001d: This Data is Required!");
            return false;
        } else {
            mpl1bb001db.setError(null);
        }

        //=================== mpl1bb001e ==============
        if (mpl1bb001e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001e), Toast.LENGTH_SHORT).show();
            mpl1bb001eb.setError("This data is Required!");
            mpl1bb001eb.setFocusableInTouchMode(true);
            mpl1bb001eb.setFocusable(true);
            mpl1bb001eb.requestFocus();
            Log.i(TAG, "mpl1bb001e: This Data is Required!");
            return false;
        } else {
            mpl1bb001eb.setError(null);
        }

        //=================== mpl1bb001f ==============
        if (mpl1bb001f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001f), Toast.LENGTH_SHORT).show();
            mpl1bb001fb.setError("This data is Required!");
            mpl1bb001fb.setFocusableInTouchMode(true);
            mpl1bb001fb.setFocusable(true);
            mpl1bb001fb.requestFocus();
            Log.i(TAG, "mpl1bb001f: This Data is Required!");
            return false;
        } else {
            mpl1bb001fb.setError(null);
        }

        if (mpl1bb001fa.isChecked()) {
            if (mpl1bb001fx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001f) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001fx.setError("This data is required");
                mpl1bb001fx.requestFocus();
                Log.d(TAG, " mpl1bb001fx :empty ");
                return false;
            } else {
                mpl1bb001fx.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001fx.getText().toString().isEmpty() ? "0" : mpl1bb001fx.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001fx.setError("Days cannnot be zero");
                mpl1bb001fx.requestFocus();
                Log.i(TAG, "mpl1bb001fx: days cannot not be zero");
                return false;
            } else {
                mpl1bb001fx.setError(null);
            }
        }

        //=================== mpl1bb001g ==============
        if (mpl1bb001g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001g), Toast.LENGTH_SHORT).show();
            mpl1bb001gb.setError("This data is Required!");
            mpl1bb001gb.setFocusableInTouchMode(true);
            mpl1bb001gb.setFocusable(true);
            mpl1bb001gb.requestFocus();
            Log.i(TAG, "mpl1bb001g: This Data is Required!");
            return false;
        } else {
            mpl1bb001gb.setError(null);
        }

        if (mpl1bb001ga.isChecked()) {
            if (mpl1bb001gx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001g) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001gx.setError("This data is required");
                mpl1bb001gx.requestFocus();
                Log.d(TAG, " mpl1bb001gx :empty ");
                return false;
            } else {
                mpl1bb001gx.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001gx.getText().toString().isEmpty() ? "0" : mpl1bb001gx.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mpl1bb001g) + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001gx.setError("Days cannnot be zero");
                mpl1bb001gx.requestFocus();
                Log.i(TAG, "mpl1bb001gx: days cannot not be zero");
                return false;
            } else {
                mpl1bb001gx.setError(null);
            }
        }

        //=================== mpl1bb001h ==============
        if (mpl1bb001h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001h), Toast.LENGTH_SHORT).show();
            mpl1bb001hb.setError("This data is Required!");
            mpl1bb001hb.setFocusableInTouchMode(true);
            mpl1bb001hb.setFocusable(true);
            mpl1bb001hb.requestFocus();
            Log.i(TAG, "mpl1bb001h: This Data is Required!");
            return false;
        } else {
            mpl1bb001hb.setError(null);
        }

        //=================== mpl1bb001i ==============
        if (mpl1bb001i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001i), Toast.LENGTH_SHORT).show();
            mpl1bb001ib.setError("This data is Required!");
            mpl1bb001ib.setFocusableInTouchMode(true);
            mpl1bb001ib.setFocusable(true);
            mpl1bb001ib.requestFocus();
            Log.i(TAG, "mpl1bb001i: This Data is Required!");
            return false;
        } else {
            mpl1bb001ib.setError(null);
        }

        //=================== mpl1bb001j ==============
        if (mpl1bb001j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001j), Toast.LENGTH_SHORT).show();
            mpl1bb001jb.setError("This data is Required!");
            mpl1bb001jb.setFocusableInTouchMode(true);
            mpl1bb001jb.setFocusable(true);
            mpl1bb001jb.requestFocus();
            Log.i(TAG, "mpl1bb001j: This Data is Required!");
            return false;
        } else {
            mpl1bb001jb.setError(null);
        }

        //=================== mpl1bb001k ==============
        if (mpl1bb001k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001k), Toast.LENGTH_SHORT).show();
            mpl1bb001kb.setError("This data is Required!");
            mpl1bb001kb.setFocusableInTouchMode(true);
            mpl1bb001kb.setFocusable(true);
            mpl1bb001kb.requestFocus();
            Log.i(TAG, "mpl1bb001k: This Data is Required!");
            return false;
        } else {
            mpl1bb001kb.setError(null);
        }

        //=================== mpl1bb001l ==============
        if (mpl1bb001l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001l), Toast.LENGTH_SHORT).show();
            mpl1bb001lb.setError("This data is Required!");
            mpl1bb001lb.setFocusableInTouchMode(true);
            mpl1bb001lb.setFocusable(true);
            mpl1bb001lb.requestFocus();
            Log.i(TAG, "mpl1bb001l: This Data is Required!");
            return false;
        } else {
            mpl1bb001lb.setError(null);
        }

        if (mpl1bb001la.isChecked()) {
            if (mpl1bb001lx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001l) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001lx.setError("This data is required");
                mpl1bb001lx.requestFocus();
                Log.d(TAG, " mpl1bb001lx :empty ");
                return false;
            } else {
                mpl1bb001lx.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001lx.getText().toString().isEmpty() ? "0" : mpl1bb001lx.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mpl1bb001l) + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001lx.setError("Days cannnot be zero");
                mpl1bb001lx.requestFocus();
                Log.i(TAG, "mpl1bb001lx: days cannot not be zero");
                return false;
            } else {
                mpl1bb001lx.setError(null);
            }
        }



        //=================== mpl1bb001m ==============
        if (mpl1bb001m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001m), Toast.LENGTH_SHORT).show();
            mpl1bb001mb.setError("This data is Required!");
            mpl1bb001mb.setFocusableInTouchMode(true);
            mpl1bb001mb.setFocusable(true);
            mpl1bb001mb.requestFocus();
            Log.i(TAG, "mpl1bb001m: This Data is Required!");
            return false;
        } else {
            mpl1bb001mb.setError(null);
        }

        if (mpl1bb001ma.isChecked()) {
            if (mpl1bb001mx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001m) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001mx.setError("This data is required");
                mpl1bb001mx.requestFocus();
                Log.d(TAG, " mpl1bb001mx :empty ");
                return false;
            } else {
                mpl1bb001mx.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001mx.getText().toString().isEmpty() ? "0" : mpl1bb001mx.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mpl1bb001m) + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001mx.setError("Days cannnot be zero");
                mpl1bb001mx.requestFocus();
                Log.i(TAG, "mpl1bb001mx: days cannot not be zero");
                return false;
            } else {
                mpl1bb001mx.setError(null);
            }
        }


        //=================== mpl1bb001n ==============
        if (mpl1bb001n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001n), Toast.LENGTH_SHORT).show();
            mpl1bb001nb.setError("This data is Required!");
            mpl1bb001nb.setFocusableInTouchMode(true);
            mpl1bb001nb.setFocusable(true);
            mpl1bb001nb.requestFocus();
            Log.i(TAG, "mpl1bb001n: This Data is Required!");
            return false;
        } else {
            mpl1bb001nb.setError(null);
        }

        if (mpl1bb001na.isChecked()) {
            if (mpl1bb001nx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001n) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001nx.setError("This data is required");
                mpl1bb001nx.requestFocus();
                Log.d(TAG, " mpl1bb001nx :empty ");
                return false;
            } else {
                mpl1bb001nx.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001nx.getText().toString().isEmpty() ? "0" : mpl1bb001nx.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mpl1bb001n) + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001nx.setError("Days cannnot be zero");
                mpl1bb001nx.requestFocus();
                Log.i(TAG, "mpl1bb001nx: days cannot not be zero");
                return false;
            } else {
                mpl1bb001nx.setError(null);
            }
        }


        //=================== mpl1bb001o ==============
        if (mpl1bb001o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001o), Toast.LENGTH_SHORT).show();
            mpl1bb001ob.setError("This data is Required!");
            mpl1bb001ob.setFocusableInTouchMode(true);
            mpl1bb001ob.setFocusable(true);
            mpl1bb001ob.requestFocus();
            Log.i(TAG, "mpl1bb001o: This Data is Required!");
            return false;
        } else {
            mpl1bb001ob.setError(null);
        }

        //=================== mpl1bb001p ==============
        if (mpl1bb001p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p), Toast.LENGTH_SHORT).show();
            mpl1bb001pb.setError("This data is Required!");
            mpl1bb001pb.setFocusableInTouchMode(true);
            mpl1bb001pb.setFocusable(true);
            mpl1bb001pb.requestFocus();
            Log.i(TAG, "mpl1bb001p: This Data is Required!");
            return false;
        } else {
            mpl1bb001pb.setError(null);
        }

        if (mpl1bb001pa.isChecked()) {
            if (mpl1bb001px.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                mpl1bb001px.setError("This data is required");
                mpl1bb001px.requestFocus();
                Log.d(TAG, " mpl1bb001px :empty ");
                return false;
            } else {
                mpl1bb001px.setError(null);
            }

            if ((Integer.parseInt(mpl1bb001px.getText().toString().isEmpty() ? "0" : mpl1bb001px.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.mpl1bb001p) + getString(R.string.day), Toast.LENGTH_LONG).show();
                mpl1bb001px.setError("Days cannnot be zero");
                mpl1bb001px.requestFocus();
                Log.i(TAG, "mpl1bb001px: days cannot not be zero");
                return false;
            } else {
                mpl1bb001px.setError(null);
            }


            // if (mpl1bb001pa.isChecked()) {
            //=================== mpl1bb001p1 ==============
            if (mpl1bb001p1.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p1), Toast.LENGTH_SHORT).show();
                mpl1bb001p199.setError("This data is Required!");
                mpl1bb001p199.setFocusableInTouchMode(true);
                mpl1bb001p199.setFocusable(true);
                mpl1bb001p199.requestFocus();
                Log.i(TAG, "mpl1bb001p1: This Data is Required!");
                return false;
            } else {
                mpl1bb001p199.setError(null);
            }

            //=================== mpl1bb001p2 ==============
            if (mpl1bb001p2.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p2), Toast.LENGTH_SHORT).show();
                mpl1bb001p299.setError("This data is Required!");
                mpl1bb001p299.setFocusableInTouchMode(true);
                mpl1bb001p299.setFocusable(true);
                mpl1bb001p299.requestFocus();
                Log.i(TAG, "mpl1bb001p2: This Data is Required!");
                return false;
            } else {
                mpl1bb001p299.setError(null);
            }

            //=================== mpl1bb001p3 ==============
            if (mpl1bb001p3.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p3), Toast.LENGTH_SHORT).show();
                mpl1bb001p399.setError("This data is Required!");
                mpl1bb001p399.setFocusableInTouchMode(true);
                mpl1bb001p399.setFocusable(true);
                mpl1bb001p399.requestFocus();
                Log.i(TAG, "mpl1bb001p3: This Data is Required!");
                return false;
            } else {
                mpl1bb001p399.setError(null);
            }

            //=================== mpl1bb001p4 ==============
            if (mpl1bb001p4.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001p4), Toast.LENGTH_SHORT).show();
                mpl1bb001p499.setError("This data is Required!");
                mpl1bb001p499.setFocusableInTouchMode(true);
                mpl1bb001p499.setFocusable(true);
                mpl1bb001p499.requestFocus();
                Log.i(TAG, "mpl1bb001p4: This Data is Required!");
                return false;
            } else {
                mpl1bb001p499.setError(null);
            }

            //=================== mpl1bb001q ==============
            if (mpl1bb001q.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb001q), Toast.LENGTH_SHORT).show();
                mpl1bb001qb.setError("This data is Required!");
                mpl1bb001qb.setFocusableInTouchMode(true);
                mpl1bb001qb.setFocusable(true);
                mpl1bb001qb.requestFocus();
                Log.i(TAG, "mpl1bb001q: This Data is Required!");
                return false;
            } else {
                mpl1bb001qb.setError(null);
            }
        }
        //}

        //=================== mpl1bb002a ==============
        if (mpl1bb002a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002a), Toast.LENGTH_SHORT).show();
            mpl1bb002ab.setError("This data is Required!");
            mpl1bb002ab.setFocusableInTouchMode(true);
            mpl1bb002ab.setFocusable(true);
            mpl1bb002ab.requestFocus();
            Log.i(TAG, "mpl1bb002a: This Data is Required!");
            return false;
        } else {
            mpl1bb002ab.setError(null);
        }

        //=================== mpl1bb002b ==============
        if (mpl1bb002b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002b), Toast.LENGTH_SHORT).show();
            mpl1bb002bb.setError("This data is Required!");
            mpl1bb002bb.setFocusableInTouchMode(true);
            mpl1bb002bb.setFocusable(true);
            mpl1bb002bb.requestFocus();
            Log.i(TAG, "mpl1bb002b: This Data is Required!");
            return false;
        } else {
            mpl1bb002bb.setError(null);
        }

        //=================== mpl1bb002c ==============
        if (mpl1bb002c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002c), Toast.LENGTH_SHORT).show();
            mpl1bb002cb.setError("This data is Required!");
            mpl1bb002cb.setFocusableInTouchMode(true);
            mpl1bb002cb.setFocusable(true);
            mpl1bb002cb.requestFocus();
            Log.i(TAG, "mpl1bb002c: This Data is Required!");
            return false;
        } else {
            mpl1bb002cb.setError(null);
        }

        //=================== mpl1bb002d ==============
        if (mpl1bb002d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002d), Toast.LENGTH_SHORT).show();
            mpl1bb002db.setError("This data is Required!");
            mpl1bb002db.setFocusableInTouchMode(true);
            mpl1bb002db.setFocusable(true);
            mpl1bb002db.requestFocus();
            Log.i(TAG, "mpl1bb002d: This Data is Required!");
            return false;
        } else {
            mpl1bb002db.setError(null);
        }

        //=================== mpl1bb002e ==============
        if (mpl1bb002e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002e), Toast.LENGTH_SHORT).show();
            mpl1bb002eb.setError("This data is Required!");
            mpl1bb002eb.setFocusableInTouchMode(true);
            mpl1bb002eb.setFocusable(true);
            mpl1bb002eb.requestFocus();
            Log.i(TAG, "mpl1bb002e: This Data is Required!");
            return false;
        } else {
            mpl1bb002eb.setError(null);
        }

        //=================== mpl1bb002f ==============
        if (mpl1bb002f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002f), Toast.LENGTH_SHORT).show();
            mpl1bb002fb.setError("This data is Required!");
            mpl1bb002fb.setFocusableInTouchMode(true);
            mpl1bb002fb.setFocusable(true);
            mpl1bb002fb.requestFocus();
            Log.i(TAG, "mpl1bb002f: This Data is Required!");
            return false;
        } else {
            mpl1bb002fb.setError(null);
        }

        //=================== mpl1bb002g ==============
        if (mpl1bb002g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002g), Toast.LENGTH_SHORT).show();
            mpl1bb002gb.setError("This data is Required!");
            mpl1bb002gb.setFocusableInTouchMode(true);
            mpl1bb002gb.setFocusable(true);
            mpl1bb002gb.requestFocus();
            Log.i(TAG, "mpl1bb002g: This Data is Required!");
            return false;
        } else {
            mpl1bb002gb.setError(null);
        }

        //=================== mpl1bb002h ==============
        if (mpl1bb002h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002h), Toast.LENGTH_SHORT).show();
            mpl1bb002hb.setError("This data is Required!");
            mpl1bb002hb.setFocusableInTouchMode(true);
            mpl1bb002hb.setFocusable(true);
            mpl1bb002hb.requestFocus();
            Log.i(TAG, "mpl1bb002h: This Data is Required!");
            return false;
        } else {
            mpl1bb002hb.setError(null);
        }

        //=================== mpl1bb002i ==============
        if (mpl1bb002i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002i), Toast.LENGTH_SHORT).show();
            mpl1bb002ib.setError("This data is Required!");
            mpl1bb002ib.setFocusableInTouchMode(true);
            mpl1bb002ib.setFocusable(true);
            mpl1bb002ib.requestFocus();
            Log.i(TAG, "mpl1bb002i: This Data is Required!");
            return false;
        } else {
            mpl1bb002ib.setError(null);
        }

        //=================== mpl1bb002j ==============
        if (mpl1bb002j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002j), Toast.LENGTH_SHORT).show();
            mpl1bb002jb.setError("This data is Required!");
            mpl1bb002jb.setFocusableInTouchMode(true);
            mpl1bb002jb.setFocusable(true);
            mpl1bb002jb.requestFocus();
            Log.i(TAG, "mpl1bb002j: This Data is Required!");
            return false;
        } else {
            mpl1bb002jb.setError(null);
        }

        //=================== mpl1bb002k ==============
        if (mpl1bb002k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002k), Toast.LENGTH_SHORT).show();
            mpl1bb002kb.setError("This data is Required!");
            mpl1bb002kb.setFocusableInTouchMode(true);
            mpl1bb002kb.setFocusable(true);
            mpl1bb002kb.requestFocus();
            Log.i(TAG, "mpl1bb002k: This Data is Required!");
            return false;
        } else {
            mpl1bb002kb.setError(null);
        }

        //=================== mpl1bb002l ==============
        if (mpl1bb002l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002l), Toast.LENGTH_SHORT).show();
            mpl1bb002lb.setError("This data is Required!");
            mpl1bb002lb.setFocusableInTouchMode(true);
            mpl1bb002lb.setFocusable(true);
            mpl1bb002lb.requestFocus();
            Log.i(TAG, "mpl1bb002l: This Data is Required!");
            return false;
        } else {
            mpl1bb002lb.setError(null);
        }

        //=================== mpl1bb002m ==============
        if (mpl1bb002m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002m), Toast.LENGTH_SHORT).show();
            mpl1bb002mb.setError("This data is Required!");
            mpl1bb002mb.setFocusableInTouchMode(true);
            mpl1bb002mb.setFocusable(true);
            mpl1bb002mb.requestFocus();
            Log.i(TAG, "mpl1bb002m: This Data is Required!");
            return false;
        } else {
            mpl1bb002mb.setError(null);
        }

        //=================== mpl1bb002n ==============
        if (mpl1bb002n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002n), Toast.LENGTH_SHORT).show();
            mpl1bb002nb.setError("This data is Required!");
            mpl1bb002nb.setFocusableInTouchMode(true);
            mpl1bb002nb.setFocusable(true);
            mpl1bb002nb.requestFocus();
            Log.i(TAG, "mpl1bb002n: This Data is Required!");
            return false;
        } else {
            mpl1bb002nb.setError(null);
        }

        //=================== mpl1bb002o ==============
        if (mpl1bb002o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002o), Toast.LENGTH_SHORT).show();
            mpl1bb002ob.setError("This data is Required!");
            mpl1bb002ob.setFocusableInTouchMode(true);
            mpl1bb002ob.setFocusable(true);
            mpl1bb002ob.requestFocus();
            Log.i(TAG, "mpl1bb002o: This Data is Required!");
            return false;
        } else {
            mpl1bb002ob.setError(null);
        }

        //=================== mpl1bb002p ==============
        if (mpl1bb002p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002p), Toast.LENGTH_SHORT).show();
            mpl1bb002pb.setError("This data is Required!");
            mpl1bb002pb.setFocusableInTouchMode(true);
            mpl1bb002pb.setFocusable(true);
            mpl1bb002pb.requestFocus();
            Log.i(TAG, "mpl1bb002p: This Data is Required!");
            return false;
        } else {
            mpl1bb002pb.setError(null);
        }

        //=================== mpl1bb002q ==============
        if (mpl1bb002q.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002q), Toast.LENGTH_SHORT).show();
            mpl1bb002qb.setError("This data is Required!");
            mpl1bb002qb.setFocusableInTouchMode(true);
            mpl1bb002qb.setFocusable(true);
            mpl1bb002qb.requestFocus();
            Log.i(TAG, "mpl1bb002q: This Data is Required!");
            return false;
        } else {
            mpl1bb002qb.setError(null);
        }

        //=================== mpl1bb002r ==============
        if (mpl1bb002r.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002r), Toast.LENGTH_SHORT).show();
            mpl1bb002rb.setError("This data is Required!");
            mpl1bb002rb.setFocusableInTouchMode(true);
            mpl1bb002rb.setFocusable(true);
            mpl1bb002rb.requestFocus();
            Log.i(TAG, "mpl1bb002r: This Data is Required!");
            return false;
        } else {
            mpl1bb002rb.setError(null);
        }

        //=================== mpl1bb002s ==============
        if (mpl1bb002s.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002s), Toast.LENGTH_SHORT).show();
            mpl1bb002sb.setError("This data is Required!");
            mpl1bb002sb.setFocusableInTouchMode(true);
            mpl1bb002sb.setFocusable(true);
            mpl1bb002sb.requestFocus();
            Log.i(TAG, "mpl1bb002s: This Data is Required!");
            return false;
        } else {
            mpl1bb002sb.setError(null);
        }

        if (mpl1bb002t.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002t), Toast.LENGTH_SHORT).show();
            mpl1bb002tb.setError("This data is Required!");
            mpl1bb002tb.setFocusableInTouchMode(true);
            mpl1bb002tb.setFocusable(true);
            mpl1bb002tb.requestFocus();
            Log.i(TAG, "mpl1bb002t: This Data is Required!");
            return false;
        } else {
            mpl1bb002tb.setError(null);
        }

        //=================== mpl1bb002u ==============
        if (mpl1bb002u.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002u), Toast.LENGTH_SHORT).show();
            mpl1bb002ub.setError("This data is Required!");
            mpl1bb002ub.setFocusableInTouchMode(true);
            mpl1bb002ub.setFocusable(true);
            mpl1bb002ub.requestFocus();
            Log.i(TAG, "mpl1bb002u: This Data is Required!");
            return false;
        } else {
            mpl1bb002ub.setError(null);
        }

        //=================== mpl1bb002v ==============
        if (mpl1bb002v.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002v), Toast.LENGTH_SHORT).show();
            mpl1bb002vb.setError("This data is Required!");
            mpl1bb002vb.setFocusableInTouchMode(true);
            mpl1bb002vb.setFocusable(true);
            mpl1bb002vb.requestFocus();
            Log.i(TAG, "mpl1bb002v: This Data is Required!");
            return false;
        } else {
            mpl1bb002vb.setError(null);
        }

        //=================== mpl1bb002a ==============
        if (mpl1bb002w.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002w), Toast.LENGTH_SHORT).show();
            mpl1bb002wb.setError("This data is Required!");
            mpl1bb002wb.setFocusableInTouchMode(true);
            mpl1bb002wb.setFocusable(true);
            mpl1bb002wb.requestFocus();
            Log.i(TAG, "mpl1bb002w: This Data is Required!");
            return false;
        } else {
            mpl1bb002wb.setError(null);
        }

        //=================== mpl1bb002x ==============
        if (mpl1bb002x.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002x), Toast.LENGTH_SHORT).show();
            mpl1bb002xb.setError("This data is Required!");
            mpl1bb002xb.setFocusableInTouchMode(true);
            mpl1bb002xb.setFocusable(true);
            mpl1bb002xb.requestFocus();
            Log.i(TAG, "mpl1bb002x: This Data is Required!");
            return false;
        } else {
            mpl1bb002xb.setError(null);
        }

        //=================== mpl1bb002y ==============
        if (mpl1bb002y.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002y), Toast.LENGTH_SHORT).show();
            mpl1bb002yb.setError("This data is Required!");
            mpl1bb002yb.setFocusableInTouchMode(true);
            mpl1bb002yb.setFocusable(true);
            mpl1bb002yb.requestFocus();
            Log.i(TAG, "mpl1bb002y: This Data is Required!");
            return false;
        } else {
            mpl1bb002yb.setError(null);
        }

        //=================== mpl1bb002z ==============
        if (mpl1bb002z.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002z), Toast.LENGTH_SHORT).show();
            mpl1bb002zb.setError("This data is Required!");
            mpl1bb002zb.setFocusableInTouchMode(true);
            mpl1bb002zb.setFocusable(true);
            mpl1bb002zb.requestFocus();
            Log.i(TAG, "mpl1bb002z: This Data is Required!");
            return false;
        } else {
            mpl1bb002zb.setError(null);
        }

        //=================== mpl1bb002aaa ==============
        if (mpl1bb002aaa.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002aaa), Toast.LENGTH_SHORT).show();
            mpl1bb002aaab.setError("This data is Required!");
            mpl1bb002aaab.setFocusableInTouchMode(true);
            mpl1bb002aaab.setFocusable(true);
            mpl1bb002aaab.requestFocus();
            Log.i(TAG, "mpl1bb002aaa: This Data is Required!");
            return false;
        } else {
            mpl1bb002aaab.setError(null);
        }

        //=================== mpl1bb002bbb ==============
        if (mpl1bb002bbb.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002bbb), Toast.LENGTH_SHORT).show();
            mpl1bb002bbbb.setError("This data is Required!");
            mpl1bb002bbbb.setFocusableInTouchMode(true);
            mpl1bb002bbbb.setFocusable(true);
            mpl1bb002bbbb.requestFocus();
            Log.i(TAG, "mpl1bb002bbb: This Data is Required!");
            return false;
        } else {
            mpl1bb002bbbb.setError(null);
        }

        //=================== mpl1bb002ccc ==============
        if (mpl1bb002ccc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002ccc), Toast.LENGTH_SHORT).show();
            mpl1bb002cccb.setError("This data is Required!");
            mpl1bb002cccb.setFocusableInTouchMode(true);
            mpl1bb002cccb.setFocusable(true);
            mpl1bb002cccb.requestFocus();
            Log.i(TAG, "mpl1bb002ccc: This Data is Required!");
            return false;
        } else {
            mpl1bb002cccb.setError(null);
        }

        if (mpl1bb002ccca.isChecked() && mpl1bb002cccx.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bb002ccc), Toast.LENGTH_SHORT).show();
            mpl1bb002cccx.setError("This data is Required!");
            mpl1bb002cccx.requestFocus();
            Log.i(TAG, "mpl1bb002ccc: This Data is Required!");
            return false;
        } else {
            mpl1bb002cccx.setError(null);
        }




        return true;

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}

    


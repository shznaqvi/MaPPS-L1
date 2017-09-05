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

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.mpl1bc001a)
    RadioGroup mpl1bc001a;
    @BindView(R.id.mpl1bc001aa)
    RadioButton mpl1bc001aa;
    @BindView(R.id.mpl1bc001ab)
    RadioButton mpl1bc001ab;
    @BindView(R.id.mpl1bc001b)
    RadioGroup mpl1bc001b;
    @BindView(R.id.mpl1bc001ba)
    RadioButton mpl1bc001ba;
    @BindView(R.id.mpl1bc001bb)
    RadioButton mpl1bc001bb;
    @BindView(R.id.mpl1bc001c)
    RadioGroup mpl1bc001c;
    @BindView(R.id.mpl1bc001ca)
    RadioButton mpl1bc001ca;
    @BindView(R.id.mpl1bc001cb)
    RadioButton mpl1bc001cb;
    @BindView(R.id.mpl1bc001d)
    RadioGroup mpl1bc001d;
    @BindView(R.id.mpl1bc001da)
    RadioButton mpl1bc001da;
    @BindView(R.id.mpl1bc001db)
    RadioButton mpl1bc001db;
    @BindView(R.id.mpl1bc001e)
    RadioGroup mpl1bc001e;
    @BindView(R.id.mpl1bc001ea)
    RadioButton mpl1bc001ea;
    @BindView(R.id.mpl1bc001eb)
    RadioButton mpl1bc001eb;
    @BindView(R.id.mpl1bc001f)
    RadioGroup mpl1bc001f;
    @BindView(R.id.mpl1bc001fa)
    RadioButton mpl1bc001fa;
    @BindView(R.id.mpl1bc001fb)
    RadioButton mpl1bc001fb;
    @BindView(R.id.mpl1bc001fx)
    EditText mpl1bc001fx;
    @BindView(R.id.mpl1bc001g)
    RadioGroup mpl1bc001g;
    @BindView(R.id.mpl1bc001ga)
    RadioButton mpl1bc001ga;
    @BindView(R.id.mpl1bc001gb)
    RadioButton mpl1bc001gb;
    @BindView(R.id.mpl1bc001h)
    RadioGroup mpl1bc001h;
    @BindView(R.id.mpl1bc001ha)
    RadioButton mpl1bc001ha;
    @BindView(R.id.mpl1bc001hb)
    RadioButton mpl1bc001hb;
    @BindView(R.id.mpl1bc001i)
    RadioGroup mpl1bc001i;
    @BindView(R.id.mpl1bc001ia)
    RadioButton mpl1bc001ia;
    @BindView(R.id.mpl1bc001ib)
    RadioButton mpl1bc001ib;
    @BindView(R.id.mpl1bc001ix)
    EditText mpl1bc001ix;
    @BindView(R.id.mpl1bc001j)
    RadioGroup mpl1bc001j;
    @BindView(R.id.mpl1bc001ja)
    RadioButton mpl1bc001ja;
    @BindView(R.id.mpl1bc001jb)
    RadioButton mpl1bc001jb;
    @BindView(R.id.mpl1bc001jsub)
    RadioGroup mpl1bc001jsub;
    @BindView(R.id.mpl1bc001jsuba)
    RadioButton mpl1bc001jsuba;
    @BindView(R.id.mpl1bc001jsubb)
    RadioButton mpl1bc001jsubb;
    @BindView(R.id.mpl1bc001jsubc)
    RadioButton mpl1bc001jsubc;
    @BindView(R.id.mpl1bc001k)
    RadioGroup mpl1bc001k;
    @BindView(R.id.mpl1bc001ka)
    RadioButton mpl1bc001ka;
    @BindView(R.id.mpl1bc001kb)
    RadioButton mpl1bc001kb;
    @BindView(R.id.mpl1bc001l)
    RadioGroup mpl1bc001l;
    @BindView(R.id.mpl1bc001la)
    RadioButton mpl1bc001la;
    @BindView(R.id.mpl1bc001lb)
    RadioButton mpl1bc001lb;
    @BindView(R.id.mpl1bc001lsub)
    RadioGroup mpl1bc001lsub;
    @BindView(R.id.mpl1bc001lsuba)
    RadioButton mpl1bc001lsuba;
    @BindView(R.id.mpl1bc001lsubb)
    RadioButton mpl1bc001lsubb;
    @BindView(R.id.mpl1bc001lsubc)
    RadioButton mpl1bc001lsubc;
    @BindView(R.id.mpl1bc001m)
    RadioGroup mpl1bc001m;
    @BindView(R.id.mpl1bc001ma)
    RadioButton mpl1bc001ma;
    @BindView(R.id.mpl1bc001mb)
    RadioButton mpl1bc001mb;
    @BindView(R.id.mpl1bc001msub)
    RadioGroup mpl1bc001msub;
    @BindView(R.id.mpl1bc001msuba)
    RadioButton mpl1bc001msuba;
    @BindView(R.id.mpl1bc001msubb)
    RadioButton mpl1bc001msubb;
    @BindView(R.id.mpl1bc001msubc)
    RadioButton mpl1bc001msubc;
    @BindView(R.id.mpl1bc001n)
    RadioGroup mpl1bc001n;
    @BindView(R.id.mpl1bc001na)
    RadioButton mpl1bc001na;
    @BindView(R.id.mpl1bc001nb)
    RadioButton mpl1bc001nb;
    @BindView(R.id.mpl1bc001nsub)
    RadioGroup mpl1bc001nsub;
    @BindView(R.id.mpl1bc001nsuba)
    RadioButton mpl1bc001nsuba;
    @BindView(R.id.mpl1bc001nsubb)
    RadioButton mpl1bc001nsubb;
    @BindView(R.id.mpl1bc001nsubc)
    RadioButton mpl1bc001nsubc;
    @BindView(R.id.mpl1bc001o)
    RadioGroup mpl1bc001o;
    @BindView(R.id.mpl1bc001oa)
    RadioButton mpl1bc001oa;
    @BindView(R.id.mpl1bc001ob)
    RadioButton mpl1bc001ob;
    @BindView(R.id.mpl1bc001osub)
    RadioGroup mpl1bc001osub;
    @BindView(R.id.mpl1bc001osuba)
    RadioButton mpl1bc001osuba;
    @BindView(R.id.mpl1bc001osubb)
    RadioButton mpl1bc001osubb;
    @BindView(R.id.mpl1bc001osubc)
    RadioButton mpl1bc001osubc;
    @BindView(R.id.mpl1bc001p)
    RadioGroup mpl1bc001p;
    @BindView(R.id.mpl1bc001pa)
    RadioButton mpl1bc001pa;
    @BindView(R.id.mpl1bc001pb)
    RadioButton mpl1bc001pb;
    @BindView(R.id.mpl1bc001q)
    RadioGroup mpl1bc001q;
    @BindView(R.id.mpl1bc001qa)
    RadioButton mpl1bc001qa;
    @BindView(R.id.mpl1bc001qb)
    RadioButton mpl1bc001qb;
    @BindView(R.id.mpl1bc001qsub)
    RadioGroup mpl1bc001qsub;
    @BindView(R.id.mpl1bc001qsuba)
    RadioButton mpl1bc001qsuba;
    @BindView(R.id.mpl1bc001qsubb)
    RadioButton mpl1bc001qsubb;
    @BindView(R.id.mpl1bc001qsubc)
    RadioButton mpl1bc001qsubc;
    @BindView(R.id.mpl1bc001r)
    RadioGroup mpl1bc001r;
    @BindView(R.id.mpl1bc001ra)
    RadioButton mpl1bc001ra;
    @BindView(R.id.mpl1bc001rb)
    RadioButton mpl1bc001rb;
    @BindView(R.id.mpl1bc001rsub)
    RadioGroup mpl1bc001rsub;
    @BindView(R.id.mpl1bc001rsuba)
    RadioButton mpl1bc001rsuba;
    @BindView(R.id.mpl1bc001rsubb)
    RadioButton mpl1bc001rsubb;
    @BindView(R.id.mpl1bc001rsubc)
    RadioButton mpl1bc001rsubc;
    @BindView(R.id.fldGrp001r)
    LinearLayout fldGrp001r;
    @BindView(R.id.mpl1bc001r1)
    RadioGroup mpl1bc001r1;
    @BindView(R.id.mpl1bc001r1a)
    RadioButton mpl1bc001r1a;
    @BindView(R.id.mpl1bc001r1b)
    RadioButton mpl1bc001r1b;
    @BindView(R.id.mpl1bc001r1c)
    RadioButton mpl1bc001r1c;
    @BindView(R.id.mpl1bc001r2)
    RadioGroup mpl1bc001r2;
    @BindView(R.id.mpl1bc001r2a)
    RadioButton mpl1bc001r2a;
    @BindView(R.id.mpl1bc001r2b)
    RadioButton mpl1bc001r2b;
    @BindView(R.id.mpl1bc001r2c)
    RadioButton mpl1bc001r2c;
    @BindView(R.id.mpl1bc001r3)
    RadioGroup mpl1bc001r3;
    @BindView(R.id.mpl1bc001r3a)
    RadioButton mpl1bc001r3a;
    @BindView(R.id.mpl1bc001r3b)
    RadioButton mpl1bc001r3b;
    @BindView(R.id.mpl1bc001r3c)
    RadioButton mpl1bc001r3c;
    @BindView(R.id.mpl1bc001r4)
    RadioGroup mpl1bc001r4;
    @BindView(R.id.mpl1bc001r4a)
    RadioButton mpl1bc001r4a;
    @BindView(R.id.mpl1bc001r4b)
    RadioButton mpl1bc001r4b;
    @BindView(R.id.mpl1bc001r4c)
    RadioButton mpl1bc001r4c;
    @BindView(R.id.mpl1bc002a)
    RadioGroup mpl1bc002a;
    @BindView(R.id.mpl1bc002aa)
    RadioButton mpl1bc002aa;
    @BindView(R.id.mpl1bc002ab)
    RadioButton mpl1bc002ab;
    @BindView(R.id.mpl1bc002b)
    RadioGroup mpl1bc002b;
    @BindView(R.id.mpl1bc002ba)
    RadioButton mpl1bc002ba;
    @BindView(R.id.mpl1bc002bb)
    RadioButton mpl1bc002bb;
    @BindView(R.id.mpl1bc002c)
    RadioGroup mpl1bc002c;
    @BindView(R.id.mpl1bc002ca)
    RadioButton mpl1bc002ca;
    @BindView(R.id.mpl1bc002cb)
    RadioButton mpl1bc002cb;
    @BindView(R.id.mpl1bc002d)
    RadioGroup mpl1bc002d;
    @BindView(R.id.mpl1bc002da)
    RadioButton mpl1bc002da;
    @BindView(R.id.mpl1bc002db)
    RadioButton mpl1bc002db;
    @BindView(R.id.mpl1bc002e)
    RadioGroup mpl1bc002e;
    @BindView(R.id.mpl1bc002ea)
    RadioButton mpl1bc002ea;
    @BindView(R.id.mpl1bc002eb)
    RadioButton mpl1bc002eb;
    @BindView(R.id.mpl1bc002f)
    RadioGroup mpl1bc002f;
    @BindView(R.id.mpl1bc002fa)
    RadioButton mpl1bc002fa;
    @BindView(R.id.mpl1bc002fb)
    RadioButton mpl1bc002fb;
    @BindView(R.id.mpl1bc002g)
    RadioGroup mpl1bc002g;
    @BindView(R.id.mpl1bc002ga)
    RadioButton mpl1bc002ga;
    @BindView(R.id.mpl1bc002gb)
    RadioButton mpl1bc002gb;
    @BindView(R.id.mpl1bc002h)
    RadioGroup mpl1bc002h;
    @BindView(R.id.mpl1bc002ha)
    RadioButton mpl1bc002ha;
    @BindView(R.id.mpl1bc002hb)
    RadioButton mpl1bc002hb;
    @BindView(R.id.mpl1bc002i)
    RadioGroup mpl1bc002i;
    @BindView(R.id.mpl1bc002ia)
    RadioButton mpl1bc002ia;
    @BindView(R.id.mpl1bc002ib)
    RadioButton mpl1bc002ib;
    @BindView(R.id.mpl1bc002j)
    RadioGroup mpl1bc002j;
    @BindView(R.id.mpl1bc002ja)
    RadioButton mpl1bc002ja;
    @BindView(R.id.mpl1bc002jb)
    RadioButton mpl1bc002jb;
    @BindView(R.id.mpl1bc002k)
    RadioGroup mpl1bc002k;
    @BindView(R.id.mpl1bc002ka)
    RadioButton mpl1bc002ka;
    @BindView(R.id.mpl1bc002kb)
    RadioButton mpl1bc002kb;
    @BindView(R.id.mpl1bc002l)
    RadioGroup mpl1bc002l;
    @BindView(R.id.mpl1bc002la)
    RadioButton mpl1bc002la;
    @BindView(R.id.mpl1bc002lb)
    RadioButton mpl1bc002lb;
    @BindView(R.id.mpl1bc002m)
    RadioGroup mpl1bc002m;
    @BindView(R.id.mpl1bc002ma)
    RadioButton mpl1bc002ma;
    @BindView(R.id.mpl1bc002mb)
    RadioButton mpl1bc002mb;
    @BindView(R.id.mpl1bc002n)
    RadioGroup mpl1bc002n;
    @BindView(R.id.mpl1bc002na)
    RadioButton mpl1bc002na;
    @BindView(R.id.mpl1bc002nb)
    RadioButton mpl1bc002nb;
    @BindView(R.id.mpl1bc002o)
    RadioGroup mpl1bc002o;
    @BindView(R.id.mpl1bc002oa)
    RadioButton mpl1bc002oa;
    @BindView(R.id.mpl1bc002ob)
    RadioButton mpl1bc002ob;
    @BindView(R.id.mpl1bc002p)
    RadioGroup mpl1bc002p;
    @BindView(R.id.mpl1bc002pa)
    RadioButton mpl1bc002pa;
    @BindView(R.id.mpl1bc002pb)
    RadioButton mpl1bc002pb;
    @BindView(R.id.mpl1bc002q)
    RadioGroup mpl1bc002q;
    @BindView(R.id.mpl1bc002qa)
    RadioButton mpl1bc002qa;
    @BindView(R.id.mpl1bc002qb)
    RadioButton mpl1bc002qb;
    @BindView(R.id.mpl1bc002r)
    RadioGroup mpl1bc002r;
    @BindView(R.id.mpl1bc002ra)
    RadioButton mpl1bc002ra;
    @BindView(R.id.mpl1bc002rb)
    RadioButton mpl1bc002rb;
    @BindView(R.id.mpl1bc003a)
    RadioGroup mpl1bc003a;
    @BindView(R.id.mpl1bc003aa)
    RadioButton mpl1bc003aa;
    @BindView(R.id.mpl1bc003ab)
    RadioButton mpl1bc003ab;
    @BindView(R.id.mpl1bc003b)
    RadioGroup mpl1bc003b;
    @BindView(R.id.mpl1bc003ba)
    RadioButton mpl1bc003ba;
    @BindView(R.id.mpl1bc003bb)
    RadioButton mpl1bc003bb;
    @BindView(R.id.mpl1bc003c)
    RadioGroup mpl1bc003c;
    @BindView(R.id.mpl1bc003ca)
    RadioButton mpl1bc003ca;
    @BindView(R.id.mpl1bc003cb)
    RadioButton mpl1bc003cb;
    @BindView(R.id.mpl1bc003d)
    RadioGroup mpl1bc003d;
    @BindView(R.id.mpl1bc003da)
    RadioButton mpl1bc003da;
    @BindView(R.id.mpl1bc003db)
    RadioButton mpl1bc003db;
    @BindView(R.id.mpl1bc003e)
    RadioGroup mpl1bc003e;
    @BindView(R.id.mpl1bc003ea)
    RadioButton mpl1bc003ea;
    @BindView(R.id.mpl1bc003eb)
    RadioButton mpl1bc003eb;
    @BindView(R.id.mpl1bc003f)
    RadioGroup mpl1bc003f;
    @BindView(R.id.mpl1bc003fa)
    RadioButton mpl1bc003fa;
    @BindView(R.id.mpl1bc003fb)
    RadioButton mpl1bc003fb;
    @BindView(R.id.mpl1bc003g)
    RadioGroup mpl1bc003g;
    @BindView(R.id.mpl1bc003ga)
    RadioButton mpl1bc003ga;
    @BindView(R.id.mpl1bc003gb)
    RadioButton mpl1bc003gb;
    @BindView(R.id.mpl1bc003h)
    RadioGroup mpl1bc003h;
    @BindView(R.id.mpl1bc003ha)
    RadioButton mpl1bc003ha;
    @BindView(R.id.mpl1bc003hb)
    RadioButton mpl1bc003hb;
    @BindView(R.id.mpl1bc003i)
    RadioGroup mpl1bc003i;
    @BindView(R.id.mpl1bc003ia)
    RadioButton mpl1bc003ia;
    @BindView(R.id.mpl1bc003ib)
    RadioButton mpl1bc003ib;
    @BindView(R.id.mpl1bc003j)
    RadioGroup mpl1bc003j;
    @BindView(R.id.mpl1bc003ja)
    RadioButton mpl1bc003ja;
    @BindView(R.id.mpl1bc003jb)
    RadioButton mpl1bc003jb;
    @BindView(R.id.mpl1bc003k)
    RadioGroup mpl1bc003k;
    @BindView(R.id.mpl1bc003ka)
    RadioButton mpl1bc003ka;
    @BindView(R.id.mpl1bc003kb)
    RadioButton mpl1bc003kb;
    @BindView(R.id.mpl1bc003l)
    RadioGroup mpl1bc003l;
    @BindView(R.id.mpl1bc003la)
    RadioButton mpl1bc003la;
    @BindView(R.id.mpl1bc003lb)
    RadioButton mpl1bc003lb;
    @BindView(R.id.mpl1bc003m)
    RadioGroup mpl1bc003m;
    @BindView(R.id.mpl1bc003ma)
    RadioButton mpl1bc003ma;
    @BindView(R.id.mpl1bc003mb)
    RadioButton mpl1bc003mb;
    @BindView(R.id.mpl1bc003n)
    RadioGroup mpl1bc003n;
    @BindView(R.id.mpl1bc003na)
    RadioButton mpl1bc003na;
    @BindView(R.id.mpl1bc003nb)
    RadioButton mpl1bc003nb;
    @BindView(R.id.mpl1bc003o)
    RadioGroup mpl1bc003o;
    @BindView(R.id.mpl1bc003oa)
    RadioButton mpl1bc003oa;
    @BindView(R.id.mpl1bc003ob)
    RadioButton mpl1bc003ob;
    @BindView(R.id.mpl1bc00388)
    RadioGroup mpl1bc00388;
    @BindView(R.id.mpl1bc00388a)
    RadioButton mpl1bc00388a;
    @BindView(R.id.mpl1bc00388b)
    RadioButton mpl1bc00388b;

    @BindView(R.id.fldGrp001jsub)
    LinearLayout fldGrp001jsub;
    @BindView(R.id.fldGrp001lsub)
    LinearLayout fldGrp001lsub;
    @BindView(R.id.fldGrp001msub)
    LinearLayout fldGrp001msub;
    @BindView(R.id.fldGrp001nsub)
    LinearLayout fldGrp001nsub;
    @BindView(R.id.fldGrp001osub)
    LinearLayout fldGrp001osub;
    @BindView(R.id.fldGrp001qsub)
    LinearLayout fldGrp001qsub;
    @BindView(R.id.fldGrp001rsub)
    LinearLayout fldGrp001rsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        mpl1bc001fa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bc001fx.setVisibility(View.VISIBLE);
                } else {
                    mpl1bc001fx.setVisibility(View.GONE);
                    mpl1bc001fx.setText(null);
                }
            }
        });

        mpl1bc001ia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bc001ix.setVisibility(View.VISIBLE);
                } else {
                    mpl1bc001ix.setVisibility(View.GONE);
                    mpl1bc001ix.setText(null);
                }
            }
        });

        mpl1bc001ja.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001jsub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001jsub.setVisibility(View.GONE);
                    mpl1bc001jsub.clearCheck();
                }
            }
        });

        mpl1bc001la.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001lsub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001lsub.setVisibility(View.GONE);
                    mpl1bc001lsub.clearCheck();
                }
            }
        });

        mpl1bc001ma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001msub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001msub.setVisibility(View.GONE);
                    mpl1bc001msub.clearCheck();
                }
            }
        });

        mpl1bc001na.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001nsub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001nsub.setVisibility(View.GONE);
                    mpl1bc001nsub.clearCheck();
                }
            }
        });

        mpl1bc001oa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001osub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001osub.setVisibility(View.GONE);
                    mpl1bc001osub.clearCheck();
                }
            }
        });

        mpl1bc001qa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001qsub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001qsub.setVisibility(View.GONE);
                    mpl1bc001qsub.clearCheck();
                }
            }
        });

        mpl1bc001ra.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001rsub.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001rsub.setVisibility(View.GONE);
                    mpl1bc001rsub.clearCheck();
                }
            }
        });

        mpl1bc001rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp001r.setVisibility(View.GONE);
                } else {
                    fldGrp001r.setVisibility(View.VISIBLE);
                    mpl1bc001r1.clearCheck();
                    mpl1bc001r2.clearCheck();
                    mpl1bc001r3.clearCheck();
                    mpl1bc001r4.clearCheck();
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


                startActivity(new Intent(this, SectionEActivity.class));

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


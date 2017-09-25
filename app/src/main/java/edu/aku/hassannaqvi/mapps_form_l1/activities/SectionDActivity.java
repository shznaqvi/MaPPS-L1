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
    @BindView(R.id.mpl1bc001jx)
    RadioGroup mpl1bc001jx;
    @BindView(R.id.mpl1bc001jxa)
    RadioButton mpl1bc001jxa;
    @BindView(R.id.mpl1bc001jxb)
    RadioButton mpl1bc001jxb;
    @BindView(R.id.mpl1bc001jxc)
    RadioButton mpl1bc001jxc;
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
    @BindView(R.id.mpl1bc001lx)
    RadioGroup mpl1bc001lx;
    @BindView(R.id.mpl1bc001lxa)
    RadioButton mpl1bc001lxa;
    @BindView(R.id.mpl1bc001lxb)
    RadioButton mpl1bc001lxb;
    @BindView(R.id.mpl1bc001lxc)
    RadioButton mpl1bc001lxc;
    @BindView(R.id.mpl1bc001m)
    RadioGroup mpl1bc001m;
    @BindView(R.id.mpl1bc001ma)
    RadioButton mpl1bc001ma;
    @BindView(R.id.mpl1bc001mb)
    RadioButton mpl1bc001mb;
    @BindView(R.id.mpl1bc001mx)
    RadioGroup mpl1bc001mx;
    @BindView(R.id.mpl1bc001mxa)
    RadioButton mpl1bc001mxa;
    @BindView(R.id.mpl1bc001mxb)
    RadioButton mpl1bc001mxb;
    @BindView(R.id.mpl1bc001mxc)
    RadioButton mpl1bc001mxc;
    @BindView(R.id.mpl1bc001n)
    RadioGroup mpl1bc001n;
    @BindView(R.id.mpl1bc001na)
    RadioButton mpl1bc001na;
    @BindView(R.id.mpl1bc001nb)
    RadioButton mpl1bc001nb;
    @BindView(R.id.mpl1bc001nx)
    RadioGroup mpl1bc001nx;
    @BindView(R.id.mpl1bc001nxa)
    RadioButton mpl1bc001nxa;
    @BindView(R.id.mpl1bc001nxb)
    RadioButton mpl1bc001nxb;
    @BindView(R.id.mpl1bc001nxc)
    RadioButton mpl1bc001nxc;
    @BindView(R.id.mpl1bc001o)
    RadioGroup mpl1bc001o;
    @BindView(R.id.mpl1bc001oa)
    RadioButton mpl1bc001oa;
    @BindView(R.id.mpl1bc001ob)
    RadioButton mpl1bc001ob;
    @BindView(R.id.mpl1bc001ox)
    RadioGroup mpl1bc001ox;
    @BindView(R.id.mpl1bc001oxa)
    RadioButton mpl1bc001oxa;
    @BindView(R.id.mpl1bc001oxb)
    RadioButton mpl1bc001oxb;
    @BindView(R.id.mpl1bc001oxc)
    RadioButton mpl1bc001oxc;
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
    @BindView(R.id.mpl1bc001qx)
    RadioGroup mpl1bc001qx;
    @BindView(R.id.mpl1bc001qxa)
    RadioButton mpl1bc001qxa;
    @BindView(R.id.mpl1bc001qxb)
    RadioButton mpl1bc001qxb;
    @BindView(R.id.mpl1bc001qxc)
    RadioButton mpl1bc001qxc;
    @BindView(R.id.mpl1bc001r)
    RadioGroup mpl1bc001r;
    @BindView(R.id.mpl1bc001ra)
    RadioButton mpl1bc001ra;
    @BindView(R.id.mpl1bc001rb)
    RadioButton mpl1bc001rb;
    @BindView(R.id.mpl1bc001rx)
    RadioGroup mpl1bc001rx;
    @BindView(R.id.mpl1bc001rxa)
    RadioButton mpl1bc001rxa;
    @BindView(R.id.mpl1bc001rxb)
    RadioButton mpl1bc001rxb;
    @BindView(R.id.mpl1bc001rxc)
    RadioButton mpl1bc001rxc;
    @BindView(R.id.fldGrp001r)
    LinearLayout fldGrp001r;
    @BindView(R.id.mpl1bc001r1)
    RadioGroup mpl1bc001r1;
    @BindView(R.id.mpl1bc001r1a)
    RadioButton mpl1bc001r1a;
    @BindView(R.id.mpl1bc001r1b)
    RadioButton mpl1bc001r1b;
    @BindView(R.id.mpl1bc001r199)
    RadioButton mpl1bc001r199;
    @BindView(R.id.mpl1bc001r2)
    RadioGroup mpl1bc001r2;
    @BindView(R.id.mpl1bc001r2a)
    RadioButton mpl1bc001r2a;
    @BindView(R.id.mpl1bc001r2b)
    RadioButton mpl1bc001r2b;
    @BindView(R.id.mpl1bc001r299)
    RadioButton mpl1bc001r299;
    @BindView(R.id.mpl1bc001r3)
    RadioGroup mpl1bc001r3;
    @BindView(R.id.mpl1bc001r3a)
    RadioButton mpl1bc001r3a;
    @BindView(R.id.mpl1bc001r3b)
    RadioButton mpl1bc001r3b;
    @BindView(R.id.mpl1bc001r399)
    RadioButton mpl1bc001r399;
    @BindView(R.id.mpl1bc001r4)
    RadioGroup mpl1bc001r4;
    @BindView(R.id.mpl1bc001r4a)
    RadioButton mpl1bc001r4a;
    @BindView(R.id.mpl1bc001r4b)
    RadioButton mpl1bc001r4b;
    @BindView(R.id.mpl1bc001r499)
    RadioButton mpl1bc001r499;
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
    @BindView(R.id.mpl1bc002rx)
    RadioGroup mpl1bc002rx;
    @BindView(R.id.mpl1bc002rxa)
    RadioButton mpl1bc002rxa;
    @BindView(R.id.mpl1bc002rxb)
    RadioButton mpl1bc002rxb;
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
    @BindView(R.id.mpl1bc003p)
    RadioGroup mpl1bc003p;
    @BindView(R.id.mpl1bc003pa)
    RadioButton mpl1bc003pa;
    @BindView(R.id.mpl1bc003pb)
    RadioButton mpl1bc003pb;
    @BindView(R.id.mpl1bc003px)
    EditText mpl1bc003px;

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
                    mpl1bc001jx.clearCheck();
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
                    mpl1bc001lx.clearCheck();
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
                    mpl1bc001mx.clearCheck();
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
                    mpl1bc001nx.clearCheck();
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
                    mpl1bc001ox.clearCheck();
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
                    mpl1bc001qx.clearCheck();
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
                    mpl1bc001rx.clearCheck();
                }
            }
        });

        mpl1bc001r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (mpl1bc001ra.isChecked()) {
                    fldGrp001r.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001r.setVisibility(View.GONE);
                    mpl1bc001rx.clearCheck();
                    mpl1bc001r1.clearCheck();
                    mpl1bc001r2.clearCheck();
                    mpl1bc001r3.clearCheck();
                    mpl1bc001r4.clearCheck();

                }
            }
        });

        mpl1bc003pa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mpl1bc003px.setVisibility(View.VISIBLE);
                } else {
                    mpl1bc003px.setVisibility(View.GONE);
                    mpl1bc003px.setText(null);
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


                startActivity(new Intent(this, SectionEActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSD();

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

        JSONObject sd = new JSONObject();

        sd.put("mpl1bc001a", mpl1bc001aa.isChecked() ? "1" : mpl1bc001ab.isChecked() ? "2" : "0");
        sd.put("mpl1bc001b", mpl1bc001ba.isChecked() ? "1" : mpl1bc001bb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001c", mpl1bc001ca.isChecked() ? "1" : mpl1bc001cb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001d", mpl1bc001da.isChecked() ? "1" : mpl1bc001db.isChecked() ? "2" : "0");
        sd.put("mpl1bc001e", mpl1bc001ea.isChecked() ? "1" : mpl1bc001eb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001f", mpl1bc001fa.isChecked() ? "1" : mpl1bc001fb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001fx", mpl1bc001fx.getText().toString());
        sd.put("mpl1bc001g", mpl1bc001ga.isChecked() ? "1" : mpl1bc001gb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001h", mpl1bc001ha.isChecked() ? "1" : mpl1bc001hb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001i", mpl1bc001ia.isChecked() ? "1" : mpl1bc001ib.isChecked() ? "2" : "0");
        sd.put("mpl1bc001ix", mpl1bc001ix.getText().toString());
        sd.put("mpl1bc001j", mpl1bc001ja.isChecked() ? "1" : mpl1bc001jb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001jx", mpl1bc001jxa.isChecked() ? "1" : mpl1bc001jxb.isChecked() ? "2" : mpl1bc001jxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001k", mpl1bc001ka.isChecked() ? "1" : mpl1bc001kb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001l", mpl1bc001la.isChecked() ? "1" : mpl1bc001lb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001lx", mpl1bc001lxa.isChecked() ? "1" : mpl1bc001lxb.isChecked() ? "2" : mpl1bc001lxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001m", mpl1bc001ma.isChecked() ? "1" : mpl1bc001mb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001mx", mpl1bc001mxa.isChecked() ? "1" : mpl1bc001mxb.isChecked() ? "2" : mpl1bc001mxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001n", mpl1bc001na.isChecked() ? "1" : mpl1bc001nb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001nx", mpl1bc001nxa.isChecked() ? "1" : mpl1bc001nxb.isChecked() ? "2" : mpl1bc001nxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001o", mpl1bc001oa.isChecked() ? "1" : mpl1bc001ob.isChecked() ? "2" : "0");
        sd.put("mpl1bc001ox", mpl1bc001oxa.isChecked() ? "1" : mpl1bc001oxb.isChecked() ? "2" : mpl1bc001oxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001p", mpl1bc001pa.isChecked() ? "1" : mpl1bc001pb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001q", mpl1bc001qa.isChecked() ? "1" : mpl1bc001qb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001qx", mpl1bc001qxa.isChecked() ? "1" : mpl1bc001qxb.isChecked() ? "2" : mpl1bc001qxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001r", mpl1bc001ra.isChecked() ? "1" : mpl1bc001rb.isChecked() ? "2" : "0");
        sd.put("mpl1bc001rx", mpl1bc001rxa.isChecked() ? "1" : mpl1bc001rxb.isChecked() ? "2" : mpl1bc001rxc.isChecked() ? "3" : "0");
        sd.put("mpl1bc001r1", mpl1bc001r1a.isChecked() ? "1" : mpl1bc001r1b.isChecked() ? "2" : mpl1bc001r199.isChecked() ? "99" : "0");
        sd.put("mpl1bc001r2", mpl1bc001r2a.isChecked() ? "1" : mpl1bc001r2b.isChecked() ? "2" : mpl1bc001r299.isChecked() ? "99" : "0");
        sd.put("mpl1bc001r3", mpl1bc001r3a.isChecked() ? "1" : mpl1bc001r3b.isChecked() ? "2" : mpl1bc001r399.isChecked() ? "99" : "0");
        sd.put("mpl1bc001r4", mpl1bc001r4a.isChecked() ? "1" : mpl1bc001r4b.isChecked() ? "2" : mpl1bc001r499.isChecked() ? "99" : "0");
        sd.put("mpl1bc002a", mpl1bc002aa.isChecked() ? "1" : mpl1bc002ab.isChecked() ? "2" : "0");
        sd.put("mpl1bc002b", mpl1bc002ba.isChecked() ? "1" : mpl1bc002bb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002c", mpl1bc002ca.isChecked() ? "1" : mpl1bc002cb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002d", mpl1bc002da.isChecked() ? "1" : mpl1bc002db.isChecked() ? "2" : "0");
        sd.put("mpl1bc002e", mpl1bc002ea.isChecked() ? "1" : mpl1bc002eb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002f", mpl1bc002fa.isChecked() ? "1" : mpl1bc002fb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002g", mpl1bc002ga.isChecked() ? "1" : mpl1bc002gb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002h", mpl1bc002ha.isChecked() ? "1" : mpl1bc002hb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002i", mpl1bc002ia.isChecked() ? "1" : mpl1bc002ib.isChecked() ? "2" : "0");
        sd.put("mpl1bc002j", mpl1bc002ja.isChecked() ? "1" : mpl1bc002jb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002k", mpl1bc002ka.isChecked() ? "1" : mpl1bc002kb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002l", mpl1bc002la.isChecked() ? "1" : mpl1bc002lb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002m", mpl1bc002ma.isChecked() ? "1" : mpl1bc002mb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002n", mpl1bc002na.isChecked() ? "1" : mpl1bc002nb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002o", mpl1bc002oa.isChecked() ? "1" : mpl1bc002ob.isChecked() ? "2" : "0");
        sd.put("mpl1bc002p", mpl1bc002pa.isChecked() ? "1" : mpl1bc002pb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002q", mpl1bc002qa.isChecked() ? "1" : mpl1bc002qb.isChecked() ? "2" : "0");
        sd.put("mpl1bc002rx", mpl1bc002rxa.isChecked() ? "1" : mpl1bc002rxb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003a", mpl1bc003aa.isChecked() ? "1" : mpl1bc003ab.isChecked() ? "2" : "0");
        sd.put("mpl1bc003b", mpl1bc003ba.isChecked() ? "1" : mpl1bc003bb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003c", mpl1bc003ca.isChecked() ? "1" : mpl1bc003cb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003d", mpl1bc003da.isChecked() ? "1" : mpl1bc003db.isChecked() ? "2" : "0");
        sd.put("mpl1bc003e", mpl1bc003ea.isChecked() ? "1" : mpl1bc003eb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003f", mpl1bc003fa.isChecked() ? "1" : mpl1bc003fb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003g", mpl1bc003ga.isChecked() ? "1" : mpl1bc003gb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003h", mpl1bc003ha.isChecked() ? "1" : mpl1bc003hb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003i", mpl1bc003ia.isChecked() ? "1" : mpl1bc003ib.isChecked() ? "2" : "0");
        sd.put("mpl1bc003j", mpl1bc003ja.isChecked() ? "1" : mpl1bc003jb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003k", mpl1bc003ka.isChecked() ? "1" : mpl1bc003kb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003l", mpl1bc003la.isChecked() ? "1" : mpl1bc003lb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003m", mpl1bc003ma.isChecked() ? "1" : mpl1bc003mb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003n", mpl1bc003na.isChecked() ? "1" : mpl1bc003nb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003o", mpl1bc003oa.isChecked() ? "1" : mpl1bc003ob.isChecked() ? "2" : "0");
        sd.put("mpl1bc003p", mpl1bc003pa.isChecked() ? "1" : mpl1bc003pb.isChecked() ? "2" : "0");
        sd.put("mpl1bc003px", mpl1bc003px.getText().toString());

        MainApp.fc.setsD(String.valueOf(sd));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== mpl1bc001a ==============
        if (mpl1bc001a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001a), Toast.LENGTH_SHORT).show();
            mpl1bc001ab.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001a: This Data is Required!");
            return false;
        } else {
            mpl1bc001ab.setError(null);
        }

        //=================== mpl1bc001b ==============
        if (mpl1bc001b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001b), Toast.LENGTH_SHORT).show();
            mpl1bc001bb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001b: This Data is Required!");
            return false;
        } else {
            mpl1bc001bb.setError(null);
        }

        //=================== mpl1bc001c ==============
        if (mpl1bc001c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001c), Toast.LENGTH_SHORT).show();
            mpl1bc001cb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001c: This Data is Required!");
            return false;
        } else {
            mpl1bc001cb.setError(null);
        }

        //=================== mpl1bc001d ==============
        if (mpl1bc001d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001d), Toast.LENGTH_SHORT).show();
            mpl1bc001db.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001d: This Data is Required!");
            return false;
        } else {
            mpl1bc001db.setError(null);
        }

        //=================== mpl1bc001e ==============
        if (mpl1bc001e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001e), Toast.LENGTH_SHORT).show();
            mpl1bc001eb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001e: This Data is Required!");
            return false;
        } else {
            mpl1bc001eb.setError(null);
        }

        //=================== mpl1bc001f ==============
        if (mpl1bc001f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001f), Toast.LENGTH_SHORT).show();
            mpl1bc001fb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001f: This Data is Required!");
            return false;
        } else {
            mpl1bc001fb.setError(null);
        }

        if (mpl1bc001fa.isChecked() && mpl1bc001fx.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001f) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
            mpl1bc001fx.setError("This data is required");
            Log.d(TAG, " mpl1bc001fx :empty ");
            return false;
        } else {
            mpl1bc001fx.setError(null);
        }

        //=================== mpl1bc001g ==============
        if (mpl1bc001g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001g), Toast.LENGTH_SHORT).show();
            mpl1bc001gb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001g: This Data is Required!");
            return false;
        } else {
            mpl1bc001gb.setError(null);
        }

        //=================== mpl1bc001h ==============
        if (mpl1bc001h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001h), Toast.LENGTH_SHORT).show();
            mpl1bc001hb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001h: This Data is Required!");
            return false;
        } else {
            mpl1bc001hb.setError(null);
        }

        //=================== mpl1bc001i ==============
        if (mpl1bc001i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001i), Toast.LENGTH_SHORT).show();
            mpl1bc001ib.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001i: This Data is Required!");
            return false;
        } else {
            mpl1bc001ib.setError(null);
        }

        if (mpl1bc001ia.isChecked() && mpl1bc001ix.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001i) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
            mpl1bc001ix.setError("This data is required");
            Log.d(TAG, " mpl1bc001ix :empty ");
            return false;
        } else {
            mpl1bc001ix.setError(null);
        }

        //=================== mpl1bc001j ==============
        if (mpl1bc001j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001j), Toast.LENGTH_SHORT).show();
            mpl1bc001jb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001j: This Data is Required!");
            return false;
        } else {
            mpl1bc001jb.setError(null);
        }

        if (mpl1bc001ja.isChecked()) {
            if (mpl1bc001jx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001jx), Toast.LENGTH_SHORT).show();
                mpl1bc001jxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001jx: This Data is Required!");
                return false;
            } else {
                mpl1bc001jxc.setError(null);
            }
        }
        //=================== mpl1bc001k ==============
        if (mpl1bc001k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001k), Toast.LENGTH_SHORT).show();
            mpl1bc001kb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001k: This Data is Required!");
            return false;
        } else {
            mpl1bc001kb.setError(null);
        }

        //=================== mpl1bc001l ==============
        if (mpl1bc001l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001l), Toast.LENGTH_SHORT).show();
            mpl1bc001lb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001l: This Data is Required!");
            return false;
        } else {
            mpl1bc001lb.setError(null);
        }

        if (mpl1bc001la.isChecked()) {
            if (mpl1bc001lx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001lx), Toast.LENGTH_SHORT).show();
                mpl1bc001lxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001lx: This Data is Required!");
                return false;
            } else {
                mpl1bc001lxc.setError(null);
            }
        }
        //=================== mpl1bc001m ==============
        if (mpl1bc001m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001m), Toast.LENGTH_SHORT).show();
            mpl1bc001mb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001m: This Data is Required!");
            return false;
        } else {
            mpl1bc001mb.setError(null);
        }

        if (mpl1bc001ma.isChecked()) {
            if (mpl1bc001mx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001mx), Toast.LENGTH_SHORT).show();
                mpl1bc001mxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001mx: This Data is Required!");
                return false;
            } else {
                mpl1bc001mxc.setError(null);
            }
        }
        //=================== mpl1bc001n ==============
        if (mpl1bc001n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001n), Toast.LENGTH_SHORT).show();
            mpl1bc001nb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001n: This Data is Required!");
            return false;
        } else {
            mpl1bc001nb.setError(null);
        }

        if (mpl1bc001na.isChecked()) {
            if (mpl1bc001nx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001nx), Toast.LENGTH_SHORT).show();
                mpl1bc001nxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001nx: This Data is Required!");
                return false;
            } else {
                mpl1bc001nxc.setError(null);
            }
        }
        //=================== mpl1bc001o ==============
        if (mpl1bc001o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001o), Toast.LENGTH_SHORT).show();
            mpl1bc001ob.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001o: This Data is Required!");
            return false;
        } else {
            mpl1bc001ob.setError(null);
        }

        if (mpl1bc001oa.isChecked()) {
            if (mpl1bc001ox.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001ox), Toast.LENGTH_SHORT).show();
                mpl1bc001oxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001ox: This Data is Required!");
                return false;
            } else {
                mpl1bc001oxc.setError(null);
            }
        }
        //=================== mpl1bc001p ==============
        if (mpl1bc001p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001p), Toast.LENGTH_SHORT).show();
            mpl1bc001pb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001p: This Data is Required!");
            return false;
        } else {
            mpl1bc001pb.setError(null);
        }

        //=================== mpl1bc001q ==============
        if (mpl1bc001q.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001q), Toast.LENGTH_SHORT).show();
            mpl1bc001qb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001q: This Data is Required!");
            return false;
        } else {
            mpl1bc001qb.setError(null);
        }

        if (mpl1bc001qa.isChecked()) {
            if (mpl1bc001qx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001qx), Toast.LENGTH_SHORT).show();
                mpl1bc001qxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001qx: This Data is Required!");
                return false;
            } else {
                mpl1bc001qxc.setError(null);
            }
        }
        //=================== mpl1bc001r ==============
        if (mpl1bc001r.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001r), Toast.LENGTH_SHORT).show();
            mpl1bc001rb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc001r: This Data is Required!");
            return false;
        } else {
            mpl1bc001rb.setError(null);
        }

        if (mpl1bc001ra.isChecked()) {
            if (mpl1bc001rx.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001rx), Toast.LENGTH_SHORT).show();
                mpl1bc001rxc.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001rx: This Data is Required!");
                return false;
            } else {
                mpl1bc001rxc.setError(null);
            }
        }

        if (mpl1bc001ra.isChecked()) {
            //=================== mpl1bc001r1 ==============
            if (mpl1bc001r1.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001r1), Toast.LENGTH_SHORT).show();
                mpl1bc001r199.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001r1: This Data is Required!");
                return false;
            } else {
                mpl1bc001r199.setError(null);
            }

            //=================== mpl1bc001r2 ==============
            if (mpl1bc001r2.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001r2), Toast.LENGTH_SHORT).show();
                mpl1bc001r299.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001r2: This Data is Required!");
                return false;
            } else {
                mpl1bc001r299.setError(null);
            }

            //=================== mpl1bc001r3 ==============
            if (mpl1bc001r3.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001r3), Toast.LENGTH_SHORT).show();
                mpl1bc001r399.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001r3: This Data is Required!");
                return false;
            } else {
                mpl1bc001r399.setError(null);
            }

            //=================== mpl1bc001r4 ==============
            if (mpl1bc001r4.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc001r4), Toast.LENGTH_SHORT).show();
                mpl1bc001r499.setError("This data is Required!");
                Log.i(TAG, "mpl1bc001r4: This Data is Required!");
                return false;
            } else {
                mpl1bc001r499.setError(null);
            }

        }

        //=================== mpl1bc002a ==============
        if (mpl1bc002a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002a), Toast.LENGTH_SHORT).show();
            mpl1bc002ab.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002a: This Data is Required!");
            return false;
        } else {
            mpl1bc002ab.setError(null);
        }

        //=================== mpl1bc002b ==============
        if (mpl1bc002b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002b), Toast.LENGTH_SHORT).show();
            mpl1bc002bb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002b: This Data is Required!");
            return false;
        } else {
            mpl1bc002bb.setError(null);
        }

        //=================== mpl1bc002c ==============
        if (mpl1bc002c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002c), Toast.LENGTH_SHORT).show();
            mpl1bc002cb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002c: This Data is Required!");
            return false;
        } else {
            mpl1bc002cb.setError(null);
        }

        //=================== mpl1bc002d ==============
        if (mpl1bc002d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002d), Toast.LENGTH_SHORT).show();
            mpl1bc002db.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002d: This Data is Required!");
            return false;
        } else {
            mpl1bc002db.setError(null);
        }

        //=================== mpl1bc002e ==============
        if (mpl1bc002e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002e), Toast.LENGTH_SHORT).show();
            mpl1bc002eb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002e: This Data is Required!");
            return false;
        } else {
            mpl1bc002eb.setError(null);
        }

        //=================== mpl1bc002f ==============
        if (mpl1bc002f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002f), Toast.LENGTH_SHORT).show();
            mpl1bc002fb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002f: This Data is Required!");
            return false;
        } else {
            mpl1bc002fb.setError(null);
        }

        //=================== mpl1bc002g ==============
        if (mpl1bc002g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002g), Toast.LENGTH_SHORT).show();
            mpl1bc002gb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002g: This Data is Required!");
            return false;
        } else {
            mpl1bc002gb.setError(null);
        }

        //=================== mpl1bc002h ==============
        if (mpl1bc002h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002h), Toast.LENGTH_SHORT).show();
            mpl1bc002hb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002h: This Data is Required!");
            return false;
        } else {
            mpl1bc002hb.setError(null);
        }

        //=================== mpl1bc002i ==============
        if (mpl1bc002i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002i), Toast.LENGTH_SHORT).show();
            mpl1bc002ib.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002i: This Data is Required!");
            return false;
        } else {
            mpl1bc002ib.setError(null);
        }

        //=================== mpl1bc002j ==============
        if (mpl1bc002j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002j), Toast.LENGTH_SHORT).show();
            mpl1bc002jb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002j: This Data is Required!");
            return false;
        } else {
            mpl1bc002jb.setError(null);
        }

        //=================== mpl1bc002k ==============
        if (mpl1bc002k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002k), Toast.LENGTH_SHORT).show();
            mpl1bc002kb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002k: This Data is Required!");
            return false;
        } else {
            mpl1bc002kb.setError(null);
        }

        //=================== mpl1bc002l ==============
        if (mpl1bc002l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002l), Toast.LENGTH_SHORT).show();
            mpl1bc002lb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002l: This Data is Required!");
            return false;
        } else {
            mpl1bc002lb.setError(null);
        }

        //=================== mpl1bc002m ==============
        if (mpl1bc002m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002m), Toast.LENGTH_SHORT).show();
            mpl1bc002mb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002m: This Data is Required!");
            return false;
        } else {
            mpl1bc002mb.setError(null);
        }

        //=================== mpl1bc002n ==============
        if (mpl1bc002n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002n), Toast.LENGTH_SHORT).show();
            mpl1bc002nb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002n: This Data is Required!");
            return false;
        } else {
            mpl1bc002nb.setError(null);
        }

        //=================== mpl1bc002o ==============
        if (mpl1bc002o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002o), Toast.LENGTH_SHORT).show();
            mpl1bc002ob.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002o: This Data is Required!");
            return false;
        } else {
            mpl1bc002ob.setError(null);
        }

        //=================== mpl1bc002p ==============
        if (mpl1bc002p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002p), Toast.LENGTH_SHORT).show();
            mpl1bc002pb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002p: This Data is Required!");
            return false;
        } else {
            mpl1bc002pb.setError(null);
        }

        //=================== mpl1bc002q ==============
        if (mpl1bc002q.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002q), Toast.LENGTH_SHORT).show();
            mpl1bc002qb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002q: This Data is Required!");
            return false;
        } else {
            mpl1bc002qb.setError(null);
        }

        //=================== mpl1bc002r ==============
        if (mpl1bc002rx.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc002rx), Toast.LENGTH_SHORT).show();
            mpl1bc002rxb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc002rx: This Data is Required!");
            return false;
        } else {
            mpl1bc002rxb.setError(null);
        }

        //=================== mpl1bc003a ==============
        if (mpl1bc003a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003a), Toast.LENGTH_SHORT).show();
            mpl1bc003ab.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003a: This Data is Required!");
            return false;
        } else {
            mpl1bc003ab.setError(null);
        }

        //=================== mpl1bc003b ==============
        if (mpl1bc003b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003b), Toast.LENGTH_SHORT).show();
            mpl1bc003bb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003b: This Data is Required!");
            return false;
        } else {
            mpl1bc003bb.setError(null);
        }

        //=================== mpl1bc003c ==============
        if (mpl1bc003c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003c), Toast.LENGTH_SHORT).show();
            mpl1bc003cb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003c: This Data is Required!");
            return false;
        } else {
            mpl1bc003cb.setError(null);
        }

        //=================== mpl1bc003d ==============
        if (mpl1bc003d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003d), Toast.LENGTH_SHORT).show();
            mpl1bc003db.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003d: This Data is Required!");
            return false;
        } else {
            mpl1bc003db.setError(null);
        }

        //=================== mpl1bc003e ==============
        if (mpl1bc003e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003e), Toast.LENGTH_SHORT).show();
            mpl1bc003eb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003e: This Data is Required!");
            return false;
        } else {
            mpl1bc003eb.setError(null);
        }

        //=================== mpl1bc003f ==============
        if (mpl1bc003f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003f), Toast.LENGTH_SHORT).show();
            mpl1bc003fb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003f: This Data is Required!");
            return false;
        } else {
            mpl1bc003fb.setError(null);
        }

        //=================== mpl1bc003g ==============
        if (mpl1bc003g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003g), Toast.LENGTH_SHORT).show();
            mpl1bc003gb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003g: This Data is Required!");
            return false;
        } else {
            mpl1bc003gb.setError(null);
        }

        //=================== mpl1bc003h ==============
        if (mpl1bc003h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003h), Toast.LENGTH_SHORT).show();
            mpl1bc003hb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003h: This Data is Required!");
            return false;
        } else {
            mpl1bc003hb.setError(null);
        }

        //=================== mpl1bc003i ==============
        if (mpl1bc003i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003i), Toast.LENGTH_SHORT).show();
            mpl1bc003ib.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003i: This Data is Required!");
            return false;
        } else {
            mpl1bc003ib.setError(null);
        }

        //=================== mpl1bc003j ==============
        if (mpl1bc003j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003j), Toast.LENGTH_SHORT).show();
            mpl1bc003jb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003j: This Data is Required!");
            return false;
        } else {
            mpl1bc003jb.setError(null);
        }

        //=================== mpl1bc003k ==============
        if (mpl1bc003k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003k), Toast.LENGTH_SHORT).show();
            mpl1bc003kb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003k: This Data is Required!");
            return false;
        } else {
            mpl1bc003kb.setError(null);
        }

        //=================== mpl1bc003l ==============
        if (mpl1bc003l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003l), Toast.LENGTH_SHORT).show();
            mpl1bc003lb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003l: This Data is Required!");
            return false;
        } else {
            mpl1bc003lb.setError(null);
        }

        //=================== mpl1bc003m ==============
        if (mpl1bc003m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003m), Toast.LENGTH_SHORT).show();
            mpl1bc003mb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003m: This Data is Required!");
            return false;
        } else {
            mpl1bc003mb.setError(null);
        }

        //=================== mpl1bc003n ==============
        if (mpl1bc003n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003n), Toast.LENGTH_SHORT).show();
            mpl1bc003nb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003n: This Data is Required!");
            return false;
        } else {
            mpl1bc003nb.setError(null);
        }

        //=================== mpl1bc003o ==============
        if (mpl1bc003o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.mpl1bc003o), Toast.LENGTH_SHORT).show();
            mpl1bc003ob.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003o: This Data is Required!");
            return false;
        } else {
            mpl1bc003ob.setError(null);
        }

        //=================== mpl1bc003p ==============
        if (mpl1bc003p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mpl1bc003pb.setError("This data is Required!");
            Log.i(TAG, "mpl1bc003p: This Data is Required!");
            return false;
        } else {
            mpl1bc003pb.setError(null);
        }
        if (mpl1bc003pa.isChecked() && mpl1bc003px.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            mpl1bc003px.setError("This data is required");
            Log.d(TAG, " mpl1bc003px :empty ");
            return false;
        } else {
            mpl1bc003px.setError(null);
        }



        return true;

    }


}


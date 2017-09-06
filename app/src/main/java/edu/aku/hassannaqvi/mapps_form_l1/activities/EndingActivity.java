package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;

public class EndingActivity extends Activity {

    @BindView(R.id.istatus)
    RadioGroup istatus;
    @BindView(R.id.istatus01)
    RadioButton istatus01;
    @BindView(R.id.istatus02)
    RadioButton istatus02;
    @BindView(R.id.istatus03)
    RadioButton istatus03;
    @BindView(R.id.istatus04)
    RadioButton istatus04;
    @BindView(R.id.istatus05)
    RadioButton istatus05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Closing Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            //if (UpdateDB()) {
            finish();
            Toast.makeText(this, "Closing Form!", Toast.LENGTH_SHORT).show();
            Intent endSec = new Intent(this, MainActivity.class);
            //AppMain.mnb1 = "TEST";
            startActivity(endSec);
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    private boolean UpdateDB() {
        /*DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateEnd();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();*/
        return false;
        //}
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();



    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Closing Section", Toast.LENGTH_SHORT).show();

        /*if (mna7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.mna7), Toast.LENGTH_LONG).show();
            mna7d.setError("This data is Required!");
            Log.i(TAG, "mnd9: This data is Required!");
            return false;
        } else {
            mna7d.setError(null);
        }*/
        return true;
    }

}

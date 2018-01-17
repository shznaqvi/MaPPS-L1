package edu.aku.hassannaqvi.mapps_form_l1.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form_l1.R;
import edu.aku.hassannaqvi.mapps_form_l1.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form_l1.core.MainApp;

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

    Boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        check = getIntent().getExtras().getBoolean("complete");

        if (check || MainApp.endFlag) {
            istatus01.setEnabled(true);
            istatus02.setEnabled(false);
            istatus03.setEnabled(false);
            istatus04.setEnabled(false);
            istatus05.setEnabled(false);
        } else {
            istatus01.setEnabled(false);
            istatus02.setEnabled(true);
            istatus03.setEnabled(true);
            istatus04.setEnabled(true);
            istatus05.setEnabled(true);
        }

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
                MainApp.endFlag = false;

                MainApp.partiFlag = 0;

                if (MainApp.wmCount < MainApp.totalWmCount && check) {
                    finish();

                    MainApp.wmCount++;
                    MainApp.ParticipantsMap.remove(MainApp.position);
                    MainApp.ParticipantsName.remove(MainApp.position);
                    MainApp.checked = true;
                    Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
                    Intent endSec = new Intent(this, SectionAActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                } else {
                    MainApp.wmCount = 1;
                    MainApp.totalWmCount = 0;
                    MainApp.ParticipantsName.clear();
                    MainApp.ParticipantsMap.clear();
                    MainApp.Eparticipant.clear();
                    MainApp.flag = true;
                    MainApp.checked = false;
                    Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
                    Intent endSec = new Intent(this, MainActivity.class);
                    endSec.putExtra("complete", false);
                    startActivity(endSec);
                }


            }
        }
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();


        MainApp.fc.setIstatus(istatus01.isChecked() ? "1" : istatus02.isChecked() ? "2" : istatus03.isChecked() ? "3" : istatus04.isChecked() ? "4" : istatus05.isChecked() ? "5" : "0");
        MainApp.fc.setEndingDateTime((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateEnding();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public boolean ValidateForm() {

        if (istatus.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.istatus), Toast.LENGTH_SHORT).show();
            istatus05.setError("This data is Required!");
            return false;
        } else {
            istatus05.setError(null);
        }

        return true;
    }

}

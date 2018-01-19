package edu.aku.hassannaqvi.mapps_form_l1.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 01/19/2018.
 */

public class FollowupsContract {

    private static final String TAG = "Followup-CONTRACT";
    Long _ID;
    String PUID;
    String LUID;
    String clusterCode;
    String lhwCode;
    String household;
    String sno;
    String fupdt;
    String fupround;
    String epname;
    String phasetype;

    public FollowupsContract() {
        // Default Constructor
    }

    public FollowupsContract(FollowupsContract en) {

        this.PUID = en.PUID;
        this.LUID = en.LUID;
        this.clusterCode = en.clusterCode;
        this.lhwCode = en.lhwCode;
        this.household = en.household;
        this.epname = en.epname;
        this.sno = en.sno;
        this.fupdt = en.fupdt;
        this.fupround = en.fupround;
        this.phasetype = en.phasetype;
    }

    public Long getUserID() {
        return this._ID;
    }

    public void setId(int id) {
        this._ID = Long.valueOf(id);
    }

    public String getPUID() {
        return PUID;
    }

    public void setPUID(String PUID) {
        this.PUID = PUID;
    }

    public String getLUID() {
        return LUID;
    }

    public void setLUID(String LUID) {
        this.LUID = LUID;
    }

    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String clusterCode) {
        this.clusterCode = clusterCode;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getFupdt() {
        return fupdt;
    }

    public void setFupdt(String fupdt) {
        this.fupdt = fupdt;
    }

    public String getFupround() {
        return fupround;
    }

    public void setFupround(String fupround) {
        this.fupround = fupround;
    }

    public String getEpname() {
        return epname;
    }

    public void setEpname(String epname) {
        this.epname = epname;
    }

    public String getPhasetype() {
        return phasetype;
    }

    public void setPhasetype(String phasetype) {
        this.phasetype = phasetype;
    }

    public FollowupsContract Sync(JSONObject jsonObject) throws JSONException {

        this.PUID = jsonObject.getString(followupTable.COLUMN_PUID);
        this.LUID = jsonObject.getString(followupTable.COLUMN_LUID);
        this.clusterCode = jsonObject.getString(followupTable.COLUMN_CLUSTERCODE);
        this.lhwCode = jsonObject.getString(followupTable.COLUMN_LHWCODE);
        this.household = jsonObject.getString(followupTable.COLUMN_HOUSEHOLD);
        this.sno = jsonObject.getString(followupTable.COLUMN_SNO);
        this.fupdt = jsonObject.getString(followupTable.COLUMN_FUPDT);
        this.fupround = jsonObject.getString(followupTable.COLUMN_FUPROUND);
        this.epname = jsonObject.getString(followupTable.COLUMN_EPNAME);
        this.phasetype = jsonObject.getString(followupTable.COLUMN_PHASETYPE);


        return this;

    }

    public FollowupsContract Hydrate(Cursor cursor) {
        this.PUID = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_PUID));
        this.LUID = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_LUID));
        this.clusterCode = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_CLUSTERCODE));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_LHWCODE));
        this.household = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_HOUSEHOLD));
        this.sno = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_SNO));
        this.fupdt = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_FUPDT));
        this.fupround = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_FUPROUND));
        this.epname = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_EPNAME));
        this.phasetype = cursor.getString(cursor.getColumnIndex(followupTable.COLUMN_PHASETYPE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(followupTable._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(followupTable.COLUMN_PUID, this.PUID == null ? JSONObject.NULL : this.PUID);
        json.put(followupTable.COLUMN_LUID, this.LUID == null ? JSONObject.NULL : this.LUID);
        json.put(followupTable.COLUMN_CLUSTERCODE, this.clusterCode == null ? JSONObject.NULL : this.clusterCode);
        json.put(followupTable.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(followupTable.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(followupTable.COLUMN_SNO, this.sno == null ? JSONObject.NULL : this.sno);
        json.put(followupTable.COLUMN_FUPDT, this.fupdt == null ? JSONObject.NULL : this.fupdt);
        json.put(followupTable.COLUMN_FUPROUND, this.fupround == null ? JSONObject.NULL : this.fupround);
        json.put(followupTable.COLUMN_EPNAME, this.epname == null ? JSONObject.NULL : this.epname);
        json.put(followupTable.COLUMN_PHASETYPE, this.phasetype == null ? JSONObject.NULL : this.phasetype);


        return json;
    }

    public static abstract class followupTable implements BaseColumns {

        public static final String TABLE_NAME = "followups";
        public static final String _ID = "id";
        public static final String COLUMN_PUID = "puid";
        public static final String COLUMN_LUID = "luid";
        public static final String COLUMN_CLUSTERCODE = "clustercode";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_FUPDT = "fupdt";
        public static final String COLUMN_FUPROUND = "fupround";
        public static final String COLUMN_EPNAME = "epname";
        public static final String COLUMN_PHASETYPE = "phasetype";

        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";


        public static final String _URI = "followupsl1.php";
    }
}

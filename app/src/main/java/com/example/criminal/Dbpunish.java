package com.example.criminal;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbpunish extends SQLiteOpenHelper {
    private static final String dbn = "punish.db";

    public Dbpunish(Context context) {
        super(context,dbn, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase datab) {
        String qr="create table punish(id integer primary key,name text,years integer,details text,redate integer,sedate integer)";
        datab.execSQL(qr);

    }

    @Override
    public void onUpgrade(SQLiteDatabase datab, int oldVersion, int newVersion) {
        datab.execSQL("DROP TABLE IF EXISTS punish");
        onCreate(datab);
    }

    public String punishrecord(String t1,String t2,String t3,String t4,String t5,String t6){
        SQLiteDatabase datab=this.getWritableDatabase();

        ContentValues cvr=new ContentValues();
        cvr.put("id",t1);
        cvr.put("name",t2);
        cvr.put("years",t3);
        cvr.put("details",t4);
        cvr.put("redate",t5);
        cvr.put("sedate",t6);


        long res1=datab.insert("punish",null,cvr);

        if(res1==-1)
            return "Failed";
        else
            return "Successfully inserted";
    }
}

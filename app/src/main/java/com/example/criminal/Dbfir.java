package com.example.criminal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

  public class Dbfir extends SQLiteOpenHelper {
    private static final String dbta = "fir.db";

    public Dbfir(Context context) {
        super(context,dbta, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase firtb) {
        String qr9="create table FirFile(vname text ,vid integer primary key,phno integer,address text,ctype text,inadr text,date integer)";
        firtb.execSQL(qr9);

    }

    @Override
    public void onUpgrade(SQLiteDatabase firtb, int oldVersion, int newVersion) {
        firtb.execSQL("DROP TABLE IF EXISTS FirFile");
        onCreate(firtb);
    }

    public String firrecord(String d1,String d2,String d3,String d4,String d5,String d6,String d7){
        SQLiteDatabase firtb=this.getWritableDatabase();

        ContentValues cv4=new ContentValues();
        cv4.put("vname",d1);
        cv4.put("vid",d2);
        cv4.put("phno",d3);
        cv4.put("address",d4);
        cv4.put("ctype",d5);
        cv4.put("inadr",d6);
        cv4.put("date",d7);

        long res9=firtb.insert("FirFile",null,cv4);

        if(res9==-1)
            return "Failed";
        else
            return "Successfully inserted";
    }
}


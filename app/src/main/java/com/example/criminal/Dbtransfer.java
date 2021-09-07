package com.example.criminal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

  public class Dbtransfer extends SQLiteOpenHelper {
    private static final String dbt = "transfer.db";

    public Dbtransfer(Context context) {
        super(context,dbt, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase trb) {
        String qri="create table transfer(id integer primary key,name text,ccno integer,ncno integer,cjn text,njn text,pt text)";
        trb.execSQL(qri);

    }

    @Override
    public void onUpgrade(SQLiteDatabase trb, int oldVersion, int newVersion) {
        trb.execSQL("DROP TABLE IF EXISTS transfer");
        onCreate(trb);
    }

    public String transferrecord(String a1,String a2,String a3,String a4,String a5,String a6,String a7){
        SQLiteDatabase trb=this.getWritableDatabase();

        ContentValues cv3=new ContentValues();
        cv3.put("id",a1);
        cv3.put("name",a2);
        cv3.put("ccno",a3);
        cv3.put("ncno",a4);
        cv3.put("cjn",a5);
        cv3.put("njn",a6);
        cv3.put("pt",a7);

        long res2=trb.insert("transfer",null,cv3);

        if(res2==-1)
            return "Failed";
        else
            return "Successfully inserted";
    }
}


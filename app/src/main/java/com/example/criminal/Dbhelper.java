package com.example.criminal;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

     public class Dbhelper extends SQLiteOpenHelper {
         private static final String DBNAME = "Login.db";

         public Dbhelper(Context context) { super(context,DBNAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase MyDB) {
             String qry="create table CriminalsRecord(id integer primary key,name text,dob integer,bloodgrp text,address text,type text,details text)";
             MyDB.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("DROP TABLE IF EXISTS CriminalsRecord");
        onCreate(MyDB);
    }

    public String addrecord(String p1,String p2,String p3,String p4,String p5,String p6,String p7){
        SQLiteDatabase MyDB=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("id",p1);
        cv.put("name",p2);
        cv.put("dob",p3);
        cv.put("bloodgrp",p4);
        cv.put("address",p5);
        cv.put("type",p6);
        cv.put("details",p7);

        long res=MyDB.insert("CriminalsRecord",null,cv);

        if(res==-1)
            return "Failed";
        else
            return "Successfully inserted";
    }
}

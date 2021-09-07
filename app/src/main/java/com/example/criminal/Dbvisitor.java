package com.example.criminal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbvisitor extends SQLiteOpenHelper {
    private static final String dbv = "visitor.db";

    public Dbvisitor(Context context) {
        super(context,dbv, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase dbvis) {
        String qrc="create table VisitorFile(id integer primary key,visitor_name text,arrival_date integer,entrytime integer,exittime integer,visitorphno integer,visitoraddress text)";
        dbvis.execSQL(qrc);
    }

    @Override
    public void onUpgrade(SQLiteDatabase dbvis, int oldVersion, int newVersion) {
        dbvis.execSQL("DROP TABLE IF EXISTS VisitorFile");
        onCreate(dbvis);
    }

    public String visitrecord(String x1, String x2, String x3, String x4, String x5, String x6, String x7){
        SQLiteDatabase dbvis=this.getWritableDatabase();

        ContentValues cv5=new ContentValues();
        cv5.put("id",x1);
        cv5.put("visitor_name",x2);
        cv5.put("arrival_date",x3);
        cv5.put("entrytime",x4);
        cv5.put("exittime",x5);
        cv5.put("visitorphno",x6);
        cv5.put("visitoraddress",x7);

        long res5=dbvis.insert("VisitorFile",null,cv5);

        if(res5==-1)
            return "Failed";
        else
            return "Successfully inserted";
    }
}

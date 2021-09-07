package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Paths;

public class PoliceSearchActivity extends AppCompatActivity {
    EditText nm;
    Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_search);

         nm = (EditText)findViewById(R.id.st1);
         search = (Button)findViewById(R.id.bt1);
         search.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String n = nm.getText().toString();
                 SQLiteDatabase MyDB = getApplicationContext().openOrCreateDatabase("Login.db", Context.MODE_PRIVATE,null);
                 Cursor c = MyDB.rawQuery("select * from CriminalsRecord where id=' "+n+"'",null);
                 if(c.getCount()==0)
                 {
                     Toast.makeText(getApplicationContext(),"No Records Found",Toast.LENGTH_LONG).show();
                     return;
                 }
                 StringBuffer buffer = new StringBuffer();
                 while(c.moveToNext()){
                     buffer.append("ID \t "+c.getString(0)+"\n");
                     buffer.append("NAME \t "+c.getString(1)+"\n");
                     buffer.append("DATE_OF_BIRTH \t "+c.getString(2)+"\n");
                     buffer.append("BLOOD_GROUP \t "+c.getString(3)+"\n");
                     buffer.append("ADDRESS \t "+c.getString(4)+"\n");
                     buffer.append("CRIME_DETAILS \t "+c.getString(6)+"\n");
                 }

                 Toast.makeText(getApplicationContext(),"Result \n"+buffer.toString(),Toast.LENGTH_LONG).show();

             }
         });
    }

    }
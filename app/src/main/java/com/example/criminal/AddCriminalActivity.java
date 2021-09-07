package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddCriminalActivity extends AppCompatActivity {
    EditText Input1,Input2,Input3,Input4,Input5,Input6,Input7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_criminal);

        Input1 =(EditText) findViewById(R.id.b1);
        Input2 =(EditText) findViewById(R.id.b2);
        Input3 =(EditText) findViewById(R.id.b3);
        Input4 =(EditText) findViewById(R.id.b4);
        Input5 =(EditText) findViewById(R.id.b5);
        Input6 =(EditText) findViewById(R.id.b6);
        Input7 =(EditText) findViewById(R.id.b7);
    }

    public void addrecord(View view){
        Dbhelper MyDB=new Dbhelper(this);
        String res=MyDB.addrecord(Input1.getText().toString(),Input2.getText().toString(),Input3.getText().toString(),Input4.getText().toString(),Input5.getText().toString(),Input6.getText().toString(),Input7.getText().toString());
        Toast.makeText(this,res, Toast.LENGTH_LONG).show();

        Input1.setText("");
        Input2.setText("");
        Input3.setText("");
        Input4.setText("");
        Input5.setText("");
        Input6.setText("");
        Input7.setText("");
    }



}
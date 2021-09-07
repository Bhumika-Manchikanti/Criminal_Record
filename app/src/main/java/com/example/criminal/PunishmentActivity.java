package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PunishmentActivity extends AppCompatActivity {
    EditText In1,In2,In3,In4,In5,In6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punishment);

        In1 =(EditText) findViewById(R.id.b1);
        In2 =(EditText) findViewById(R.id.Input_2);
        In3 =(EditText) findViewById(R.id.Input_3);
        In4 =(EditText) findViewById(R.id.Input_4);
        In5 =(EditText) findViewById(R.id.Input_5);
        In6 =(EditText) findViewById(R.id.Input_6);

    }

    public void punishrecord(View view){
        Dbpunish datab=new Dbpunish(this);
        String res1=datab.punishrecord(In1.getText().toString(),In2.getText().toString(),In3.getText().toString(),In4.getText().toString(),In5.getText().toString(),In6.getText().toString());
        Toast.makeText(this,res1, Toast.LENGTH_LONG).show();

        In1.setText("");
        In2.setText("");
        In3.setText("");
        In4.setText("");
        In5.setText("");
        In6.setText("");

    }
}
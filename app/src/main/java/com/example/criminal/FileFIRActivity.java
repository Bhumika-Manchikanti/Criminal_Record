package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FileFIRActivity extends AppCompatActivity {
    EditText Inp1,Inp2,Inp3,Inp4,Inp5,Inp6,Inp7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_f_i_r);

        Inp1 =(EditText) findViewById(R.id.c1);
        Inp2 =(EditText) findViewById(R.id.c2);
        Inp3 =(EditText) findViewById(R.id.c3);
        Inp4 =(EditText) findViewById(R.id.c4);
        Inp5 =(EditText) findViewById(R.id.c5);
        Inp6 =(EditText) findViewById(R.id.c6);
        Inp7 =(EditText) findViewById(R.id.c7);
    }

    public void firrecord(View view){
        Dbfir firtb=new Dbfir(this);
        String res4=firtb.firrecord(Inp1.getText().toString(),Inp2.getText().toString(),Inp3.getText().toString(),Inp4.getText().toString(),Inp5.getText().toString(),Inp6.getText().toString(),Inp7.getText().toString());
        Toast.makeText(this,res4, Toast.LENGTH_LONG).show();

        Inp1.setText("");
        Inp2.setText("");
        Inp3.setText("");
        Inp4.setText("");
        Inp5.setText("");
        Inp6.setText("");
        Inp7.setText("");
    }
}
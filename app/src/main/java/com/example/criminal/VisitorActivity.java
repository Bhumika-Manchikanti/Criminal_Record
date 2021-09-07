package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VisitorActivity extends AppCompatActivity {
    EditText I1,I2,I3,I4,I5,I6,I7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);

        I1 =(EditText) findViewById(R.id.b11);
        I2 =(EditText) findViewById(R.id.b22);
        I3 =(EditText) findViewById(R.id.b33);
        I4 =(EditText) findViewById(R.id.b44);
        I5 =(EditText) findViewById(R.id.b55);
        I6 =(EditText) findViewById(R.id.b66);
        I7 =(EditText) findViewById(R.id.b77);
    }

    public void visitrecord(View view){
        Dbvisitor dbvis=new Dbvisitor(this);
        String res6=dbvis.visitrecord(I1.getText().toString(),I2.getText().toString(),I3.getText().toString(),I4.getText().toString(),I5.getText().toString(),I6.getText().toString(),I7.getText().toString());
        Toast.makeText(this,res6, Toast.LENGTH_LONG).show();

        I1.setText("");
        I2.setText("");
        I3.setText("");
        I4.setText("");
        I5.setText("");
        I6.setText("");
        I7.setText("");
    }
}
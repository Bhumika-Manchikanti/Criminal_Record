package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TransferActivity extends AppCompatActivity {
    EditText b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);


        b1 = (EditText) findViewById(R.id.b1);
        b2 = (EditText) findViewById(R.id.b2);
        b3 = (EditText) findViewById(R.id.b3);
        b4 = (EditText) findViewById(R.id.b4);
        b5 = (EditText) findViewById(R.id.b5);
        b6 = (EditText) findViewById(R.id.b6);
        b7 = (EditText) findViewById(R.id.b7);
    }


    public void transfer(View view) {
        Dbtransfer trb = new Dbtransfer(this);
        String res2 = trb.transferrecord(b1.getText().toString(), b2.getText().toString(), b3.getText().toString(), b4.getText().toString(), b5.getText().toString(), b6.getText().toString(), b7.getText().toString());
        Toast.makeText(this, res2, Toast.LENGTH_LONG).show();

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
    }
}
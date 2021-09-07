package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceActivity extends AppCompatActivity {
    private Button addfir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        addfir = (Button) findViewById(R.id.btnfir);
    }

    public void ffir(View view) {
        Intent intent = new Intent(PoliceActivity.this, FileFIRActivity.class);
        startActivity(intent);
    }

    public void search(View v){
        Intent intent = new Intent(PoliceActivity.this,PoliceSearchActivity.class);
        startActivity(intent);
    }
}
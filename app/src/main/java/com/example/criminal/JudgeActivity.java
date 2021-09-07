package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JudgeActivity extends AppCompatActivity {

    private Button punishment;
    private Button suspension;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judge);

        punishment = (Button) findViewById(R.id.btnpunish);
        suspension = (Button) findViewById(R.id.btnsuspension);
    }

    public void Punish(View v) {

        Intent intent = new Intent(JudgeActivity.this, PunishmentActivity.class);
        startActivity(intent);
    }


    public void Transfer(View v) {

        Intent intent = new Intent(JudgeActivity.this, TransferActivity.class);
        startActivity(intent);
    }
}
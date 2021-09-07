package com.example.criminal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button ecbi;
    private Button epolice;
    private Button ejudge;
    private Button ejsp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ecbi = (Button) findViewById(R.id.btncbi);
        epolice = (Button) findViewById(R.id.btnpolice);
        ejudge = (Button) findViewById(R.id.btnjudge);
        ejsp = (Button) findViewById(R.id.btnjsp);

    }

    public void police_Login(View v) {

        Intent intent = new Intent(MainActivity.this, Police_Login.class);
        startActivity(intent);
    }

    public void cbi_Login(View v){
        Intent intent = new Intent(MainActivity.this,Cbi_Login.class);
        startActivity(intent);
    }

    public void jsp_Login(View v){
        Intent intent = new Intent(MainActivity.this,Jsp_Login.class);
        startActivity(intent);
    }

    public void judge_Login(View v){
        Intent intent = new Intent(MainActivity.this,Judge_Login.class);
        startActivity(intent);
    }

}
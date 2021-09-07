package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JspActivity extends AppCompatActivity {

    private Button addcriminal;
    private Button visitors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsp);

        addcriminal = (Button) findViewById(R.id.btnaddcriminal);
        visitors = (Button) findViewById(R.id.btnvisitor);
    }
    public void AddCriminal(View v) {
        Intent intent = new Intent(JspActivity.this, AddCriminalActivity.class);
        startActivity(intent);
    }

    public void Visitor(View v) {
        Intent intent = new Intent(JspActivity.this, VisitorActivity.class);
        startActivity(intent);
    }
}


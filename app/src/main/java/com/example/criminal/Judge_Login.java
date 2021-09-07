package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Judge_Login extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private int counter = 5;


    private String Username = "judge";
    private String Password5 = "judge123";

    private String Username1 = "bhumi";
    private String Password1 = "bhumi123";

    private String Username2 = "soni";
    private String Password2 = "soni123";

    private String Username3 = "lohith";
    private String Password3 = "lohith123";

    private String Username4 = "ganesh";
    private String Password4 = "ganesh123";

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judge__login);


        eName = findViewById(R.id.etJudgeName);
        ePassword = findViewById(R.id.etJudgePassword);
        eLogin = findViewById(R.id.btnLoginJudge);
        eAttemptsInfo = findViewById(R.id.tvAttemptsJudge);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(Judge_Login.this,"Please enter all the details correctly!",Toast.LENGTH_SHORT).show();
                }else{


                    isValid = validate(inputName,inputPassword);

                    if(!isValid){

                        counter--;

                        Toast.makeText(Judge_Login.this,"Incorrect Credentials Entered",Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("No.of attempts remaining: " + counter);


                        if(counter == 0){
                            eLogin.setEnabled(false);
                        }
                    }
                    else{
                        Toast.makeText(Judge_Login.this,"Login Successful",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Judge_Login.this,JudgeActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }



    private boolean validate(String name, String Password){

        if(name.equals(Username) && Password.equals(Password5)
                ||name.equals(Username1) && Password.equals(Password1)
                || name.equals(Username2) && Password.equals(Password2)
                ||name.equals(Username3) && Password.equals(Password3)
                || name.equals(Username4) && Password.equals(Password4)){
            return true;
        }
        return false;
    }



    public void dbapp(View view) {
            new Dbpunish(this);
            startActivity(new Intent(this,PunishmentActivity.class));
        }
    }

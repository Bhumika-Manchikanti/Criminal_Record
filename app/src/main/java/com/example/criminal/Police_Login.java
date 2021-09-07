package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Police_Login extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private int counter = 5;


    private String Username = "police";
    private String Password5 = "police123";

    private String Username1 = "vyshu";
    private String Password1 = "vyshu123";

    private String Username2 = "chandu";
    private String Password2 = "chandu123";

    private String Username3 = "charitha";
    private String Password3 = "charitha123";

    private String Username4 = "jaya";
    private String Password4 = "jaya123";

    boolean isValid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police__login);

        eName = findViewById(R.id.etPoliceName);
        ePassword = findViewById(R.id.etPolicePassword);
        eLogin = findViewById(R.id.btnPoliceLogin);
        eAttemptsInfo = findViewById(R.id.tvAttempts);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(Police_Login.this,"Please enter all the details correctly!",Toast.LENGTH_SHORT).show();
                }else{


                    isValid = validate(inputName,inputPassword);

                    if(!isValid){

                        counter--;

                        Toast.makeText(Police_Login.this,"Incorrect Credentials Entered",Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("No.of attempts remaining: " + counter);


                        if(counter == 0){
                            eLogin.setEnabled(false);
                        }
                    }
                    else{
                        Toast.makeText(Police_Login.this,"Login Successful",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Police_Login.this,PoliceActivity.class);
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

    public void firdb(View view){
        new Dbfir(this);
        startActivity(new Intent(this,FileFIRActivity.class));
    }


}
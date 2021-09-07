package com.example.criminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  Cbi_Login extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private int counter = 5;


    private String Username = "cbi";
    private String Password5 = "cbi123";

    private String Username1 = "abc";
    private String Password1 = "abc123";

    private String Username2 = "def";
    private String Password2 = "def123";

    private String Username3 = "ghi";
    private String Password3 = "ghi123";

    private String Username4 = "jkl";
    private String Password4 = "jkl123";

    boolean isValid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbi__login);

        eName = findViewById(R.id.etCbiName);
        ePassword = findViewById(R.id.etCbiPassword);
        eLogin = findViewById(R.id.btnCbilogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsCbi);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(Cbi_Login.this,"Please enter all the details correctly!",Toast.LENGTH_SHORT).show();
                }else{


                    isValid = validate(inputName,inputPassword);

                    if(!isValid){

                        counter--;

                        Toast.makeText(Cbi_Login.this,"Incorrect Credentials Entered",Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("No.of attempts remaining: " + counter);


                        if(counter == 0){
                            eLogin.setEnabled(false);
                        }
                    }
                    else{
                        Toast.makeText(Cbi_Login.this,"Login Successful",Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(Cbi_Login.this,CbiActivity.class);
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
}

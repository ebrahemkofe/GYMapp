package com.myaquar.inventure.gymapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.myaquar.inventure.gymapp.R;

public class Login extends AppCompatActivity {

 public  EditText email,pass;
 public Button  login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.EmailEdit);
        pass=findViewById(R.id.PassEdit);
        login=findViewById(R.id.LoginBtn);


    }
}

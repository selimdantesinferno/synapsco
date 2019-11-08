package com.example.synapsprepa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
EditText s_email, s_password;
TextView register;
Button btn_login,btn_loging,btn_loginfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        s_email= (EditText) findViewById(R.id.email);
        s_password= (EditText) findViewById(R.id.password);
        register = (TextView) findViewById(R.id.register);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_loging = (Button) findViewById(R.id.btn_logingoogle);
        btn_loginfb = (Button) findViewById(R.id.btn_loginfb);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(LoginActivity.this,SignInActivity.class);
                startActivity(i);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

    }
}

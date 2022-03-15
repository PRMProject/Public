package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton btnLogin = (MaterialButton) findViewById(R.id.btnLogin);
        TextView Register = (TextView) findViewById(R.id.register);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(LoginActivity.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();
                }
            }

        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
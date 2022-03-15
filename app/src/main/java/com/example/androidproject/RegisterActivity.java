package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView repassword = (TextView) findViewById(R.id.retypepassword);
        MaterialButton Register = (MaterialButton) findViewById(R.id.btnRegister);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String password1 = password.getText().toString();
                String repass = repassword.getText().toString();


                if(user.isEmpty() || password1.isEmpty() || repass.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }else {
                    if (!password1.equals(repass)){
                        Toast.makeText(RegisterActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                    }else{
                        // need to check if username existed
                    }
                }
            }
        });


    }
}
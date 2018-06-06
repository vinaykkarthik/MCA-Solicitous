package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usersignup extends AppCompatActivity {
private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersignup);
    }
        public void register_Click(View v){
            Intent sign = new Intent(usersignup.this, signup.class);
            startActivity(sign);
    }
    public void login_Click(View v){
            Intent log = new Intent(usersignup.this, login.class);
            startActivity(log);
        }


    }


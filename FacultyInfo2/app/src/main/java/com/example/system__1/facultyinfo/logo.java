package com.example.system__1.facultyinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class logo extends AppCompatActivity {
    private static int TIMER = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        new Handler().postDelayed (new Runnable(){
            @Override
            public void run(){
                Intent RegisterIntent = new Intent(logo.this , usersignup.class);
                startActivity(RegisterIntent);
                finish();

            }
        },TIMER);
    }
}

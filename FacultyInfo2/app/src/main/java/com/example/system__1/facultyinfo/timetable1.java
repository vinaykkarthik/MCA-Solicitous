package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class timetable1 extends AppCompatActivity {
TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable1);


       T1 = (TextView)findViewById(R.id.T1);

      T1.setMovementMethod(new ScrollingMovementMethod());

    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu){

        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.mainmenu, menu);

        return true;
    }

    @Override

    public  boolean onOptionsItemSelected(MenuItem item){


        super.onOptionsItemSelected(item);
        if(item.getItemId() == R.id.logoutbtn){
            FirebaseAuth.getInstance().signOut();

            Intent RegisterIntent16 = new Intent(timetable1.this , usersignup.class);
            startActivity(RegisterIntent16);

        }

        return true;
    }
}

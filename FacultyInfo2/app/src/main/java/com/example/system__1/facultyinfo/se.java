package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class se extends AppCompatActivity {

  TextView se;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);

        TextView se = (TextView)findViewById(R.id.se);
        se.setMovementMethod(LinkMovementMethod.getInstance());
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

            Intent RegisterIntentse = new Intent(se.this , usersignup.class);
            startActivity(RegisterIntentse);

        }

        return true;
    }

}

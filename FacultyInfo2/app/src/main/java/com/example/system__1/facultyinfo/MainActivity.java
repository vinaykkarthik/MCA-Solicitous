package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextView placements;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        placements = (TextView)findViewById(R.id.placements);

        placements.setMovementMethod(new ScrollingMovementMethod());


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

            Intent RegisterIntent99 = new Intent(MainActivity.this , usersignup.class);
            startActivity(RegisterIntent99);

        }

        return true;
    }


}

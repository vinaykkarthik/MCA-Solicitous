package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class overallActivity extends AppCompatActivity {

TextView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overall);


        TextView txtView=(TextView) findViewById(R.id.scroller);
        txtView.setSelected(true);

        Button   facultyinfo =(Button)findViewById(R.id.facultyinfo);
        Button course = (Button)findViewById(R.id.course);
        Button placements = (Button)findViewById(R.id.placements);
    facultyinfo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent int1 = new Intent(overallActivity.this,staffInfo.class);
            startActivity(int1);
        }
    });
     course.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent int2 = new Intent(overallActivity.this, course.class);
        startActivity(int2);

    }
});
        placements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(overallActivity.this, placementhomepage.class);
                startActivity(int3);

            }
        });

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

            Intent RegisterIntent12 = new Intent(overallActivity.this , usersignup.class);
            startActivity(RegisterIntent12);

        }

        return true;
    }
}

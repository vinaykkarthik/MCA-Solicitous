package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class placementsbooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placementsbooks);


        TextView ci =(TextView)findViewById(R.id.ci1);
        ci.setMovementMethod(LinkMovementMethod.getInstance());
        TextView jp =(TextView)findViewById(R.id.jp1);
        jp.setMovementMethod(LinkMovementMethod.getInstance());
        TextView rj =(TextView)findViewById(R.id.rj1);
        rj.setMovementMethod(LinkMovementMethod.getInstance());
        TextView bs =(TextView)findViewById(R.id.bs1);
        bs.setMovementMethod(LinkMovementMethod.getInstance());

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

            Intent RegisterIntent14 = new Intent(placementsbooks.this , usersignup.class);
            startActivity(RegisterIntent14);

        }

        return true;
    }
}

package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class IIMCA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iimc);




        TextView  dwdm =(TextView)findViewById(R.id.dmdw1);
        dwdm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView  ooad =(TextView)findViewById(R.id.ooad1);
        ooad.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  ec =(TextView)findViewById(R.id.ec1);
        ec.setMovementMethod(LinkMovementMethod.getInstance());

        TextView  scm =(TextView)findViewById(R.id.scm1);
        scm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView  csharp =(TextView)findViewById(R.id.csharp1);
        csharp.setMovementMethod(LinkMovementMethod.getInstance());






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

            Intent RegisterIntent201 = new Intent(IIMCA.this , usersignup.class);
            startActivity(RegisterIntent201);

        }

        return true;
    }
}

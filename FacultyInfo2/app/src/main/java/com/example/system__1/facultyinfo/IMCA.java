package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class IMCA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        TextView  cp =(TextView)findViewById(R.id.c1);
        cp.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  dm =(TextView)findViewById(R.id.dm1);
        dm.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  coa =(TextView)findViewById(R.id.coa1);
        coa.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  ds =(TextView)findViewById(R.id.ds1);
        ds.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  dbms =(TextView)findViewById(R.id.dbms1);
        dbms.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  ob =(TextView)findViewById(R.id.ob1);
        ob.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  os =(TextView)findViewById(R.id.os1);
        os.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  or =(TextView)findViewById(R.id.or1);
        or.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  daa =(TextView)findViewById(R.id.daa1);
        daa.setMovementMethod(LinkMovementMethod.getInstance());
        TextView  ac =(TextView)findViewById(R.id.ac1);
        ac.setMovementMethod(LinkMovementMethod.getInstance());




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

            Intent RegisterIntent101 = new Intent(IMCA.this , usersignup.class);
            startActivity(RegisterIntent101);

        }

        return true;
    }


}

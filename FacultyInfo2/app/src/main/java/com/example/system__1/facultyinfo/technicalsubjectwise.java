package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class technicalsubjectwise extends AppCompatActivity {
Button dm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technicalsubjectwise);


    Button dm = (Button)findViewById(R.id.dm);
    Button ds = (Button)findViewById(R.id.ds);
        Button os = (Button)findViewById(R.id.os);
        Button cn = (Button)findViewById(R.id.cn);
        Button dbms = (Button)findViewById(R.id.dbms);
        Button se = (Button)findViewById(R.id.se);

    dm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent  dm1 =  new Intent(technicalsubjectwise.this,  dm.class);
            startActivity(dm1);
        }

    });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  ds1 =  new Intent(technicalsubjectwise.this,  ds.class);
                startActivity(ds1);
            }

        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  os1 =  new Intent(technicalsubjectwise.this,  os.class);
                startActivity(os1);
            }

        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  cn1 =  new Intent(technicalsubjectwise.this,  cn.class);
                startActivity(cn1);
            }

        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  dbms24 =  new Intent(technicalsubjectwise.this,  dbms.class);
                startActivity(dbms24);
            }

        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  se12 =  new Intent(technicalsubjectwise.this,  se.class);
                startActivity(se12);
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

            Intent RegisterIntent21 = new Intent(technicalsubjectwise.this , usersignup.class);
            startActivity(RegisterIntent21);

        }

        return true;
    }
}

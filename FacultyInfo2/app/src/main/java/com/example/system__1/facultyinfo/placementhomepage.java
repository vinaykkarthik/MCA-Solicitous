package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class placementhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placementhomepage);

        Button textbook = (Button)findViewById(R.id.textbook);
        Button pr =(Button)findViewById(R.id.pr);
        Button tec =(Button)findViewById(R.id.tec);
        Button nontec =(Button)findViewById(R.id.nontec);


        textbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int34 = new Intent(placementhomepage.this, placementsbooks.class);
                startActivity(int34);

            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int35 = new Intent(placementhomepage.this, MainActivity.class);
                startActivity(int35);

            }
        });

        tec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int49 = new Intent(placementhomepage.this, technicalsubjectwise.class);
                startActivity(int49);

            }
        });

        nontec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent non = new Intent(placementhomepage.this, nontecquestions.class);
                startActivity(non);

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

            Intent RegisterIntent12 = new Intent(placementhomepage.this , usersignup.class);
            startActivity(RegisterIntent12);

        }

        return true;
    }


}

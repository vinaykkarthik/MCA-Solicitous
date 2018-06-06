package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class course extends AppCompatActivity {


Button IMCA;
Button IIMCA;
Button T1;
Button T2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);



        Button T1 =(Button)findViewById(R.id.T1);
        Button  T2 = (Button) findViewById(R.id.T2);

        Button   IMCA =(Button)findViewById(R.id.IMCA);
        Button   IIMCA =(Button)findViewById(R.id.IIMCA);
        TextView cp1 =(TextView)findViewById(R.id.cp1);
        cp1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView cp2 =(TextView)findViewById(R.id.cp2);
        cp2.setMovementMethod(LinkMovementMethod.getInstance());
        IMCA.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent int2 = new Intent(course.this, IMCA.class);
                                        startActivity(int2);
                                    }
                                });
             IIMCA.setOnClickListener(new View.OnClickListener(){
                 @Override
                    public void onClick(View view) {
                     Intent mca = new Intent(course.this, IIMCA.class);
                     startActivity(mca);
                 }
                });
        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int45 = new Intent(course.this, timetable1.class);
                startActivity(int45);
            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int46 = new Intent(course.this, timetable2.class);
                startActivity(int46);
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

            Intent RegisterIntent301 = new Intent(course.this , usersignup.class);
            startActivity(RegisterIntent301);

        }

        return true;
    }
}

package com.example.system__1.facultyinfo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class resetpassword extends AppCompatActivity {

    private EditText resemail;
    private Button pwdres;
    private FirebaseAuth firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);

        final EditText resemail = (EditText)findViewById(R.id.resemail);
        Button pwdres =(Button)findViewById(R.id.pwdres);
        firebase = FirebaseAuth.getInstance();

        pwdres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = resemail.getText().toString().trim();

                if(email.equals("")){
                    Toast.makeText(resetpassword.this, "Kindly please enter your Registered Mail Id", Toast.LENGTH_SHORT).show();
                }else{
                    firebase.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(resetpassword.this,"Reset password link has sent to ur mail id sucessfully",Toast.LENGTH_SHORT).show();

                                finish();
                                startActivity( new Intent (resetpassword.this,usersignup.class));
                                Toast.makeText(resetpassword.this,"kindly check ur mail u have entered",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }


            }
        });



    }
}

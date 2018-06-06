package com.example.system__1.facultyinfo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText email;
    private EditText pwd;
    private FirebaseAuth firebaseAuth;
    private Button repwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        repwd =(Button)findViewById(R.id.repwd);
        email =(EditText)findViewById(R.id.email);
        pwd =(EditText)findViewById(R.id.pwd);
        firebaseAuth = FirebaseAuth.getInstance();


        repwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(login.this, resetpassword.class);
                startActivity(re);

            }
        });


    }
    public void login_Click(View v){
        if(!email.getText().toString().equals("")  && !pwd.getText().toString().equals("")) {
            final ProgressDialog progressdiaglog = ProgressDialog.show(login.this, "Please wait...", "Logging in..", true);
            (firebaseAuth.signInWithEmailAndPassword(email.getText().toString(), pwd.getText().toString()))
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressdiaglog.dismiss();

                            if (task.isSuccessful()) {
                                Toast.makeText(login.this, "Login Successfull...", Toast.LENGTH_LONG).show();

                                Intent i = new Intent(login.this, overallActivity.class);
                                i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                                startActivity(i);


                            } else {
                                Log.e("ERROR", task.getException().toString());
                                Toast.makeText(login.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();

                            }
                        }
                    });

        }
        else
        {
            Toast.makeText(login.this, "Please fill the Required fields", Toast.LENGTH_LONG).show();
        }
    }









}




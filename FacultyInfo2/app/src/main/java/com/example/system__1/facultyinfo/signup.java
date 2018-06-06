package com.example.system__1.facultyinfo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {


     private Button register;
   private  EditText pwd;
     private EditText email;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        pwd =(EditText)findViewById(R.id.pwd);
        email =(EditText)findViewById(R.id.email);
        firebaseAuth = FirebaseAuth.getInstance();

    }

    public void register_Click(View v){
        if(!email.getText().toString().equals("")  && !pwd.getText().toString().equals("")) {
            final ProgressDialog progressDialog = ProgressDialog.show(signup.this, "Please Wait..", "Registering....", true);
            (firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), pwd.getText().toString()))
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();

                            if (task.isSuccessful()) {

                                Toast.makeText(signup.this, "Registered Successfully....", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(signup.this, login.class);
                                startActivity(i);
                            } else {
                                Log.e("ERROR", task.getException().toString());
                                Toast.makeText(signup.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }


                        }
                    });
        }
        else{
            Toast.makeText(signup.this,"Please fill the Required fields", Toast.LENGTH_LONG).show();

        }
    }


}




package com.mc2022.template;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText ETpassword, ETemail;
    FirebaseAuth fauth;
    Button loginbutton;
    Button createacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ETemail = findViewById(R.id.Email);
        ETpassword = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginbutton);
        createacc=(Button)findViewById(R.id.createbutton);
        fauth = FirebaseAuth.getInstance();


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = ETemail.getText().toString().trim();
                String password = ETpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    ETemail.setError("Email is required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    ETemail.setError("Password is required");
                    return;
                }

                if (password.length() < 6) {
                    ETpassword.setError("Password must be >= 6 characters long");
                    return;
                }

                //authentication

                fauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), userprofile.class));
                        }
                        else{
                            Toast.makeText(Login.this, "Error!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag", "create account button click");
                Intent intent=new Intent(Login.this,Register.class);
                startActivity(intent);
                //startActivity(new Intent(getApplicationContext(), Register.class));
            }
        });
    }
}
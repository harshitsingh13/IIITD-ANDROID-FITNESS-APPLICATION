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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    EditText ETname, ETpassword, ETemail, ETgender, ETage,ETnumber, ETheight, ETweight;
    Button registerbutton;
    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    TextView TVloginhere;
    String userID;
    public static String revstring="";
    public static String email="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        ETname = findViewById(R.id.Username);
        ETgender=findViewById(R.id.gender);
        ETage=findViewById(R.id.age);
        ETemail = findViewById(R.id.Email);
        ETpassword = findViewById(R.id.password);
        ETnumber=findViewById(R.id.number);
        registerbutton = findViewById(R.id.registerbutton);
        TVloginhere = findViewById(R.id.loginhere);
        ETheight=findViewById(R.id.height);
        ETweight=findViewById(R.id.weight);


        fauth = FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();

        if (fauth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), userprofile.class));
            finish();
        }


        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email = ETemail.getText().toString().trim();
                String password = ETpassword.getText().toString().trim();
                String name= ETname.getText().toString();
                String age=ETage.getText().toString();
                String gender=ETgender.getText().toString();
                String number= ETnumber.getText().toString();
                String height=ETheight.getText().toString();
                String weight=ETweight.getText().toString();

                revstring= reverseString(email);
                String domain= reverseString(revstring.substring(0, 11));

                if(domain.equals("iiitd.ac.in")==false){
                    ETemail.setError("Register using IIIT-D email only");
                    return;
                }

                if (number.length()!=10 ) {
                    ETnumber.setError("Enter correct number (without country code)");
                    return;
                }

                if (TextUtils.isEmpty(email) ) {
                    ETemail.setError("Email is required");
                    return;
                }
                //else

                if (TextUtils.isEmpty(password)) {
                    ETemail.setError("Password is required");
                    return;
                }

                if (password.length() < 6) {
                    ETpassword.setError("Password must be >= 6 characters long");
                    return;
                }

                //user registration in firebase
                fauth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            //verify email
                            FirebaseUser newuser=fauth.getCurrentUser();
                            newuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Toast.makeText(Register.this, "Verification Email send Successfully", Toast.LENGTH_SHORT).show();

                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d("tag", "on failure:Email not send to the new user"+e.getMessage());
                                }
                            });

                            Toast.makeText(Register.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                            userID=fauth.getCurrentUser().getUid();
                            DocumentReference documentReference=fstore.collection("users").document(userID);
                            Map<String,Object> user =new HashMap<>();
                            user.put("name", name);
                            user.put("age", age);
                            user.put("gender", gender);
                            user.put("email", email);
                            user.put("number", number);
                            user.put("height", height);
                            user.put("weight", weight);

                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {

                                    Toast.makeText(Register.this, "User Profile is Created for"+ userID, Toast.LENGTH_SHORT).show();

                                }
                            });
                            startActivity(new Intent(getApplicationContext(), userprofile.class));
                        } else {
                            Toast.makeText(Register.this, "Error!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        TVloginhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));



            }
        });



    }
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

}
package com.mc2022.template;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class userprofile extends AppCompatActivity {

    Button sendcode,b1;
    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    TextView name, email, number, age, gender, emailmessage, userprofile;
    String userID;
    options option=new options();
    FrameLayout fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        name=findViewById(R.id.profilename);
        email=findViewById(R.id.profileemail);
        age=findViewById(R.id.profileage);
        gender=findViewById(R.id.profilegender);
        number=findViewById(R.id.profilenumber);
        userprofile=findViewById(R.id.userprofile);

        sendcode=findViewById(R.id.sendcode);
        emailmessage=findViewById(R.id.verifymessage);

        fauth = FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();
        userID=fauth.getCurrentUser().getUid();

        FirebaseUser user= fauth.getCurrentUser();
        if(!user.isEmailVerified()){
            sendcode.setVisibility(View.VISIBLE);
            emailmessage.setVisibility(View.VISIBLE);

            sendcode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(view.getContext(), "Verification Email send Successfully", Toast.LENGTH_SHORT).show();

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("tag", "on failure:Email not send to the new user"+e.getMessage());
                        }
                    });




                }
            });
        }
        fr=findViewById(R.id.frameLayout);
        b1=(Button) findViewById(R.id.startbutton);//defining button for 'submit' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,new options());
                name.setVisibility(view.GONE);
                email.setVisibility(view.GONE);
                age.setVisibility(view.GONE);
                gender.setVisibility(view.GONE);
                number.setVisibility(view.GONE);
                userprofile.setVisibility(view.GONE);
                sendcode.setVisibility(view.GONE);
                emailmessage.setVisibility(view.GONE);
                b1.setVisibility(view.GONE);
                //fr.setVisibility(view.INVISIBLE);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent = new Intent(userprofile.this, MainActivity.class);
                //startActivity(intent);
            }
        });


    }



    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }
}
package com.mc2022.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int count=0;
    public static int ex1=30;
    public static int ex2=15;
    public static int ex3=20;
    public static int ex4=10;
    public static int ex5=5;
    public static int ex6=5;
    public static int ex7=10;
    public static int ex8=10;
    public static int ex9=10;
    public static int ex10=10;
    public static String text="";
    project1 p1=new project1();
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,p1);
        fragmentTransaction.commit();

        /*b1=(Button) findViewById(R.id.physical_fitness);//defining button for 'start service' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,p1);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });*/
    }
}
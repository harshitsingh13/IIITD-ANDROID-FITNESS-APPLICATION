package com.mc2022.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int count=0;
    public static int ex1=30;
    public static int ex2=15;
    public static int ex3=20;
    public static int ex4=5;
    public static int ex5=5;
    public static int ex6=10;
    public static int ex7=10;
    public static int ex8=10;
    public static int ex9=10;
    public static int ex10=10;
    private static final String TAG = "msg";
    public static String text="";
    options option=new options();
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(!option.isAdded())
            fragmentTransaction.add(R.id.frameLayout,option);
        fragmentTransaction.addToBackStack(String.valueOf(option));
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

    android.widget.Toast Toast;
    @Override
    protected  void onResume(){// for onresume activity cycle
        super.onResume();
        Log.i(TAG,"Currently on onResume");
        Toast.makeText(getApplicationContext(),"Currently on onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onStart(){// for onstart activity cycle
        super.onStart();
        Log.i(TAG,"Currently on onStart");
        Toast.makeText(getApplicationContext(),"Currently on onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onStop(){// for onstop activity cycle
        super.onStop();
        Log.i(TAG,"Currently on onStop");
        Toast.makeText(getApplicationContext(),"Currently on onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onDestroy(){// for ondestroy activity cycle
        super.onDestroy();
        Log.i(TAG,"Currently on onDestroy");
        Toast.makeText(getApplicationContext(),"Currently on onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onPause(){// for onpause activity cycle
        super.onPause();
        Log.i(TAG,"Currently on onPause");
        Toast.makeText(getApplicationContext(),"Currently on onResume", Toast.LENGTH_SHORT).show();
    }

}
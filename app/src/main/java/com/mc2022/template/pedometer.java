package com.mc2022.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class pedometer extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private boolean running=false;
    private float totalSteps=0;
    private float previousTotalSteps=0;
    private Sensor accel;
    public static int steps=0;
    TextView steps_taken;
    TextView total_max;
    TextView cal;
    CircularProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedometer);
        steps_taken=(TextView) findViewById(R.id.steps_done);
        total_max=(TextView) findViewById(R.id.max_total);
        progressBar=(CircularProgressBar) findViewById(R.id.circularProgressBar);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        cal=(TextView) findViewById(R.id.calvis);
        Log.d("msg","first 0");
        loadData();
        resetSteps();
    }


    @Override
    protected void onResume() {
        super.onResume();
        running=true;
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(accel==null){
            Toast.makeText(this,"No sensor detected on this device",Toast.LENGTH_SHORT).show();
            Log.d("msg","first 3");
        }
        else{
            sensorManager.registerListener(this,accel,SensorManager.SENSOR_DELAY_UI);
        }
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(running){
            //progressBar.setProgressMax(25000);
            totalSteps=sensorEvent.values[0];
            int a= (int) totalSteps,b=(int) previousTotalSteps,currentsteps;
            currentsteps=a-b;
            String s=Integer.toString(currentsteps);
            steps=currentsteps;
            cal.setText(Integer.toString((int)(steps*0.035)));
            steps_taken.setText(s);
            progressBar.setProgress(Float.parseFloat(s));
            float c=(float) currentsteps;
            //progressBar.setProgressWithAnimation(c, 1000L);
            Log.d("msg","first 4");
        }
    }
    public void resetSteps(){
        steps_taken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(pedometer.this,"Long Tap to reset",Toast.LENGTH_LONG);
                Log.d("msg","first 5");
            }
        });

        steps_taken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousTotalSteps=totalSteps;
                steps_taken.setText("0");
                savedata();
                Log.d("msg","first 6");
            }
        });
    }
    private void savedata(){
        SharedPreferences sharedPreferences=getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putFloat("key1",previousTotalSteps);
        editor.apply();
        Log.d("msg","first 2");
    }
    private void loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences("mypref",MODE_PRIVATE);
        float savenumber=sharedPreferences.getFloat("key1",0);
        Log.d("MainActivity",String.valueOf(savenumber));
        previousTotalSteps=savenumber;
        Log.d("msg","first 1");
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
package com.example.blackdartq.cloudmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        int i = 1;

        Thread Timer = new Thread(){ // makes a new thread that counts down to switch.
          public void run(){

              WaitToSwitch(); //uses method
          }

        };

        Timer.start(); //starts the thread
    }

    // This method makes the app wait to switch

    public void WaitToSwitch(){

        try {
            Thread.sleep(2000);
            Intent b = new Intent(this, MainActivity.class);
            startActivity(b);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
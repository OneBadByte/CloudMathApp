package com.example.blackdartq.cloudmath;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.*;


public class MainActivity extends FragmentActivity {

    Button wattButton;
    Button voltButton;
    Button ampButton;
    Button ohmButton;
    Button infoButton;
    TextView totalTextView;
    int whichButtonsClicked;
    int backgroundColor = Color.parseColor("#00b2ff");
    int textColor = Color.parseColor("#000000");
    int fragmentCurrentlyOn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ------------------------ Declaring section --------
        wattButton = (Button)findViewById(R.id.wattButton);
        voltButton = (Button)findViewById(R.id.voltButton);
        ohmButton = (Button)findViewById(R.id.ohmButton);
        ampButton = (Button)findViewById(R.id.ampButton);
        infoButton = (Button)findViewById(R.id.infoButton);
        totalTextView = (TextView)findViewById(R.id.totalTextView);



        //---------- Buttons-------------------------------------

        ohmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 1;
                changeButtonColor();

                OhmsFragment ohmsFragment = new OhmsFragment();
                android.app.FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.defaultFragmentlayout, ohmsFragment);
                ft.commit();


            }
        });

        wattButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 2;
                changeButtonColor();

                WattsFragment wattsFragment = new WattsFragment();
                DefaultFragment defaultFragment = new DefaultFragment();
                android.app.FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.defaultFragmentlayout, wattsFragment);
                ft.commit();

            }
        });

        ampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 3;
                changeButtonColor();
                AmpsFragment ampsFragment = new AmpsFragment();
                android.app.FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.defaultFragmentlayout, ampsFragment);
                ft.commit();
            }
        });


        voltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 4;
                changeButtonColor();
                VoltsFragment voltsFragment = new VoltsFragment();
                android.app.FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.defaultFragmentlayout, voltsFragment);
                ft.commit();

            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), InfoActivity.class);
                startActivity(i);

            }
        });


        //ft.commit();

    }


    public void changeButtonColor(){

        // change everything back to normal
        wattButton.setBackgroundColor(backgroundColor);
        wattButton.setTextColor(Color.BLACK);
        ohmButton.setBackgroundColor(backgroundColor);
        ohmButton.setTextColor(Color.BLACK);
        voltButton.setBackgroundColor(backgroundColor);
        voltButton.setTextColor(Color.BLACK);
        ampButton.setBackgroundColor(backgroundColor);
        ampButton.setTextColor(Color.BLACK);

        //sets the buttons colors
        if (whichButtonsClicked == 1){
            ohmButton.setBackgroundColor(Color.BLACK);
            ohmButton.setTextColor(Color.CYAN);

        }else if(whichButtonsClicked == 2){
            wattButton.setBackgroundColor(Color.BLACK);
            wattButton.setTextColor(Color.CYAN);

        }else if(whichButtonsClicked == 3){
            ampButton.setBackgroundColor(Color.BLACK);
            ampButton.setTextColor(Color.CYAN);

        }else if(whichButtonsClicked == 4){
            voltButton.setBackgroundColor(Color.BLACK);
            voltButton.setTextColor(Color.CYAN);

        }

    }


}





package com.example.blackdartq.cloudmath;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.*;
import android.widget.RadioGroup;
import android.view.*;
import android.widget.RadioGroup.*;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button wattButton;
    Button voltButton;
    Button ampButton;
    Button ohmButton;
    TextView totalTextView;
    int whichButtonsClicked;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ------------------------ Declaring section --------

        wattButton = (Button)findViewById(R.id.wattButton);
        voltButton = (Button)findViewById(R.id.voltButton);
        ohmButton = (Button)findViewById(R.id.ohmButton);
        ampButton = (Button)findViewById(R.id.ampButton);
        totalTextView = (TextView)findViewById(R.id.totalTextView);


        //---------- Buttons-------------------------------------

        ohmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 1;
                changeButtonColor();

            }
        });

        wattButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 2;
                changeButtonColor();

            }
        });

        ampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 3;
                changeButtonColor();
            }
        });


        voltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(" ");
                whichButtonsClicked = 4;
                changeButtonColor();
            }
        });




    }


    public void changeButtonColor(){

        // change everything back to normal
        wattButton.setBackgroundColor(Color.CYAN);
        wattButton.setTextColor(Color.BLACK);
        ohmButton.setBackgroundColor(Color.CYAN);
        ohmButton.setTextColor(Color.BLACK);
        voltButton.setBackgroundColor(Color.CYAN);
        voltButton.setTextColor(Color.BLACK);
        ampButton.setBackgroundColor(Color.CYAN);
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





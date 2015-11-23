package com.example.blackdartq.cloudmath;

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

    RadioButton RadioButton1;
    RadioButton RadioButton2;
    RadioButton RadioButton3;
    RadioGroup RadioGroup;

    TextView Text1;
    TextView Text2;
    double first;
    double second;

    public void Amps() {


        EditText TextBox1 = (EditText) findViewById(R.id.TextBox1);// creates the first box
        EditText TextBox2 = (EditText) findViewById(R.id.TextBox2);// creates the second box
        double FirstVal = 0;
        double SecondVal = 0;

        String FirstString = TextBox1.getText().toString();// gets the first string
        String SecondString = TextBox2.getText().toString(); //gets the second string
        if (!FirstString.isEmpty() || !SecondString.isEmpty())
        {
            // Handle error here
        }
        // makes them into doubles
        FirstVal = Double.parseDouble(FirstString);
        double First = FirstVal * 1;
        SecondVal = Double.parseDouble(SecondString);
        double Second = SecondVal * 1;
        double TotalVar = First / Second * 1; // gets the amps
        //
        String Total = Double.toString(TotalVar); //makes TotalVar a string

        TextView TotalBox = (TextView) findViewById(R.id.TotalBox);
        TotalBox.setText(Total.substring(0, 4) + " Amps a battery needs.");

    }

    public void Watts() {


        EditText TextBox1 = (EditText) findViewById(R.id.TextBox1);// creates the first box
        EditText TextBox2 = (EditText) findViewById(R.id.TextBox2);// creates the second box

        String FirstString = TextBox1.getText().toString();// gets the first string
        String SecondString = TextBox2.getText().toString(); //gets the second string
        // makes them into doubles
        double FirstVal = Double.parseDouble(FirstString);
        double SecondVal = Double.parseDouble(SecondString);
        double TotalVar = FirstVal * SecondVal; // gets the amps
        //
        String Total = Double.toString(TotalVar); //makes TotalVar a string

        TextView TotalBox = (TextView) findViewById(R.id.TotalBox);
        TotalBox.setText("You have "+ Total.substring(0, 4) + " Watts of power");

    }

    public void Resist() {

        EditText TextBox1 = (EditText) findViewById(R.id.TextBox1);// creates the first box
        EditText TextBox2 = (EditText) findViewById(R.id.TextBox2);// creates the second box

        String FirstString = TextBox1.getText().toString();// gets the first string
        String SecondString = TextBox2.getText().toString(); //gets the second string
        // makes them into doubles
        double FirstVal = Double.parseDouble(FirstString);

        double SecondVal = Double.parseDouble(SecondString);

        double TotalVar = FirstVal / SecondVal; // gets the amps


        String Total = Double.toString(TotalVar); //makes TotalVar a string

        // makes the first side textbox Volts

        TextView TotalBox = (TextView) findViewById(R.id.TotalBox);
        TotalBox.setText("You have a " + Total.substring(0, 4) + " Ohm limit");

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioButton1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioGroup = (RadioGroup)findViewById(R.id.RadioGroup);
        //-------------------------------------------------Amps---------------------------
         RadioButton1.setOnClickListener(
                 new RadioButton.OnClickListener() {
                     public void onClick(View v) {

                         if (RadioButton1.isChecked()) {
                             Text1 = (TextView) findViewById(R.id.Text1);
                             Text2 = (TextView) findViewById(R.id.Text2);

                             Text1.setText("Volts");
                             Text2.setText("Ohms");

                         }
                         else {
                         }
                     }
                 });
        //-------------------------------------------------Ohm---------------------------
        RadioButton2.setOnClickListener(
                new RadioButton.OnClickListener() {
                    public void onClick(View v) {

                        if (RadioButton2.isChecked()) {
                            Text1 = (TextView) findViewById(R.id.Text1);
                            Text2 = (TextView) findViewById(R.id.Text2);

                            Text1.setText("Volts");
                            Text2.setText("Amps");

                        }
                    }
                });
        //-------------------------------------------------Watts---------------------------
        RadioButton3.setOnClickListener(
                new RadioButton.OnClickListener() {
                    public void onClick(View v) {

                        if (RadioButton3.isChecked()) {
                            Text1 = (TextView) findViewById(R.id.Text1);
                            Text2 = (TextView) findViewById(R.id.Text2);

                            Text1.setText("Volts");
                            Text2.setText("Amps");

                        }
                    }
                });

        //---------------------------Button-----------------------------------------

        final Button TotalButton = (Button) findViewById(R.id.TotalButton);

        TotalButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (RadioButton1.isChecked()) {
                            // Radio 1 selected
                            Amps();


                        } else if (RadioButton2.isChecked()) {
                            Resist();

                        } else if (RadioButton3.isChecked()) {
                            Watts();

                        } else {
                            TotalButton.setText("please click ratio Button");

                        }
                    }

                }

        );


    }
}





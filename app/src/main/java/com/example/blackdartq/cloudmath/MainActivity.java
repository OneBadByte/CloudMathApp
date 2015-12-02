package com.example.blackdartq.cloudmath;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.*;


public class MainActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.portrait_layout);
        } else {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.landscape_layout);

        }
    }

}





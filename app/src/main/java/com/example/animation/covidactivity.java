package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class covidactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covidactivity);
        getSupportActionBar().hide();
    }
}
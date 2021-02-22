package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class spllashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spllashactivity);
        getSupportActionBar().hide();
        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                } catch (Exception ex) {
                    ex.printStackTrace();

                } finally {
                    Intent intent = new Intent(spllashactivity.this , MainActivity.class) ;
                    startActivity(intent);
                    finish();

                }
            }
        };td.start();
    }
}
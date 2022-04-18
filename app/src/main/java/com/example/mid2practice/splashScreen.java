package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                finish();
                startActivity(new Intent(splashScreen.this, MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(timerTask, 1000);
    }
}
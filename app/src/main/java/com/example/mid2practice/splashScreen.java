package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.window.SplashScreen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//
//                finish();
//                startActivity(new Intent(splashScreen.this, MainActivity.class));
//            }
//        };
//        Timer opening = new Timer();
//        opening.schedule(timerTask, 1000);

        TextView timertxt = (TextView) findViewById(R.id.timertxt);
        new CountDownTimer(10000, 10) {
            public void onTick(long millisUntilFinished) {
                timertxt.setText("seconds remaining: " +new SimpleDateFormat("ss").format(new Date( millisUntilFinished)));
            }

            public void onFinish() {
                timertxt.setText("done!");
            }
        }.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splashScreen.this,MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,6000);

    }
}
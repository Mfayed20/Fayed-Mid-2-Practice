package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FadeAnimation extends AppCompatActivity {

    AnimationDrawable lightsAnimation; // global
    boolean play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_animation);


        ImageView fadeAnimIV = (ImageView) findViewById(R.id.fadeAnimIV);  // IMPORTANT!! don't put an image as it will make it static
        fadeAnimIV.setBackgroundResource(R.drawable.animation);           // put the animation XML as setBackgroundResource

        lightsAnimation = (AnimationDrawable) fadeAnimIV.getBackground();

        Button fadeAnimBttn = (Button) findViewById(R.id.fadeAnimBttn);

        fadeAnimBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play==false){
                    lightsAnimation.start();
                    play=!play;
                }else {
                    lightsAnimation.stop();
                    play=!play;
                }
            }
        });

    }
}
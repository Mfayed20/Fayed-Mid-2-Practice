package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        ImageView tweenImage = (ImageView) findViewById(R.id.tweenImage);  //!! put an image to rotate it
        tweenImage.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate));

    }
}
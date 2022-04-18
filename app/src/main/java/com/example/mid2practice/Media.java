package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Media extends AppCompatActivity {

    MediaPlayer mediaPlayer1;
    boolean playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        mediaPlayer1 = new MediaPlayer();
        mediaPlayer1 = MediaPlayer.create(this, R.raw.track1);

        Button mediaBttn = (Button) findViewById(R.id.mediaBttn);

        mediaBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playing==false){
                    mediaPlayer1.start();
                    playing=!playing;
                }else{
                    mediaPlayer1.pause();
                    playing=!playing;
                }
            }
        });


    }
}
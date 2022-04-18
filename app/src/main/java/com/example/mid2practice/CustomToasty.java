package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import es.dmoral.toasty.Toasty;


public class CustomToasty extends AppCompatActivity {

    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);

        Button toastybttn = (Button) findViewById(R.id.toastybttn);

        toastybttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count==0){
                    Toasty.info(getBaseContext(), "This is an info toast.", Toast.LENGTH_SHORT, true).show();
                    count++;
                }else if (count==1) {
                    Toasty.error(getBaseContext(), "This is an info toast.", Toast.LENGTH_SHORT, true).show();
                    count++;
                }else{
                        Toasty.success(getBaseContext(), "This is an info toast.", Toast.LENGTH_SHORT, true).show();
                        count=0;
                }
            }
        });
    }
}
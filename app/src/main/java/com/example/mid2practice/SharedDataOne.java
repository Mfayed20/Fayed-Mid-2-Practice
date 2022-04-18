package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class SharedDataOne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_data_one);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        String str = "Hello";
        int number = 1000;
        float decimalNum = 5.5F;

        Button sharedDataBttn = (Button) findViewById(R.id.sharedDataBttn);

        sharedDataBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPref.edit();     // inside onClick
                editor.putInt("key1", number);
                editor.putFloat("key2", decimalNum);
                 editor.putString("key3", str);
                editor.commit();
            }
        });
    }
}
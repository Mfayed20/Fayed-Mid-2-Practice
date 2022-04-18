package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class SharedDataTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_data_two);

        TextView sharedDataTV = (TextView) findViewById(R.id.sharedDataTV);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        int years = sharedPref.getInt("key1",0);
        float interest = sharedPref.getFloat("key2",0);
        String str = sharedPref.getString("key3","0");

        sharedDataTV.setText(years+" "+interest+" "+str);


    }
}
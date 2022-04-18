package com.example.mid2practice;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String [] array = {"Splash","URL","Media","Grid","Data Picker","Fade Animation",
            "Tween Animation","SharedData One","SharedData two","Table","Toasty","SQLite DB","Weather API"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.list,array));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){

            case 0:
                startActivity(new Intent(MainActivity.this, splashScreen.class));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Media.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Grid.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, DataPicker.class));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, FadeAnimation.class));
                break;
            case 6:
                startActivity(new Intent(MainActivity.this, TweenAnimation.class));
                break;
            case 7:
                startActivity(new Intent(MainActivity.this, SharedDataOne.class));
                break;
            case 8:
                startActivity(new Intent(MainActivity.this, SharedDataTwo.class));
                break;
            case 9:
                startActivity(new Intent(MainActivity.this, Table.class));
                break;
            case 10:
                startActivity(new Intent(MainActivity.this, CustomToasty.class));
                break;
            case 11:
                startActivity(new Intent(MainActivity.this, MySQLite.class));
                break;
            case 12:
                startActivity(new Intent(MainActivity.this, WeatherAPi.class));
                break;
        }
    }
}
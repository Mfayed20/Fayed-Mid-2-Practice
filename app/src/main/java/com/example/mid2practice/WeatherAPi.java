package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherAPi extends AppCompatActivity {

    String logName = "Fayed";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_api);

        String city = "riyadh";
        String key = "ceae73f848981fda58066979faec2f2e";
        // we"ll make HTTP request to this URL to retrieve weather conditions
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="+key+"&units=metric";
        weather(url);

        Log.d(logName,logName);

    }
    public void weather (String url){
        JsonObjectRequest jsonObj = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d(logName,"Response received");
                Log.d(logName,response.toString());
                try {

                    // for normal objects
                    String base = response.getString("base");
//                                                  .getDouble()...
                    Log.d(logName,base);

                    // for nested JSON
                    JSONObject JSONClouds = response.getJSONObject("clouds");
                    int all = JSONClouds.getInt("all");
                    Log.d(logName,String.valueOf(all));

                    // for JSON array
                    JSONArray JSONWeather = response.getJSONArray("weather");
                    for (int i = 0; i < JSONWeather.length(); i++) {
                        JSONObject JSONWeatherObject = JSONWeather.getJSONObject(i);
                        String main = JSONWeatherObject.getString("main");
                        Log.d(logName,main);
                    }

                } catch (JSONException e){
                    e.printStackTrace();
                    Log.d(logName+"-error",e.toString());
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jsonObj);
    }
}
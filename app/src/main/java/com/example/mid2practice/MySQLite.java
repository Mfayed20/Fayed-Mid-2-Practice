package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MySQLite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sqlite);

        TextView productID = (TextView) findViewById(R.id.productID);
        TextView productName = (TextView) findViewById(R.id.productName);

        DatabaseHelper myDB = new DatabaseHelper(MySQLite.this);


        myDB.addData("Family");
        myDB.addData("Fayed");

        Cursor res = myDB.structuredQuery("Family");

        productID.setText(res.getString(0));
        productName.setText(res.getString(1));

        if (myDB.deleteData("2")) {
            Toast.makeText(this, "Record Deleted", Toast.LENGTH_SHORT).show();
            Log.d("Fayed","Record Deleted");
        }else{
            Log.d("Fayed","Record not Deleted");
        }

    }
}
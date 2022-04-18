package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MySQLite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sqlite);

        TextView productID = (TextView) findViewById(R.id.productID);
        TextView productName = (TextView) findViewById(R.id.productName);

        Button viewBttn = (Button) findViewById(R.id.viewBttn);
        TextView allDbText = (TextView) findViewById(R.id.allDbText);

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

        viewBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cur = myDB.getListContents();
                StringBuffer buffer = new StringBuffer();

                while(cur.moveToNext()){
                    buffer.append("id: "+cur.getString(0)+"\n");
                    buffer.append("Name: "+cur.getString(1)+"\n\n");
                }
                allDbText.setText(buffer.toString());

                //AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                //builder.setCancelable(true);
                //builder.setTitle("All Emplpyees");
                //builder.setMessage(buffer.toString());
                //builder.show();

            }
        });

    }
}
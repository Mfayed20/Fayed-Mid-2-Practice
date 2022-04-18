package com.example.mid2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Grid extends AppCompatActivity {

    Integer imagesArray[] = {R.drawable.cat4, R.drawable.cub2, R.drawable.cute6, R.drawable.deer8, R.drawable.jir1,
            R.drawable.lioness5, R.drawable.lynx7, R.drawable.monkey10, R.drawable.wolf3, R.drawable.wolf9};

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(Grid.this, "Species No. +(position+1)", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class ImageAdapter extends BaseAdapter {

        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return imagesArray.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(imagesArray[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }
    }
}
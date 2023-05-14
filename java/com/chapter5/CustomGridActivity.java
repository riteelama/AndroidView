package com.chapter5;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.chapter5.adapter.MyGridAdapter;
import com.chapter5.adapter.MyListAdapter;

public class CustomGridActivity extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid);
        gridView = findViewById(R.id.myGridList);

        //creating arrays
        String[] title = {
                "Title 1", "Title 2", "Title 3" , "Title 4","Title 5","Title 6"
        };

        String[] description = {
                "This is description1",
                "This is description2",
                "This is description3",
                "This is description4",
                "This is description5",
                "This is description6"
        };

        int[] image = {
                //Replace with different images
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher
        };

        //passing arrays to constructor of MyListAdapter
        MyGridAdapter adapter = new MyGridAdapter(this,title,description,image);
        gridView.setAdapter(adapter);
    }
}
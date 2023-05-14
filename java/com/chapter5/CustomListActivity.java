package com.chapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.chapter5.adapter.MyListAdapter;

public class CustomListActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        listView = findViewById(R.id.myList);

        //creating arrays
        String[] title = {
                "Title 1", "Title 2", "Title 3" , "Title 4"
        };

        String[] description = {
                "This is description1",
                "This is description2",
                "This is description3",
                "This is description4"
        };

        int[] image = {
                //Replace with different images
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher
        };

        //passing arrays to constructor of MyListAdapter
        MyListAdapter adapter = new MyListAdapter(this,title,description,image);
        listView.setAdapter(adapter);
    }
}
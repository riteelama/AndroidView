package com.chapter5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.chapter5.adapter.RecyclerViewAdapter;
import com.chapter5.data.MyData;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;

    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.itemsRv);

        ArrayList<MyData> data = new ArrayList<>();
        data.add(new MyData("Ritee Lama", "USA", R.mipmap.ic_launcher));
        data.add(new MyData("Rajan Lama", "USA", R.mipmap.ic_launcher));
        data.add(new MyData("Aakriti KC","London",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));
        data.add(new MyData("Kriti","Canada",R.mipmap.ic_launcher));

        data.add(new MyData("Krisha","Canada",R.mipmap.ic_launcher));

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this,data);
        recyclerView.setAdapter(adapter);
    }
}
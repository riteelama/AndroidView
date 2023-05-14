package com.chapter5.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chapter5.R;
import com.chapter5.data.MyData;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Activity context;

    ArrayList<MyData> data;

    public RecyclerViewAdapter(Activity context, ArrayList<MyData> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View listItems = inflater.inflate(R.layout.recycler_view_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItems);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        MyData current = data.get(position);
        holder.txtName.setText(current.getName());
        holder.txtAddress.setText(current.getAddress());
        holder.imageView.setImageResource(current.getImage());
    }

    public int getItemCount() {
        Log.d("Size count","Total size is "+ data.size());
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAddress;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.titleTv);
            txtAddress = itemView.findViewById(R.id.descTv);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}

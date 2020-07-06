package com.example.uitarea03.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uitarea03.R;
import com.example.uitarea03.entities.Items;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Items> listItems;
    public RecyclerViewAdapter(Context context, ArrayList<Items> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View contentView= LayoutInflater.from(context).inflate(R.layout.ly_listusers, null);
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Items item=listItems.get(position);
        Holder Holder= (Holder) holder;
        Holder.tvNombre.setText(item.getNombre());
        Holder.tvApellido.setText(item.getApellido());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    public static class Holder extends RecyclerView.ViewHolder{
        ImageView ivFoto;
        TextView tvNombre;
        TextView tvApellido;

        public Holder(@NonNull View itemView) {
            super(itemView);
            tvNombre=itemView.findViewById(R.id.tvNombre);
            tvApellido=itemView.findViewById(R.id.tvApellido);
        }
    }
}

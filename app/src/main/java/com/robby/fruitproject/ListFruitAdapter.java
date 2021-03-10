package com.robby.fruitproject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFruitAdapter extends RecyclerView.Adapter<ListFruitAdapter.ListViewHolder> {
    private ArrayList<Fruit> listFruit;
    private Context context;

    public ListFruitAdapter(ArrayList<Fruit> list, Context context) {
        this.listFruit = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_fruit, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Fruit fruit= listFruit.get(position);
        Glide.with(holder.itemView.getContext())
                .load(fruit.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(fruit.getNama());
        holder.tvFrom.setText(fruit.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,DetailActivity.class)
                        .putExtra("KeyFruit", fruit.getNama())
                        .putExtra("KeyDesc", fruit.getDeskripsi())
                        .putExtra("KeyFoto", fruit.getFoto())
                );
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFruit.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
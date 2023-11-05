package com.example.parsingjsona_array_movieapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder> {


    public recyclerViewAdapter(Context context, ArrayList<DataModel> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }

    Context context;
    ArrayList<DataModel> moviesList;


    @NonNull
    @Override
    public recyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewAdapter.ViewHolder holder, int position) {

        holder.textView2id.setText(moviesList.get(position).getId());
        holder.textView1Title.setText(moviesList.get(position).getName());

        //adding glide library to display the images
        Glide.with(context)
                .load(moviesList.get(position).getImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1Title;
        TextView textView2id;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1Title = itemView.findViewById(R.id.textView1);
            textView2id = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);



        }
    }
}

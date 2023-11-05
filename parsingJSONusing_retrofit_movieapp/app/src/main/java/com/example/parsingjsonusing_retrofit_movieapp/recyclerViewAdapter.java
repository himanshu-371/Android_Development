package com.example.parsingjsonusing_retrofit_movieapp;

import android.content.Context;
import android.location.Geocoder;
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

    Context context;
    ArrayList<movieDataModelClass> moviesList;

    public recyclerViewAdapter(Context context, ArrayList<movieDataModelClass> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }


    @NonNull
    @Override
    public recyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item,parent,false);
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

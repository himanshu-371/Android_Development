package com.example.parsingjsonfromnestedobject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
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

        holder.textView_id.setText(""+moviesList.get(position).getId());
        holder.textView_title.setText(moviesList.get(position).getTitle());
        holder.textView_category.setText(moviesList.get(position).getMovieDetails().getCategories());
        holder.textView_releasedate.setText(moviesList.get(position).getMovieDetails().getRelease());
        holder.textView_duration.setText(moviesList.get(position).getMovieDetails().getDuration());
        holder.ratingBar.setRating((Float.parseFloat(String.valueOf(moviesList.get(position).getRating())))/2);


        //adding glide library to display the images
        Glide.with(context)
                .load(moviesList.get(position).getPoster())
                .into(holder.imageView_poster);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView_poster;
        TextView textView_category;
        TextView textView_releasedate;
        TextView textView_title;
        TextView textView_duration;
        RatingBar ratingBar;
        TextView textView_id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView_poster = itemView.findViewById(R.id.imageView_poster);
            textView_category = itemView.findViewById(R.id.textView_category);
            textView_releasedate = itemView.findViewById(R.id.textView_releasedate);
            textView_title = itemView.findViewById(R.id.textView_title);
            textView_duration = itemView.findViewById(R.id.textView_duration);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            textView_id = itemView.findViewById(R.id.textView_id);



        }
    }
}

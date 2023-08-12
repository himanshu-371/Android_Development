package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customAdapter extends RecyclerView.Adapter<customAdapter.ViewHolder> {

    Context context;
    ArrayList<dataModel> arrListGames;


    customAdapter(Context context, ArrayList<dataModel> arrListGames ){
            this.context = context;
            this.arrListGames = arrListGames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_games,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userPhoto.setImageResource(arrListGames.get(position).img);
        holder.playerName.setText(arrListGames.get(position).playerName);
        holder.playerID.setText(arrListGames.get(position).playerID);
    }

    @Override
    public int getItemCount() {
        return arrListGames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userPhoto;
        TextView playerName;
        TextView playerID;

        public ViewHolder(View v) {
            super(v);

            userPhoto = itemView.findViewById(R.id.userPhoto);
            playerName = itemView.findViewById(R.id.NameTV);
            playerID = itemView.findViewById(R.id.playerIDTV);


        }
    }
}

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
//        ViewHolder viewHolder = new ViewHolder(view);
//        return viewHolder;    //OR
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userPhoto_IV.setImageResource(arrListGames.get(position).img);
        holder.playerName_TV.setText(arrListGames.get(position).playerName);
        holder.playerID_TV.setText(arrListGames.get(position).playerID);
    }

    @Override
    public int getItemCount() {
        return arrListGames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userPhoto_IV;
        TextView playerName_TV;
        TextView playerID_TV;

        public ViewHolder(View v) {
            super(v);

            userPhoto_IV = itemView.findViewById(R.id.userPhoto);
            playerName_TV = itemView.findViewById(R.id.NameTV);
            playerID_TV = itemView.findViewById(R.id.playerIDTV);


        }
    }
}

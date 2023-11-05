package com.example.parsingjsonobjectspractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class recyclerView_Adapter extends RecyclerView.Adapter<recyclerView_Adapter.ViewHolder> {

    public recyclerView_Adapter(Context context, List<DataModel> jsonDataList) {
        this.context = context;
        this.jsonDataList = jsonDataList;
    }

    Context context;
    List<DataModel> jsonDataList;

    @NonNull
    @Override
    public recyclerView_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.recylerview_item_layout,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerView_Adapter.ViewHolder holder, int position) {

        holder.textView_id.setText(""+jsonDataList.get(position).getId());
        holder.textView_userId.setText(""+jsonDataList.get(position).getUserId());
        holder.textView_title.setText(jsonDataList.get(position).getTitle());
        holder.textView_body.setText(jsonDataList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return jsonDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView_userId;
        TextView textView_id;
        TextView textView_title;
        TextView textView_body;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_userId = itemView.findViewById(R.id.textView_userId);
            textView_id = itemView.findViewById(R.id.textView_id);
            textView_title = itemView.findViewById(R.id.textView_title);
            textView_body = itemView.findViewById(R.id.textView_body);



        }
    }
}

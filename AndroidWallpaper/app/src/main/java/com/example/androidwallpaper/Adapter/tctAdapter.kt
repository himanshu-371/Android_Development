package com.example.androidwallpaper.Adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwallpaper.FinalWallpaper
import com.example.androidwallpaper.Model.tctModel
import com.example.androidwallpaper.R

class tctAdapter(val requireContext: Context, val listTheColorTone: ArrayList<tctModel>) : RecyclerView.Adapter<tctAdapter.tctViewHolder>() {

    inner class tctViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val cardView = itemView.findViewById<CardView>(R.id.item_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tctViewHolder {
        return tctViewHolder(
            LayoutInflater.from(requireContext).inflate(R.layout.item_tct, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listTheColorTone.size
    }

    override fun onBindViewHolder(holder: tctViewHolder, position: Int) {
        val color = listTheColorTone[position].color
        holder.cardView.setCardBackgroundColor(Color.parseColor(color))

        holder.itemView.setOnClickListener{
            val intent = Intent(requireContext, FinalWallpaper::class.java)
            intent.putExtra("link",listTheColorTone[position].link)
            requireContext.startActivity(intent)
        }

    }
}

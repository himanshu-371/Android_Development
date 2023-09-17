package com.example.androidwallpaper.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidwallpaper.FinalWallpaper
import com.example.androidwallpaper.Model.bomModel
import com.example.androidwallpaper.R
import com.makeramen.roundedimageview.RoundedImageView

class catImagesAdapter(val requireContext: Context, val listBestOfTheMonth: ArrayList<bomModel>) : RecyclerView.Adapter<catImagesAdapter.bomViewHolder>() {

    inner class bomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView = itemView.findViewById<RoundedImageView>(R.id.catImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bomViewHolder {
        return bomViewHolder(
            LayoutInflater.from(requireContext).inflate(R.layout.item_wallpaper,parent,false)
        )

    }

    override fun getItemCount(): Int {
        return listBestOfTheMonth.size
    }

    override fun onBindViewHolder(holder: bomViewHolder, position: Int) {
        holder.imageView

        Glide.with(requireContext).load(listBestOfTheMonth[position].link).into(holder.imageView)
        holder.itemView.setOnClickListener{
            val intent = Intent(requireContext, FinalWallpaper::class.java)
            intent.putExtra("link",listBestOfTheMonth[position].link)
            requireContext.startActivity(intent)
        }
    }


}


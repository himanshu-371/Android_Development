package com.example.androidwallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidwallpaper.Adapter.catAdapter
import com.example.androidwallpaper.Adapter.catImagesAdapter
import com.example.androidwallpaper.Model.bomModel
import com.example.androidwallpaper.Model.catModel
import com.example.androidwallpaper.databinding.ActivityCategoryBinding
import com.google.firebase.firestore.FirebaseFirestore


class CatActivity : AppCompatActivity() {

    lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = FirebaseFirestore.getInstance()
        val uid = intent.getStringExtra("uid")
        val name = intent.getStringExtra("name")

        db.collection("categories").document(uid!!).collection("wallpaper").addSnapshotListener { value, error ->

            val listOfCatWallpaper = arrayListOf<bomModel>()
            val data = value?.toObjects(bomModel::class.java)

            listOfCatWallpaper.addAll(data!!)

            binding.catTitle.text=name.toString()
            binding.catCount.text="${listOfCatWallpaper.size.toString()} Wallpapers Availabale"

            binding.catRcv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
            binding.catRcv.adapter=catImagesAdapter(this,listOfCatWallpaper)

        }



    }
}
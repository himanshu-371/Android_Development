package com.himanshu.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.songs_rv_adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvSongs: RecyclerView = findViewById(R.id.rvSongs)

        val songsObj = mutableListOf<songs>()
        songsObj.add(songs("Song1","Description1"))
        songsObj.add(songs("Song2","Description2"))
        songsObj.add(songs("Song3","Description3"))
        songsObj.add(songs("Song4","Description4"))
        songsObj.add(songs("Song5","Description5"))
        songsObj.add(songs("Song6","Description6"))
        songsObj.add(songs("Song7","Description7"))
        songsObj.add(songs("Song8","Description8"))
        songsObj.add(songs("Song9","Description9"))
        songsObj.add(songs("Song10","Description10"))
        songsObj.add(songs("Song11","Description11"))
        songsObj.add(songs("Song12","Description12"))
        songsObj.add(songs("Song13","Description13"))
        songsObj.add(songs("Song14","Description14"))
        songsObj.add(songs("Song15","Description15"))



        rvSongs.adapter = songs_rv_adapter(songsObj)
        rvSongs.layoutManager = LinearLayoutManager(this)






    }
}
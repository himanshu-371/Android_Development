package com.himanshu.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mi_addtodrive -> Toast.makeText(this, "Added to Google Drive", Toast.LENGTH_SHORT).show()
            R.id.mi_favorite -> Toast.makeText(this, "Added to Favorite", Toast.LENGTH_SHORT).show()
            R.id.mi_feedback -> Toast.makeText(this, "Feedback Clicked", Toast.LENGTH_SHORT).show()
            R.id.mi_settings -> Toast.makeText(this, "Settings opened", Toast.LENGTH_SHORT).show()
            R.id.mi_about -> Toast.makeText(this, "About Loading...", Toast.LENGTH_SHORT).show()
        }

        return true
    }


}
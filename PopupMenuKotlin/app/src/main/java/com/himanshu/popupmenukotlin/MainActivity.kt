package com.himanshu.popupmenukotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: AppCompatButton = findViewById(R.id.button)

        button.setOnClickListener { it ->
            val popupMenu = PopupMenu(this, it)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            //option menu click event
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.option1 -> {
                        // Show a Toast message for menu item 1
                        Toast.makeText(this, "Menu Item 1 Clicked", Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }
                    R.id.option2 -> {
                        // Show a Toast message for menu item 2
                        Toast.makeText(this, "Menu Item 2 Clicked", Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }
                    R.id.option3 -> {
                        // Show a Toast message for menu item 2
                        Toast.makeText(this, "Menu Item 3 Clicked", Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }
                    // Add more cases for other menu items as needed
                    else ->
                        return@setOnMenuItemClickListener true
                }
            }
            popupMenu.show()
        }



    }
}
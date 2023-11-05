package com.himanshu.navigationdrawerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.navigationDrawerView)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_SHORT).show()
                R.id.miItem4 -> Toast.makeText(this, "Item 4 Clicked", Toast.LENGTH_SHORT).show()
                R.id.miItem5 -> Toast.makeText(this, "Item 5 Clicked", Toast.LENGTH_SHORT).show()
            }
            true
        }



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}
package com.example.customtoolbarpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar mytoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(mytoolbar);

        //enabling back button
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //setting title and Subtitle
//        getSupportActionBar().setTitle("Whatsapp");
//        getSupportActionBar().setSubtitle("Himanshu");


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int ItemId = item.getItemId();


        if(ItemId==R.id.search){
            Toast.makeText(this, "Search Here", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.newgroup){
            Toast.makeText(this, "Created New Group", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.newbroadcast){
            Toast.makeText(this, "Created New Broadcast", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.linkeddevices){
            Toast.makeText(this, "Link Your Devices here", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.starredmessages){
            Toast.makeText(this, "Starred Messages", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.payments){
            Toast.makeText(this, "Your Payments Here", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.settings){
            Toast.makeText(this, "Settings Opened", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==R.id.camera){
            Toast.makeText(this, "Camera Opened", Toast.LENGTH_SHORT).show();
        }

        if(ItemId==android.R.id.home){
            super.onBackPressed();
        }


        return super.onOptionsItemSelected(item);
    }
}
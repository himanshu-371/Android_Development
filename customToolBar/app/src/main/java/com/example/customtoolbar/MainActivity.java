package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar myToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolBar = findViewById(R.id.myToolBar);

        //step1
        setSupportActionBar(myToolBar);

//        enabling back button
        if(!getSupportActionBar().equals("")){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        //setting Title and SubTitle
        getSupportActionBar().setTitle("CustomToolBar");
        getSupportActionBar().setSubtitle("Subtitle");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflate option menu into toolBar
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int ItemId = item.getItemId();

        if(ItemId == R.id.opt_new){
            Toast.makeText(this, "Created New File", Toast.LENGTH_SHORT).show();
        }

        if(ItemId == R.id.opt_open){
            Toast.makeText(this, "File Opened", Toast.LENGTH_SHORT).show();
        }

        if(ItemId == R.id.opt_save){
            Toast.makeText(this, "File Saved", Toast.LENGTH_SHORT).show();
        }
        else{
            super.onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }





}
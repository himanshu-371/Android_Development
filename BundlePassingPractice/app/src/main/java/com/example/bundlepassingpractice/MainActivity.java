package com.example.bundlepassingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding Ids
        btnNext = findViewById(R.id.btnNext);

        //Intent Passing
        Intent intentNext = new Intent(MainActivity.this, SecondActivity.class);
        intentNext.putExtra("actionBarName", "Android Development");
        intentNext.putExtra("rollNo", 201071);
        intentNext.putExtra("studentName", "Himanshu");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(intentNext);


            }
        });


    }
}
package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtDynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Finding Ids
        txtDynamic = findViewById(R.id.txtDynamic);

        //getting username by bundle passing into username variable
        String username = getIntent().getStringExtra("key_username");

        //setting TextView
        txtDynamic.setText(""+username);

    }
}
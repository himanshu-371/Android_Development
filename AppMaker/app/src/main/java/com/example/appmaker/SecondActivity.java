package com.example.appmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtView = findViewById(R.id.txtView);

        Intent fromMain = getIntent();

        String userName = fromMain.getStringExtra("keyYourName");
        String appName = fromMain.getStringExtra("keyAppName");

        txtView.setText(appName +  " is developed by " + userName);



    }
}
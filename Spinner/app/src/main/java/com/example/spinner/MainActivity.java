package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Spinner myIds;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myIds = findViewById(R.id.myIDs);

        ArrayList<String> IDs = new ArrayList<>();

        IDs.add("Adhaar Card");
        IDs.add("Driving Licence");
        IDs.add("Pan Card");
        IDs.add("10 MarkSheet");
        IDs.add("12th Marksheet");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, IDs);

        myIds.setAdapter(myAdapter);

    }
}
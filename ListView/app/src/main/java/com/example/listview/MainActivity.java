package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.myListView);

        ArrayList<String> arrPlaces = new ArrayList<>();

        arrPlaces.add("Mumbai");
        arrPlaces.add("Delhi");
        arrPlaces.add("Bangalore");
        arrPlaces.add("Hyderabad");
        arrPlaces.add("Ahmedabad");
        arrPlaces.add("Chennai");
        arrPlaces.add("Surat");
        arrPlaces.add("Kolkata");
        arrPlaces.add("Pune");
        arrPlaces.add("Jaipur");
        arrPlaces.add("Lucknow");
        arrPlaces.add("Kanpur");
        arrPlaces.add("Nagpur");
        arrPlaces.add("Indore");
        arrPlaces.add("Bhopal");
        arrPlaces.add("Patna");
        arrPlaces.add("Vadodara");
        arrPlaces.add("Agra");

        ArrayAdapter<String>  myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrPlaces);
        myListView.setAdapter(myAdapter);


    }
}
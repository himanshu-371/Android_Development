package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView myAutoCompleteTextview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding Ids
        myAutoCompleteTextview = findViewById(R.id.myAutoCompleteTextView);

        ArrayList<String> progLanguages = new ArrayList<>();

        progLanguages.add("CPP");
        progLanguages.add("Python");
        progLanguages.add("JAVA");
        progLanguages.add("Kotlin");
        progLanguages.add("JavaScript");
        progLanguages.add("C");
        progLanguages.add("AssemblyLanguage");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, progLanguages);
        myAutoCompleteTextview.setAdapter(myAdapter);
        myAutoCompleteTextview.setThreshold(1);



    }
}
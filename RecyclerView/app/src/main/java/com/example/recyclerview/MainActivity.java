package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerContacts;
    //creating data set


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding RecyclerViewId
        recyclerContacts = findViewById(R.id.recyclerContacts);

        ArrayList<ContactModel> arrContacts= new ArrayList<>();

        //set Layout Manager
        recyclerContacts.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //data set
        ContactModel model = new ContactModel(R.drawable.user, "Ant","9876543210");
        arrContacts.add(model);

        arrContacts.add(new ContactModel(R.drawable.user,"Bat","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Cat","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Dog","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Elephant","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Frog","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Giraffe","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Horse","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Impala","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Jackal","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Kangroo","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Lion","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Monkey","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Newt","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Octopus","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Python","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"QueenBee","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Rhino","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Shark","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Tiger","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Urchin","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Vulture","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Wolf","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Xenops","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Yalk","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.user,"Zebra","9876543210"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(MainActivity.this, arrContacts);
        recyclerContacts.setAdapter(adapter);


    }
}
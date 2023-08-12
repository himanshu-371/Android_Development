package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGames = findViewById(R.id.recyclerViewGames);

        //setting layout Manager
        recyclerViewGames.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        ArrayList<dataModel> arrListGames = new ArrayList<>();

        arrListGames.add(new dataModel(R.drawable.profilepicone,"UserName One", "Player Id one"));
        arrListGames.add(new dataModel(R.drawable.profilepictwo,"UserName Two", "Player Id one"));
        arrListGames.add(new dataModel(R.drawable.profilepicthree,"UserName Three", "Player Id Three"));
        arrListGames.add(new dataModel(R.drawable.profilepicfour,"UserName Four", "Player Id Four"));
        arrListGames.add(new dataModel(R.drawable.profilpicfive,"UserName Five", "Player Id Five"));
        arrListGames.add(new dataModel(R.drawable.profilelicsix,"UserName Six", "Player Id Six"));
        arrListGames.add(new dataModel(R.drawable.profilepicseven,"UserName Seven", "Player Id Seven"));
        arrListGames.add(new dataModel(R.drawable.profilepieight,"UserName Eight", "Player Id Eight"));
        arrListGames.add(new dataModel(R.drawable.profilepicnine,"UserName Nine", "Player Id Nine"));
        arrListGames.add(new dataModel(R.drawable.profilepicone,"UserName Ten", "Player Id Ten"));
        arrListGames.add(new dataModel(R.drawable.profilepictwo,"UserName Eleven", "Player Id Eleven"));
        arrListGames.add(new dataModel(R.drawable.profilepicthree,"UserName Twelve", "Player Id Twelve"));
        arrListGames.add(new dataModel(R.drawable.profilepicfour,"UserName Thirteen", "Player Id Thirteen"));
        arrListGames.add(new dataModel(R.drawable.profilpicfive,"UserName Fourteen", "Player Id Fourteen"));
        arrListGames.add(new dataModel(R.drawable.profilelicsix,"UserName Fifteen", "Player Id Fifteen"));
        arrListGames.add(new dataModel(R.drawable.profilepicseven,"UserName Sixteen", "Player Id Sixteen"));
        arrListGames.add(new dataModel(R.drawable.profilepieight,"UserName Seventeen", "Player Id Seventeen"));
        arrListGames.add(new dataModel(R.drawable.profilepicnine,"UserName Eighteen", "Player Id Eighteen"));
        arrListGames.add(new dataModel(R.drawable.profilepicone,"UserName Nineteen", "Player Id Nineteen"));
        arrListGames.add(new dataModel(R.drawable.profilepictwo,"UserName Twenty", "Player Id Twenty"));
        arrListGames.add(new dataModel(R.drawable.profilepicthree,"UserName TwentyOne", "Player TwentyOne"));
        arrListGames.add(new dataModel(R.drawable.profilepicfour,"UserName TwentyTwo", "Player Id TwentyTwo"));
        arrListGames.add(new dataModel(R.drawable.profilpicfive,"UserName TwentyThree", "Player Id TwentyThree"));
        arrListGames.add(new dataModel(R.drawable.profilelicsix,"UserName TwentyFour", "Player Id TwentyFour"));
        arrListGames.add(new dataModel(R.drawable.profilepicseven,"UserName TwentyFive", "Player Id TwentyFive"));
        arrListGames.add(new dataModel(R.drawable.profilepieight,"UserName TwentySix", "Player Id TwentySix"));
        arrListGames.add(new dataModel(R.drawable.profilepicnine,"UserName TwentySeven", "Player Id TwentySeven"));
        arrListGames.add(new dataModel(R.drawable.profilepicone,"UserName TwentyEight", "Player Id TwentyEight"));
        arrListGames.add(new dataModel(R.drawable.profilepictwo,"UserName TwentyNine", "Player Id TwentyNine"));
        arrListGames.add(new dataModel(R.drawable.profilepicthree,"UserName Thirty", "Player Id Thirty"));
        arrListGames.add(new dataModel(R.drawable.profilepicfour,"UserName ThirtyOne", "Player Id ThirtyOne"));
        arrListGames.add(new dataModel(R.drawable.profilpicfive,"UserName ThirtyTwo", "Player Id ThirtyTwo"));
        arrListGames.add(new dataModel(R.drawable.profilelicsix,"UserName ThirtyThree", "Player Id ThirtyThree"));
        arrListGames.add(new dataModel(R.drawable.profilepicseven,"UserName ThirtyFour", "Player Id ThirtyFour"));
        arrListGames.add(new dataModel(R.drawable.profilepieight,"UserName TwentyFive", "Player Id TwentyFive"));
        arrListGames.add(new dataModel(R.drawable.profilepicnine,"UserName TwentySix", "Player Id TwentySix"));


        customAdapter adapter = new customAdapter(MainActivity.this, arrListGames);
        recyclerViewGames.setAdapter(adapter);




    }
}
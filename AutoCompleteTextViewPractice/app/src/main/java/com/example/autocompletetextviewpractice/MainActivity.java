package com.example.autocompletetextviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView gamesACTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding IDs
        gamesACTV = findViewById(R.id.gamesACTV);

        ArrayList<String> arrListGames = new ArrayList<>();

        arrListGames.add("Among Us");
        arrListGames.add("The Animal Crossing: New Horizons");
        arrListGames.add("Call of Duty: Warzone");
        arrListGames.add("Counter-Strike: Global Offensive");
        arrListGames.add("Dead by Daylight");
        arrListGames.add("Destiny 2");
        arrListGames.add("Fall Guys: Ultimate Knockout");
        arrListGames.add("Fortnite");
        arrListGames.add("Halo Infinite");
        arrListGames.add("GTA 5 Online");
        arrListGames.add("Halo: The Master Chief Collection");
        arrListGames.add("Jackbox Party Pack");
        arrListGames.add("Final Fantasy XIV Online");
        arrListGames.add("Apex Legends");
        arrListGames.add("Left 4 Dead 2");
        arrListGames.add("Mario Kart 8");
        arrListGames.add("Minecraft");
        arrListGames.add("Overcooked! 2");
        arrListGames.add("Phasmophobia");
        arrListGames.add("Phasmophobia");
        arrListGames.add("Rainbow Six: Siege");
        arrListGames.add("Guilty Gear Strive");
        arrListGames.add("Rocket League");
        arrListGames.add("Splitgate");
        arrListGames.add("Sea of Thieves");
        arrListGames.add("Monster Hunter Rise");
        arrListGames.add("Super Smash Bros. Ultimate");
        arrListGames.add("Tetris Effect: Connected");
        arrListGames.add("Valorant");
        arrListGames.add("Stardew Valley");
        arrListGames.add("Death Stranding");
        arrListGames.add("Diablo III");
        arrListGames.add("Dota 2");
        arrListGames.add("Forza Horizon 5");
        arrListGames.add("Mortal Kombat 11");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrListGames);

        gamesACTV.setAdapter(adapter);
        gamesACTV.setThreshold(1);





    }
}
package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView multiplayerGamesListView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Finding IDs
        multiplayerGamesListView = findViewById(R.id.multiplayerGamesListView);
        
        //defining datatype
        ArrayList<String> arrListMultiplayerGames = new ArrayList<>();

        //adding data
        arrListMultiplayerGames.add("Among Us");
        arrListMultiplayerGames.add("The Animal Crossing: New Horizons");
        arrListMultiplayerGames.add("Call of Duty: Warzone");
        arrListMultiplayerGames.add("Counter-Strike: Global Offensive");
        arrListMultiplayerGames.add("Dead by Daylight");
        arrListMultiplayerGames.add("Destiny 2");
        arrListMultiplayerGames.add("Fall Guys: Ultimate Knockout");
        arrListMultiplayerGames.add("Fortnite");
        arrListMultiplayerGames.add("Halo Infinite");
        arrListMultiplayerGames.add("GTA 5 Online");
        arrListMultiplayerGames.add("Halo: The Master Chief Collection");
        arrListMultiplayerGames.add("Jackbox Party Pack");
        arrListMultiplayerGames.add("Final Fantasy XIV Online");
        arrListMultiplayerGames.add("Apex Legends");
        arrListMultiplayerGames.add("Left 4 Dead 2");
        arrListMultiplayerGames.add("Mario Kart 8");
        arrListMultiplayerGames.add("Minecraft");
        arrListMultiplayerGames.add("Overcooked! 2");
        arrListMultiplayerGames.add("Phasmophobia");
        arrListMultiplayerGames.add("Phasmophobia");
        arrListMultiplayerGames.add("Rainbow Six: Siege");
        arrListMultiplayerGames.add("Guilty Gear Strive");
        arrListMultiplayerGames.add("Rocket League");
        arrListMultiplayerGames.add("Splitgate");
        arrListMultiplayerGames.add("Sea of Thieves");
        arrListMultiplayerGames.add("Monster Hunter Rise");
        arrListMultiplayerGames.add("Super Smash Bros. Ultimate");
        arrListMultiplayerGames.add("Tetris Effect: Connected");
        arrListMultiplayerGames.add("Valorant");
        arrListMultiplayerGames.add("Stardew Valley");
        arrListMultiplayerGames.add("Death Stranding");
        arrListMultiplayerGames.add("Diablo III");
        arrListMultiplayerGames.add("Dota 2");
        arrListMultiplayerGames.add("Forza Horizon 5");
        arrListMultiplayerGames.add("Mortal Kombat 11");

        //adapter
        ArrayAdapter<String> my_adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrListMultiplayerGames);
        multiplayerGamesListView.setAdapter(my_adapter);

        
    }
}
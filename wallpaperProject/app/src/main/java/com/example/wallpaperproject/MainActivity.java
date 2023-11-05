package com.example.wallpaperproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ImageModel> modelClassList;
    private RecyclerView recyclerView;
    Adapter adapter;
    CardView anime, cars, trending, animals, nature;
    EditText estSearch;
    ImageView imgsearch;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //removing action bar
        getSupportActionBar().hide();

        //removing status bar
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.recyclerView);
        nature = findViewById(R.id.nature);
        anime = findViewById(R.id.anime);
        cars = findViewById(R.id.cars);
        trending = findViewById(R.id.trending);
        estSearch = findViewById(R.id.edtSearch);
        imgsearch = findViewById(R.id.imgsearch);


        modelClassList = new ArrayList<>();
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(getApplicationContext(),modelClassList);
        recyclerView.setAdapter(adapter);
        findphotos();
        

        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "nature";
                getsearchimage(query);
            }
        });

        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "cars";
                getsearchimage(query);
            }
        });


        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "anime";
                getsearchimage(query);
            }
        });

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String query = "trending";
               getsearchimage(query);
            }
        });

        estSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query=estSearch.getText().toString().trim().toLowerCase();
                if(query.isEmpty()){
                    Toast.makeText(MainActivity.this, "enter something", Toast.LENGTH_SHORT).show();
                }else{
                    getsearchimage(query);
                }
            }
        });




    }

    private void getsearchimage(String query) {
        ApiUtilities.getApiInterface().getSearchImage(query, 1,80).enqueue(new Callback<SearchModel>() {
            @Override
            public void onResponse(Call<SearchModel> call, Response<SearchModel> response) {
                modelClassList.clear();
                if(response.isSuccessful()){
                    modelClassList.addAll(response.body().getPhotos());
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(MainActivity.this, "not found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SearchModel> call, Throwable t) {

            }
        });

    }

    private void findphotos() {

        ApiUtilities.getApiInterface().getImage(1,80).enqueue(new Callback<SearchModel>() {
            @Override
            public void onResponse(Call<SearchModel> call, Response<SearchModel> response) {
                if(response.isSuccessful()){
                    modelClassList.addAll(response.body().getPhotos());
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(MainActivity.this, "not found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SearchModel> call, Throwable t) {

            }
        });
    }
}
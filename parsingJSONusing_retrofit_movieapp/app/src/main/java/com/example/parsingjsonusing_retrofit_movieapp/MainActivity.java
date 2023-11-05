package com.example.parsingjsonusing_retrofit_movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<movieDataModelClass> moviesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instance of movie api interface
        movieAPI_Interface movieAPI_interface = retrofit.create(movieAPI_Interface.class);
        Call<ArrayList<movieDataModelClass>> call = movieAPI_interface.getMovieData();

        call.enqueue(new Callback<ArrayList<movieDataModelClass>>() {
            @Override
            public void onResponse(Call<ArrayList<movieDataModelClass>> call, Response<ArrayList<movieDataModelClass>> response) {
                if (response.code() != 200){
                    //handle thr err & display it.
                    return;
                }

                ArrayList<movieDataModelClass> movieData = response.body();

                //for-each loop
                for(movieDataModelClass movie : movieData){
                    moviesList.add(movie);
                }

                recyclerViewAdapter recyclerViewAdapter = new recyclerViewAdapter(MainActivity.this, moviesList);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(recyclerViewAdapter);

            }

            @Override
            public void onFailure(Call<ArrayList<movieDataModelClass>> call, Throwable t) {

            }
        });


    }

}
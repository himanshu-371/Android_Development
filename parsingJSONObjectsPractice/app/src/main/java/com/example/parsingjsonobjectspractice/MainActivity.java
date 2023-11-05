package com.example.parsingjsonobjectspractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataModel> jsonDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        JSONApi_Interface jsonApi_interface = retrofit.create(JSONApi_Interface.class);
        Call<List<DataModel>> call = jsonApi_interface.getJSONData();

        call.enqueue(new Callback<List<DataModel>>() {
            @Override
            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {
                List<DataModel> getJSonDataList = response.body();
//                Log.d("DATA",""+getJSonDataList);
//                Toast.makeText(MainActivity.this, ""+getJSonDataList, Toast.LENGTH_SHORT).show();

                //setting list into recyclerView
                for( DataModel jsondatalist : getJSonDataList) {
                    jsonDataList.add(jsondatalist);
                }

                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView_Adapter adapter = new recyclerView_Adapter(MainActivity.this,jsonDataList);
                recyclerView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<List<DataModel>> call, Throwable t) {

            }
        });






    }
}
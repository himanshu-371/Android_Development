package com.example.retrofitsimplejson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //Retrofit Builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instance for interface
        retrofitAPI_Interface retrofitAPI_interface = retrofit.create(retrofitAPI_Interface.class);
        Call<retrofit_dataModelClass> call = retrofitAPI_interface.getJSonData();

        call.enqueue(new Callback<retrofit_dataModelClass>() {
            @Override
            public void onResponse(Call<retrofit_dataModelClass> call, Response<retrofit_dataModelClass> response) {

                //checking for response
                if(response.code()!=200){
                    textView.setText("check connection");
                    return;
                }

                //get the data into textView

                String myjsondata = "";

                myjsondata = "\n 1.  ID = " + response.body().getUserId()+
                             "\n 2.  UserID = " +response.body().getId()+
                             "\n 3.  Title = " +response.body().getTitle()+
                             "\n 4.  course status\n      completed = " +response.body().isCoursecompleted();

                textView.setText(myjsondata);

                
            }

            @Override
            public void onFailure(Call<retrofit_dataModelClass> call, Throwable t) {

            }
        });









    }
}
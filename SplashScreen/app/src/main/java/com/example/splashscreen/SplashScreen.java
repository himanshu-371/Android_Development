package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent iHome = new Intent(SplashScreen.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //to start Intent Passing
                startActivity(iHome);

                //to finish the splash screen
                //and prevent it from thus showing again when we press back button
                finish();
            }
        }, 3000);



        //to hide Default Action Bar
        getSupportActionBar().hide();




    }
}
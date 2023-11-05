package com.example.wallpaperproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.Toast;


import com.bumptech.glide.Glide;

import java.io.IOException;

public class setWallpaper_activity extends AppCompatActivity {

//    2kAvRqmUdorJBsw3LS0AtClEgTPxh5JPcrGNI9UDw4nXiDai6mxsbK4S

    Intent intent;
    ImageView imageView;
    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);

        getSupportActionBar().hide();

        final WallpaperManager wm = WallpaperManager.getInstance(getApplicationContext());

        btn = findViewById(R.id.set);
        imageView = findViewById(R.id.setImage);

        intent = getIntent();

        String url = intent.getStringExtra("image");
        Glide.with(getApplicationContext()).load(url).into(imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getBaseContext();
                Bitmap bitmap  =  ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                try {
                    context.setWallpaper(bitmap);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Toast.makeText(setWallpaper_activity.this, "done", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
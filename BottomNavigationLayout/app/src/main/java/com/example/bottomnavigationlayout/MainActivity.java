package com.example.bottomnavigationlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding IDs
        bnView = findViewById(R.id.bnView);

//        bnView.setSelectedItemId(R.id.helpdesk); //to set a selected particular item
//        loadFrag(new HelpdeskFragment(),true);

        //setOnItemSelectedListener
        bnView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.home){
                    loadFrag(new HomeFragment(), false);
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    
                } else if (id==R.id.photos) {
                    loadFrag(new PhotosFragment(), false);
                    Toast.makeText(MainActivity.this, "Photos", Toast.LENGTH_SHORT).show();

                } else if (id==R.id.settings) {
                    loadFrag(new SettingsFragment(), false);
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();

                } else if (id==R.id.camera) {
                    loadFrag(new CameraFragment(), false);
                    Toast.makeText(MainActivity.this, "Camera", Toast.LENGTH_SHORT).show();

                } else{ //helpdesk
                    loadFrag(new HelpdeskFragment(), true);
                    Toast.makeText(MainActivity.this, "Helpdesk", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });


    }

    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag){
            ft.add(R.id.container, fragment);
        }
        else{
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }


}
package com.example.bottomnavigationlayoutpractice;

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

import Fragments.I1_Fragment;
import Fragments.I2_ragment;
import Fragments.I3_Fragment;
import Fragments.I4_Fragment;
import Fragments.I5_Fragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
        bnView = findViewById(R.id.bnView);

        loadFrag(new I1_Fragment(), 0);

        bnView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.item1){
                    Toast.makeText(MainActivity.this, "I1", Toast.LENGTH_SHORT).show();
                   loadFrag(new I1_Fragment(), 1);
                } else if(id==R.id.item2){
                    Toast.makeText(MainActivity.this, "I2", Toast.LENGTH_SHORT).show();
                    loadFrag(new I2_ragment(), 1);
                } else if(id==R.id.item3){
                    Toast.makeText(MainActivity.this, "I3", Toast.LENGTH_SHORT).show();
                    loadFrag(new I3_Fragment(), 1);
                } else if(id==R.id.item4){
                    Toast.makeText(MainActivity.this, "I4", Toast.LENGTH_SHORT).show();
                    loadFrag(new I4_Fragment(), 1);
                } else{
                    Toast.makeText(MainActivity.this, "I5", Toast.LENGTH_SHORT).show();
                    loadFrag(new I5_Fragment(), 1);
                }

                return true;
            }
        });


    }
    public void loadFrag(Fragment fragment, int x){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(x==0){
            ft.add(R.id.container,fragment);
        } else{
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }


}
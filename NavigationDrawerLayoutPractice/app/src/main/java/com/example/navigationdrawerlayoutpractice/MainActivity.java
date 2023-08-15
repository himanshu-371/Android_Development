package com.example.navigationdrawerlayoutpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import Fragments.Item_1_Fragment;
import Fragments.Item_2_Fragment;
import Fragments.Item_3_Fragment;
import Fragments.Item_4_Fragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    NavigationView navView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        navView = findViewById(R.id.navView);
        drawerLayout = findViewById(R.id.drawerLayout);

        //setting toolbar
        setSupportActionBar(toolbar);

        //ActionBarDrawerToggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OPEN_DRAWER,R.string.CLOSE_DRAWER);
        toggle.syncState();

        //default frag
        loadFragment(new Item_1_Fragment(), true);


        //setNavigationItemSelectedListener
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if(id==R.id.item1){
                    loadFragment(new Item_1_Fragment(), false);
                } else if(id==R.id.item2){
                    loadFragment(new Item_2_Fragment(), false);
                } else if(id==R.id.item3){
                    loadFragment(new Item_3_Fragment(), false);
                }else{
                    loadFragment(new Item_4_Fragment(), false);
                }

                //to close drawer when menu item is clicked
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });


    }

    //onBackPressed
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }


    public void loadFragment(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag){
            ft.add(R.id.container, fragment);
        }else{
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }


}
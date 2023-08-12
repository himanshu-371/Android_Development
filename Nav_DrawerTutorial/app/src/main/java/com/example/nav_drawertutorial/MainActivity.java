package com.example.nav_drawertutorial;

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
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar); //setting up toolbar

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        loadFragments(new HomeFragment(), true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.readMe){
                    loadFragments(new ReadMeFragment(),false);
                    Toast.makeText(MainActivity.this, "readme", Toast.LENGTH_SHORT).show();
                } else if (id==R.id.home) {
                    loadFragments(new HomeFragment(), false);
                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                }else{
                    loadFragments(new SettingsFragment(), false);
                    Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                }

                //to close drawer when menu item is clicked
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });



    }

    @Override
    public void onBackPressed() {
       if(drawerLayout.isDrawerOpen(GravityCompat.START)){
           drawerLayout.closeDrawer(GravityCompat.START);
       }else{
           super.onBackPressed();
       }
    }



    public void loadFragments(Fragment fragment, boolean flag) {

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
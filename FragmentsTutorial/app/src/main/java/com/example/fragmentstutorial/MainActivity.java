package com.example.fragmentstutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnFragA, btnFragB, btnFragC;
    FrameLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        //Default Fragment
        loadFragment(new A_Fragment(), 0);

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new A_Fragment(),1);

            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new B_Fragment(), 1);

            }
        });

        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment( new C_Fragment(), 1);

            }
        });

    }

    public void loadFragment(Fragment fragment , int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag==0){
            ft.add(R.id.container, fragment);
        } else{
            ft.replace(R.id.container, fragment);
        }


        ft.commit();
    }


}
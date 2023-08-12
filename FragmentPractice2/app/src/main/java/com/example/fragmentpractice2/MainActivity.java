package com.example.fragmentpractice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import Fragments.A_Fragment;
import Fragments.B_Fragment;
import Fragments.C_Fragment;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn_frag1, btn_frag2, btn_frag3;
    FrameLayout fl_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn_frag1 = findViewById(R.id.btn_frag1);
        btn_frag2 = findViewById(R.id.btn_frag2);
        btn_frag3 = findViewById(R.id.btn_frag3);

        loadFragment(new A_Fragment(), 0);

        btn_frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new A_Fragment(), 1);
            }
        });

        btn_frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new B_Fragment(), 1);
            }
        });

        btn_frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new C_Fragment(), 1);
            }
        });


    }


    public void loadFragment(Fragment fragment, int flag ){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if(flag==0){
            ft.add(R.id.fl_container, fragment);
        }else{
            ft.replace(R.id.fl_container, fragment);
        }

        ft.commit();
    }


}
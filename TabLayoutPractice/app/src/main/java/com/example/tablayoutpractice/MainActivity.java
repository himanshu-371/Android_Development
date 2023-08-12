package com.example.tablayoutpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding IDs
        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        //Setting View Pager Adapter
        viewPagerAdpater adpater = new viewPagerAdpater(getSupportFragmentManager());
        viewPager.setAdapter(adpater);

        tab.setupWithViewPager(viewPager);


    }
}
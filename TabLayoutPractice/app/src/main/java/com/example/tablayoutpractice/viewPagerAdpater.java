package com.example.tablayoutpractice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import Fragments.A_Fragment;
import Fragments.B_Fragment;
import Fragments.C_Fragment;

public class viewPagerAdpater extends FragmentPagerAdapter {
    public viewPagerAdpater(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new A_Fragment();
        }else if(position==1){
            return new B_Fragment();
        }else{
            return new C_Fragment();
        }
    }

    @Override
    public int getCount() {
        //no. of tabs
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Chats";
        }else if(position==1){
            return "Status";
        }else{
            return "calls";
        }
    }
}
package com.example.mobileadapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm){
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return FragFirst.newInstance();
            case 1:
                return FragSecond.newInstance();
            case 2:
                return FragThird.newInstance();

            default :
                return null;
        }
    }



    @Override
    public int getCount() {
        return 3;
    }
}

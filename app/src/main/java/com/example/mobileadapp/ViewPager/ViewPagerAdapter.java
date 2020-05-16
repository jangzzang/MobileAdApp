package com.example.mobileadapp.ViewPager;

import com.example.mobileadapp.ViewPager.FragFirst;
import com.example.mobileadapp.ViewPager.FragSecond;
import com.example.mobileadapp.ViewPager.FragThird;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

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

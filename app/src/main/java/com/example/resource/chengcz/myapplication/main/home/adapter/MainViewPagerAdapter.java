package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.resource.chengcz.myapplication.main.home.page.HomeBoldLineFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeCircleFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeColorFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeCornerRectangleFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeLineFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeSquareFragment;
import com.example.resource.chengcz.myapplication.main.home.page.HomeTextFragment;

/**
 * Created by chengcz on 2016/4/14.
 */
public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeColorFragment();
            case 1:
                return new HomeTextFragment();
            case 2:
                return new HomeLineFragment();
            case 3:
                return new HomeBoldLineFragment();
            case 4:
                return new HomeSquareFragment();
            case 5:
                return new HomeCircleFragment();
            case 6:
                return new HomeCornerRectangleFragment();
        }
        return null;
    }


}

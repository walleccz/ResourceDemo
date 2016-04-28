package com.example.resource.chengcz.myapplication.main.home.page;

import com.example.resource.chengcz.myapplication.main.home.adapter.ColorAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeColorFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new ColorAdapter(0, getActivity()));
        super.initData();
    }
}

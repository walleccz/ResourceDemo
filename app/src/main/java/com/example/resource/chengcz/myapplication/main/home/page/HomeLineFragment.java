package com.example.resource.chengcz.myapplication.main.home.page;

import com.example.resource.chengcz.myapplication.main.home.adapter.LineAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeLineFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new LineAdapter(300, getActivity()));
        super.initData();
    }
}

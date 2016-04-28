package com.example.resource.chengcz.myapplication.main.home.page;

import com.example.resource.chengcz.myapplication.main.home.adapter.SquareAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeSquareFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new SquareAdapter(0, getActivity()));
        super.initData();
    }
}

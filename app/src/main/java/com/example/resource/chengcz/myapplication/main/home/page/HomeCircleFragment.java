package com.example.resource.chengcz.myapplication.main.home.page;

import com.example.resource.chengcz.myapplication.main.home.adapter.CircleAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeCircleFragment extends HomeBaseFragment {

    @Override
    public void initData() {
        contentView.setAdapter(new CircleAdapter(0, getActivity()));
        super.initData();
    }
}

package com.example.resource.chengcz.myapplication.main.home.page;

import com.example.resource.chengcz.myapplication.main.home.adapter.BoldLineAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeBoldLineFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new BoldLineAdapter(30, getActivity()));
        super.initData();
    }
}

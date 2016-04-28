package com.example.resource.chengcz.myapplication.main.home.page;

import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.adapter.TextAdapter;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeTextFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new TextAdapter(30, getActivity()));
        super.initData();
    }
}

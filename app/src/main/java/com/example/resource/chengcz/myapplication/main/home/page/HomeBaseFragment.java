package com.example.resource.chengcz.myapplication.main.home.page;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.HomeMainTabCilcklistener;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeBaseFragment extends Fragment implements HomeMainTabCilcklistener {
    protected View rootView;
    protected RecyclerView contentView;
    protected boolean isLoadData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.home_item_fragment, container, false);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        contentView = (RecyclerView) rootView.findViewById(R.id.home_text_size_content);
        contentView.setLayoutManager(new LinearLayoutManager(getContext()));
        if (getUserVisibleHint()) {
            initData();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && !isLoadData && contentView != null) {
            initData();
        }
    }

    public void initData() {
        isLoadData = true;
    }

    @Override
    public void onTabClick() {

    }
}

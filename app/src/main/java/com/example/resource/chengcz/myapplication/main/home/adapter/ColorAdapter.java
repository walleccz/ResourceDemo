package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;
import com.example.resource.chengcz.myapplication.util.CommonUtility;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/18.
 */
public class ColorAdapter extends BaseRecycleAdapter {

    public ColorAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        Resources res = mActivity.getResources();
        TypedArray colors = res.obtainTypedArray(R.array.color_array);
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        for (int i = 0; i < colors.length(); i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setValues(colors.getColor(i, 0));
            list.add(info1);
        }
        colors.recycle();
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        viewHolder.title.setText("c" + (position + 1));
        viewHolder.content.setBackgroundColor((int)mList.get(position).getValues());
        viewHolder.content.setWidth(CommonUtility.dip2px(mActivity, 20));
        viewHolder.content.setHeight(CommonUtility.dip2px(mActivity, 20));
    }
}

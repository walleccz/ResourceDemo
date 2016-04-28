package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;
import com.example.resource.chengcz.myapplication.util.CommonUtility;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/18.
 */
public class CircleAdapter extends BaseRecycleAdapter {

    public CircleAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        Resources res = mActivity.getResources();
        int[] diameters = res.getIntArray(R.array.circle_diameter_array);
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        for (int i = 0; i < diameters.length; i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setValues(diameters[i]);
            list.add(info1);
        }
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        viewHolder.title.setText((int)mList.get(position).getValues() + "dp");
        viewHolder.content.setBackgroundResource(R.drawable.shape_circle);
        viewHolder.content.setHeight(CommonUtility.dip2px(mActivity, mList.get(position).getValues()));
        viewHolder.content.setWidth(CommonUtility.dip2px(mActivity, mList.get(position).getValues()));
    }
}

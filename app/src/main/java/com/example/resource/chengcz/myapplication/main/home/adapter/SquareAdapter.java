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
public class SquareAdapter extends BaseRecycleAdapter {

    public SquareAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        Resources res = mActivity.getResources();
        int[] widths = res.getIntArray(R.array.square_width_array);
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        for (int i = 0; i < widths.length; i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setValues(widths[i]);
            list.add(info1);
        }
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        viewHolder.title.setText((int)mList.get(position).getValues() + "dp");
        viewHolder.content.setBackgroundColor(mActivity.getResources().getColor(R.color.colorBlack));
        viewHolder.content.setWidth(CommonUtility.dip2px(mActivity,mList.get(position).getValues()));
        viewHolder.content.setHeight(CommonUtility.dip2px(mActivity,mList.get(position).getValues()));
    }
}

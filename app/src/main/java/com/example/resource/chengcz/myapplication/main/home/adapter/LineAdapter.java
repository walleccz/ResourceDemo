package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;
import com.example.resource.chengcz.myapplication.util.CommonUtility;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/18.
 */
public class LineAdapter extends BaseRecycleAdapter {

    public LineAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        int lineCount =mActivity.getResources().getInteger(R.integer.line_length);
        for (int i = 0; i < lineCount; i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setValues(i);
            list.add(info1);
        }
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        viewHolder.title.setText((int)mList.get(position).getValues() + "dp");
        viewHolder.content.setBackgroundResource(R.color.colorBlack);
        viewHolder.content.setWidth(CommonUtility.dip2px(mActivity, mList.get(position).getValues()));
        viewHolder.content.setHeight(CommonUtility.dip2px(mActivity, 1));
    }
}

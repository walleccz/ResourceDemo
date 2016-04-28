package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.LinearLayout;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;
import com.example.resource.chengcz.myapplication.util.CommonUtility;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/15.
 */
public class BoldLineAdapter extends BaseRecycleAdapter {

    public BoldLineAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        Resources res = mActivity.getResources();
        TypedArray lines = res.obtainTypedArray(R.array.bold_line_height_array);
        String[] titles = res.getStringArray(R.array.bold_line_title_array);
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        for (int i = 0; i < lines.length(); i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setTitle(titles[i]);
            info1.setValues(lines.getDimension(i, 0));
            list.add(info1);
        }
        lines.recycle();
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        viewHolder.title.setText(mList.get(position).getTitle());
        viewHolder.content.setBackgroundResource(R.color.colorBlack);
        viewHolder.content.setWidth(mActivity.getResources().getDimensionPixelSize(R.dimen.bold_line_width));
        viewHolder.content.setHeight(CommonUtility.dip2px(mActivity, mList.get(position).getValues()));
    }
}

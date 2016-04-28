package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/15.
 */
public class TextAdapter extends BaseRecycleAdapter {

    public TextAdapter(int count, Activity activity) {
        super(count, activity);
    }

    @Override
    public ArrayList<BaseRecyclerViewItemInfo> getItemList(int count) {
        ArrayList<BaseRecyclerViewItemInfo> list = new ArrayList<BaseRecyclerViewItemInfo>();
        int maxSize = mActivity.getResources().getInteger(R.integer.text_max_size);
        for (int i = 1; i <= maxSize; i++) {
            BaseRecyclerViewItemInfo info1 = new BaseRecyclerViewItemInfo();
            info1.setValues(i);
            BaseRecyclerViewItemInfo info2 = new BaseRecyclerViewItemInfo();
            info2.setValues(i);
            list.add(info1);
            list.add(info2);
        }
        return list;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseRecycleItemViewHolder viewHolder = (BaseRecycleItemViewHolder) holder;
        ((LinearLayout) viewHolder.itemView).setOrientation(LinearLayout.VERTICAL);
        boolean isNormal = position % 2 == 0 ? true : false;
        viewHolder.title.setVisibility(View.GONE);
        viewHolder.content.setTypeface(isNormal ? Typeface.DEFAULT : Typeface.DEFAULT_BOLD);
        viewHolder.content.setTextSize(TypedValue.COMPLEX_UNIT_SP, mList.get(position).getValues());
        viewHolder.content.setText(String.format(mActivity.getString(isNormal ? R.string.text_normal_tips : R.string.text_bold_tips), (int) mList.get(position).getValues()));
    }
}

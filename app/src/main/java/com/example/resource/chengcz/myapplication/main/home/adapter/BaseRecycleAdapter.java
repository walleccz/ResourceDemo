package com.example.resource.chengcz.myapplication.main.home.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.other.BaseRecyclerViewItemInfo;

import java.util.ArrayList;

/**
 * Created by chengcz on 2016/4/15.
 */
public abstract class BaseRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected ArrayList<? extends BaseRecyclerViewItemInfo> mList = new ArrayList<>();
    protected Activity mActivity;

    public BaseRecycleAdapter(int count, Activity activity) {
        this.mActivity = activity;
        setData(count);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.home_recycle_item, parent, false);
        RecyclerView.ViewHolder holder = new BaseRecycleItemViewHolder(view);
        return holder;
    }
    public void setData(int count) {
        this.mList = getItemList(count);
    }

    public abstract ArrayList<BaseRecyclerViewItemInfo> getItemList(int count);

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class BaseRecycleItemViewHolder extends RecyclerView.ViewHolder {
        public TextView title, content;

        public BaseRecycleItemViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.item_title);
            content = (TextView) itemView.findViewById(R.id.item_content);
        }
    }
}

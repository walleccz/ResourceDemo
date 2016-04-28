package com.example.resource.chengcz.myapplication.util;

import android.content.Context;

/**
 * Created by chengcz on 2016/4/14.
 */
public class CommonUtility {
    public static int dip2px(Context context, float dipValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}

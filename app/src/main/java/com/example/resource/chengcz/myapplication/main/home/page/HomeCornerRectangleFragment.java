package com.example.resource.chengcz.myapplication.main.home.page;

import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.resource.chengcz.myapplication.R;
import com.example.resource.chengcz.myapplication.main.home.adapter.CornerRectangleAdapter;
import com.example.resource.chengcz.myapplication.util.CommonUtility;

/**
 * Created by chengcz on 2016/4/14.
 */
public class HomeCornerRectangleFragment extends HomeBaseFragment {
    @Override
    public void initData() {
        contentView.setAdapter(new CornerRectangleAdapter(0, getActivity()));
        super.initData();
    }

    private void createItem(int[] widths, int width) {
        TextView textView = new TextView(getContext());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 9);
        textView.setTextColor(getResources().getColor(R.color.standard_color_c14));
        textView.setText("方形长宽为:" + width + "dp");
        textView.setSingleLine(true);
        textView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams layoutParam = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParam.setMargins(0, CommonUtility.dip2px(getContext(), 2), 0, CommonUtility.dip2px(getContext(), 2));
        textView.setLayoutParams(layoutParam);

        TextView textViewDivider = new TextView(getContext());
        textViewDivider.setTextSize(TypedValue.COMPLEX_UNIT_SP, 9);
        textViewDivider.setBackgroundResource(R.color.standard_color_c14);
        LinearLayout.LayoutParams layoutParamDivider = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, CommonUtility.dip2px(getContext(), 1));
        layoutParamDivider.setMargins(0, CommonUtility.dip2px(getContext(), 2), 0, CommonUtility.dip2px(getContext(), 5));
        textViewDivider.setLayoutParams(layoutParamDivider);
        contentView.addView(textView);
        contentView.addView(textViewDivider);
        for (int i = 0; i < widths.length; i++) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.setGravity(Gravity.CENTER_VERTICAL);
            LinearLayout.LayoutParams layoutParam2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParam2.setMargins(0, CommonUtility.dip2px(getContext(), 2), CommonUtility.dip2px(getContext(), 2), CommonUtility.dip2px(getContext(), 2));
            linearLayout.setLayoutParams(layoutParam2);

            TextView textView1 = new TextView(getContext());
            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 9);
            textView1.setTextColor(getResources().getColor(R.color.colorBlack));
            textView1.setText(widths[i] + "dp");
            textView1.setSingleLine(true);
            textView1.setGravity(Gravity.CENTER);
            LinearLayout.LayoutParams layoutParam1 = new LinearLayout.LayoutParams(CommonUtility.dip2px(getContext(), 30), ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParam1.setMargins(0, CommonUtility.dip2px(getContext(), 2), CommonUtility.dip2px(getContext(), 2), CommonUtility.dip2px(getContext(), 2));
            textView1.setLayoutParams(layoutParam1);

            TextView textView2 = new TextView(getContext());
            textView2.setGravity(Gravity.CENTER);
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 9);
            textView2.setTextColor(getResources().getColor(R.color.colorWhite));
            textView2.setHeight(CommonUtility.dip2px(getContext(), width));
            textView2.setWidth(CommonUtility.dip2px(getContext(), width));

            //GradientDrawable myGrad = (GradientDrawable) textView2.getBackground();
            //myGrad.setCornerRadius(CommonUtility.dip2px(getContext(), widths[i]));
            //myGrad.setColor(getResources().getColor(R.color.colorBlue));

            //GradientDrawable shapeDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.shape_rectangle);
            //shapeDrawable.setCornerRadius(CommonUtility.dip2px(getContext(), widths[i]));
            GradientDrawable shapeDrawable = new GradientDrawable();
            shapeDrawable.setColor(getResources().getColor(R.color.colorBlack));
            shapeDrawable.setCornerRadius(CommonUtility.dip2px(getContext(), widths[i]));
            textView2.setBackgroundDrawable(shapeDrawable);

            linearLayout.addView(textView1);
            linearLayout.addView(textView2);
            contentView.addView(linearLayout);
        }
    }
}

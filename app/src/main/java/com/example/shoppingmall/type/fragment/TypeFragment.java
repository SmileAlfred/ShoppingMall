package com.example.shoppingmall.type.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.shoppingmall.base.BaseFragment;

import static android.content.ContentValues.TAG;

/**
 * 作者：尚硅谷-杨光福 on 2016/11/14 11:07
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：分类的Fragment
 */
public class TypeFragment extends BaseFragment {
    private TextView textView;

    @Override
    public View initView() {
        Log.e(TAG,"分类的Fragment的UI被初始化了");
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG,"分类的Fragment的数据被初始化了");
        textView.setText("分类内容");
    }
}

package com.example.shoppingmall.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 作者：尚硅谷-杨光福 on 2016/11/14 10:59
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：基类Fragemnt
 * 首页：ShoppingCartFragment
 * 分类：UserFragment
 * 发现：CommunityFragment
 * 购物车：ShoppingCartFragment
 * 用户中心：UserFragemnt
 * 等等都要继承该类
 */
public abstract class BaseFragment extends Fragment {

    protected Context mContext;

    /**
     * 当该类被系统创建的时候；被回调
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }

    /**
     * 抽象类，由孩子实现，实现不同的效果
     * @return
     */
    public abstract View initView() ;

    /**
     * 当Activity被创建了的时候回调这个方法
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 当子类需要联网请求数据的时候，可以重写该方法，在该方法中联网请求
     */
    public void initData() {

    }
}

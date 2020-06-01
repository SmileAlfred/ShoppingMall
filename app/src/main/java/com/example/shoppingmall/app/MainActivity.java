package com.example.shoppingmall.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.shoppingmall.R;
import com.example.shoppingmall.base.BaseFragment;
import com.example.shoppingmall.community.fragment.CommunityFragment;
import com.example.shoppingmall.home.fragment.HomeFragment;
import com.example.shoppingmall.shoppingcart.fragment.ShoppingCartFragment;
import com.example.shoppingmall.type.fragment.TypeFragment;
import com.example.shoppingmall.user.fragment.UserFragment;

import java.util.ArrayList;

//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//import butterknife.internal.ListenerMethod;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    FrameLayout frameLayout;
    RadioGroup rgMain;

    /**
     * 装多个Fragment的实例集合
     */
    private ArrayList<BaseFragment> fragments;

    private int position = 0;
    /**
     * 缓存的Fragemnt或者上次显示的Fragment
     */
    private Fragment tempFragemnt;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        rgMain = findViewById(R.id.rg_main);

        frameLayout.setOnClickListener(this);
        rgMain.setOnClickListener(this);

        //ButterKnife和当前Activity绑定
        //ButterKnife.bind(MainActivity.this);
        /**
         * 初始化Fragment
         */
        initFragment();
        //设置RadioGroup的监听
        initListener();
    }

    private void initListener() {

        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_type://分类
                        position = 1;
                        break;
                    case R.id.rb_community://发现
                        position = 2;
                        break;
                    case R.id.rb_cart://购物车
                        position = 3;
                        break;
                    case R.id.rb_user://用户中心
                        position = 4;
                        break;
                    case R.id.rb_home://主页
                    default:
                        position = 0;
                        break;
                }

                //根据位置取不同的Fragment
                BaseFragment baseFragment = getFragment(position);

                /**
                 * 第一参数：上次显示的Fragment
                 * 第二参数：当前正要显示的Fragment
                 */
                switchFragment(tempFragemnt, baseFragment);
            }
        });
        rgMain.check(R.id.rb_home);
    }

    /**
     * 添加的时候要按照顺序
     */
    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new TypeFragment());
        fragments.add(new CommunityFragment());
        fragments.add(new ShoppingCartFragment());
        fragments.add(new UserFragment());
    }

    private BaseFragment getFragment(int position) {
        if (fragments != null && fragments.size() > 0) {
            BaseFragment baseFragment = fragments.get(position);
            Log.e(TAG, "getFragment: " + position);
            return baseFragment;
        }
        return null;
    }

    /**
     * 切换Fragment
     *
     * @param fromFragment
     * @param nextFragment
     */
    private void switchFragment(Fragment fromFragment, BaseFragment nextFragment) {
        if (tempFragemnt != nextFragment) {
            tempFragemnt = nextFragment;
            if (nextFragment != null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //判断nextFragment是否添加
                if (!nextFragment.isAdded()) {
                    //隐藏当前Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    //添加Fragment
                    transaction.add(R.id.frameLayout, nextFragment).commit();
                } else {
                    //隐藏当前Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(nextFragment).commit();
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.frameLayout:
                break;
            case R.id.rg_main:
                break;
        }
    }
}

package com.example.user.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Types.BoomType;
import com.nightonke.boommenu.Types.ButtonType;
import com.nightonke.boommenu.Types.PlaceType;


public class MainActivity extends FragmentActivity {
    BoomMenuButton boomMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_bottom);
        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        //1
        tabHost.addTab(tabHost.newTabSpec("Apple")
                        .setIndicator("Apple"),
                com.example.user.fragmenttest.AFragment.class,
                null);
        //2
        tabHost.addTab(tabHost.newTabSpec("Google")
                        .setIndicator("Google"),
                com.example.user.fragmenttest.BFragment.class,
                null);
        //3
        tabHost.addTab(tabHost.newTabSpec("Facebook")
                        .setIndicator("Facebook"),
                com.example.user.fragmenttest.CFragment.class,
                null);
        boomMenuButton = (BoomMenuButton)findViewById(R.id.boom);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        boomMenuButton.init(
                [getResources().getDrawable(R.drawable.bear)], // 子按钮的图标Drawable数组，不可以为null
                ["BEAR"],     // 子按钮的文本String数组，可以为null
                [getResources().getColor(R.color.colorPrimary)],    // 子按钮的背景颜色color二维数组，包括按下和正常状态的颜色，不可为null
                ButtonType.HAM,     // 子按钮的类型
                BoomType.PARABOLA,  // 爆炸类型
                PlaceType.HAM_3_1,  // 排列类型
                null,               // 展开时子按钮移动的缓动函数类型
                null,               // 展开时子按钮放大的缓动函数类型
                null,               // 展开时子按钮旋转的缓动函数类型
                null,               // 隐藏时子按钮移动的缓动函数类型
                null,               // 隐藏时子按钮缩小的缓动函数类型
                null,               // 隐藏时子按钮旋转的缓动函数类型
                null                // 旋转角度
        );
    }





    /**************************
     *
     * 給子頁籤呼叫用
     *
     **************************/
    public String getAppleData(){
        return "Apple 123";
    }
    public String getGoogleData(){
        return "Google 456";
    }
    public String getFacebookData(){
        return "Facebook 789";
    }
}
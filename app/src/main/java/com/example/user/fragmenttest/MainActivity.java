package com.example.user.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

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
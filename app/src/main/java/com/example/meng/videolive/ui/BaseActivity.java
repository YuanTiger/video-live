package com.example.meng.videolive.ui;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.meng.videolive.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置屏幕旋转方向
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //大于5.0的机型，更改主题色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
    }
}

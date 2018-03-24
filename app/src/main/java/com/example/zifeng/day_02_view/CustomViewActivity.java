package com.example.zifeng.day_02_view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by ZiFeng on 2018/3/24.
 */
public class CustomViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LinearLayout root = findViewById(R.id.root);
//        // 创建DrawView自定义控件
//        DrawView drawView = new DrawView(this);
//        // 设置该控件的最小宽度和高度
//        drawView.setMinimumWidth(300);
//        drawView.setMinimumHeight(500);
//        // 将控件添加到root容器中
//        root.addView(drawView);
    }
}

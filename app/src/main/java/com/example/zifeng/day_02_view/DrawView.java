package com.example.zifeng.day_02_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ZiFeng on 2018/3/24.
 */
public class DrawView extends View {
    // 定义两个浮点型坐标X Y
    public float currentX = 40;
    public float currentY = 50;
    // 创建画笔
    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }
    public DrawView(Context context, AttributeSet set){
        super(context,set);
    }
    // onDraaw当该组件将要绘制它的内容时回调该方法进行绘制
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        // 定义画笔颜色并且绘制一个圆，指定圆的坐标，半径，画笔
        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,p);
    }
    // onTouchEvent当发生触摸屏事件时触发该方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 修改currentX currentY的值
        currentX = event.getX();
        currentY = event.getY();
        // 通知当前组件重绘自己
        invalidate();
        // 返回true表明该处理方法已经处理该事件
        return true;
    }
}

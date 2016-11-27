package com.example.renpeng.viewfunctiondemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by renpeng on 16/11/27.
 */
public class FingerView extends TextView {

    private int mLastX;
    private int mLastY;

    public FingerView(Context context) {
        super(context);
    }

    public FingerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FingerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - mLastX;
                int offsetY = y - mLastY;
                ViewGroup.MarginLayoutParams leftMargin = (ViewGroup.MarginLayoutParams) getLayoutParams();

                leftMargin.leftMargin += offsetX;
                leftMargin.topMargin += offsetY;
                setLayoutParams(leftMargin);
                break;
        }
        mLastX = x;
        mLastY = y;
        return true;
    }
}

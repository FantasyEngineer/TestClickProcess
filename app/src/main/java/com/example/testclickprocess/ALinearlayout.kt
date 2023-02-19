package com.example.testclickprocess

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.LinearLayout

class ALinearlayout : LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        "ALinearlayout-dispatchTouchEvent".log()
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        "ALinearlayout-onInterceptTouchEvent".log()
//        return false
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        "ALinearlayout-onTouchEvent".log()
//        return false
        return super.onTouchEvent(event)
    }


}
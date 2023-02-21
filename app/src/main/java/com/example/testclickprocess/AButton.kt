package com.example.testclickprocess

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent

class AButton : androidx.appcompat.widget.AppCompatButton {
    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        "AButton-dispatchTouchEvent".log()
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        "AButton-onTouchEvent".log()
//        return false
        return super.onTouchEvent(event)
    }


}
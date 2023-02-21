package com.example.testclickprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ll = findViewById<ALinearlayout>(R.id.ll)
        ll.setOnClickListener {
            "点击我了ll".log()
        }
        var findViewById = findViewById<AButton>(R.id.tv)
//        findViewById.setOnClickListener {
//            "点击我了".log()
//        }
    }

    /**
     * 只要按下就会触发该方法，事件会依然向下传递
     */
    override fun onUserInteraction() {
        "onUserInteraction".log()
        super.onUserInteraction()
    }

    override fun onUserLeaveHint() {
        "onUserLeaveHint".log()
        super.onUserLeaveHint()
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        "MainActivity-dispatchTouchEvent".log()
        return super.dispatchTouchEvent(ev)
//        return false
//        return true
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        "MainActivity-onTouchEvent".log()
//        return true
        return super.onTouchEvent(event)
    }

}
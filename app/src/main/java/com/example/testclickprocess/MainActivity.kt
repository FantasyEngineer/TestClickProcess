package com.example.testclickprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var findViewById = findViewById<TextView>(R.id.tv)
        findViewById.setOnClickListener {
            "点击我了".log()
        }
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
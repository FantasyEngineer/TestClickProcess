package com.example.testclickprocess


import android.util.Log

//输出log
inline fun <T> T.log() {
    Log.d("listener", this.toString())
}

//输出log
inline fun <T> T.log(tag: String) {
    Log.d(tag, this.toString())

}

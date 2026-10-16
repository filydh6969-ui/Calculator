package com.calc.cientifica

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView

class MainActivity : Activity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.parseColor("#0f1115")
        window.navigationBarColor = Color.parseColor("#0f1115")
        val w = WebView(this)
        w.setBackgroundColor(Color.parseColor("#0f1115"))
        w.settings.javaScriptEnabled = true
        w.settings.domStorageEnabled = true
        w.loadUrl("file:///android_asset/index.html")
        setContentView(w)
    }
}

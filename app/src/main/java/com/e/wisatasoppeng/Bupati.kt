package com.e.wisatasoppeng

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.activity_bupati.*
import kotlinx.android.synthetic.main.activity_eksekutif.*

@Suppress("DEPRECATION")
class Bupati : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bupati)

        val url=intent.getStringExtra("url")

        webup.settings.javaScriptEnabled = true
        webup.settings.javaScriptCanOpenWindowsAutomatically = true
        //chromeclient

        webup.webChromeClient= object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress < 100) {
                    progres.progress = newProgress
                } else {
                    progres.visibility = View.GONE
                }

            }
        }

        //webviewclient
        webup.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return super.shouldOverrideUrlLoading(view, url)
            }

        }
        //load page
        webup.loadUrl(url)
    }
}



package com.e.wisatasoppeng

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_eksekutif.*
import kotlinx.android.synthetic.main.activity_legislatif.*

@Suppress("DEPRECATION")
class Legislatif : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legislatif)

        val url=intent.getStringExtra("url")

        webleg.settings.javaScriptEnabled = true
        webleg.settings.javaScriptCanOpenWindowsAutomatically = true
        //chromeclient
        webleg.webChromeClient=object : WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress<100){
                    progreslegis.progress=newProgress
                } else{
                    progreslegis.visibility= View.GONE
                }
            }
        }

        //webviewclient
        webleg.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return super.shouldOverrideUrlLoading(view, url)
            }

        }
        //load page
        webleg.loadUrl(url)

    }
}

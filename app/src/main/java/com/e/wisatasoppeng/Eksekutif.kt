package com.e.wisatasoppeng

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.activity_eksekutif.*
import kotlinx.android.synthetic.main.activity_profil.*

@Suppress("DEPRECATION")
class  Eksekutif : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksekutif)

        val url=intent.getStringExtra("url")

        webVieww.settings.javaScriptEnabled = true
        webVieww.settings.javaScriptCanOpenWindowsAutomatically = true
        //chromeclient
        webVieww.webChromeClient=object :WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress<100){
                    progressbarr.progress=newProgress
                } else{
                    progressbarr.visibility=View.GONE
                }
            }
        }

        //webviewclient
        webVieww.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return super.shouldOverrideUrlLoading(view, url)
            }

        }
        //load page
        webVieww.loadUrl(url)

        }
    }




package com.e.wisatasoppeng

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_legislatif.*
import kotlinx.android.synthetic.main.activity_profil.*

class Profil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        eksekutif.setOnClickListener {
            val url = "https://soppengkab.go.id/bupati-soppeng/"
            val webVieww = Intent(Intent.ACTION_VIEW)
            webVieww.data = Uri.parse(url)
            startActivity(webVieww)
        }
        legislatif.setOnClickListener {
            val url = "https://dprd-soppengkab.go.id/data-anggota-dprd/andipattapaunga/"
            val webleg = Intent(Intent.ACTION_VIEW)
            webleg.data = Uri.parse(url)
            startActivity(webleg)
        }
        bupati.setOnClickListener {
            val url = "https://soppengkab.go.id/bupati-dari-masa-ke-masa/"
            val webup = Intent(Intent.ACTION_VIEW)
            webup.data = Uri.parse(url)
            startActivity(webup)

        }
        sejarahsop.setOnClickListener {
            startActivity(Intent(this, Sejarah::class.java))
        }
        visi.setOnClickListener {
            startActivity(Intent(this, VisiMisi::class.java))
        }
        artilambang.setOnClickListener {
            startActivity(Intent(this, ArtiLambang::class.java))
        }
        selayang.setOnClickListener {
            startActivity(Intent(this, SelayangPandang::class.java))
        }
    }
}


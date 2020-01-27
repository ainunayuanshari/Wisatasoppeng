package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tamankalong.*
import kotlinx.android.synthetic.main.activity_waduk.*

class Waduk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waduk)

        lokasiwaduk.setOnClickListener {
            startActivity(Intent(this, LokasiTamkal::class.java))
            val detail = Intent(this, LokasiTamkal::class.java)
            detail.putExtra("judul", "Waduk Ompo Soppeng")
            detail.putExtra("deskripsi", "soppeng sulawesi selatan")
            detail.putExtra("lat", -4.3310923)
            detail.putExtra("lon", 119.8829896)
            startActivity(detail)
        }
    }
}

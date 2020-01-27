package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lejja.*
import kotlinx.android.synthetic.main.activity_tamankalong.*

class Lejja : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lejja)

        lokasilejja.setOnClickListener {
            startActivity(Intent(this, LokasiTamkal::class.java))
            val detail = Intent(this, LokasiTamkal::class.java)
            detail.putExtra("judul", "Permandian Air panas Lejja Soppeng")
            detail.putExtra("deskripsi", "Bulue, Mario Riawa, Soppeng Regency, South Sulawesi 90852")
            detail.putExtra("lat", -4.1522671)
            detail.putExtra("lon",119.7874241 )
            startActivity(detail)
        }
    }
}

package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tamankalong.*
import kotlinx.android.synthetic.main.activity_villayuliana.*

class Villayuliana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villayuliana)
        lokasivilla.setOnClickListener {
            startActivity(Intent(this, LokasiVilla::class.java))
            val detail = Intent(this, LokasiVilla::class.java)
            detail.putExtra("judul", "Villa Yuliana Soppeng")
            detail.putExtra("deskripsi", "Soppeng Sulawesi Selatan")
            detail.putExtra("lat", -4.3482244)
            detail.putExtra("lon", 119.8864509)
            startActivity(detail)
        }
    }
}

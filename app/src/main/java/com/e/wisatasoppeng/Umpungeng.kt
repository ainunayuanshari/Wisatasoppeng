package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tamankalong.*
import kotlinx.android.synthetic.main.activity_umpungeng.*

class Umpungeng : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_umpungeng)

        lokasiumpungeng.setOnClickListener {
            val detail = Intent(this, LokasiUmpungeng::class.java)
            detail.putExtra("judul", "Titik Nol Indonesia Umpungeng")
            detail.putExtra("deskripsi", "Umpungeng, Lalabata, Soppeng Regency, South Sulawesi")
            detail.putExtra("lat", -4.4082464)
            detail.putExtra("lon", 119.7275602)
            startActivity(detail)

        }
    }
}


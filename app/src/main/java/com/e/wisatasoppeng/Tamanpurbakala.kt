package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tamankalong.*
import kotlinx.android.synthetic.main.activity_tamanpurbakala.*

class Tamanpurbakala : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamanpurbakala)

        lokasipurbakala.setOnClickListener {
            val detail = Intent(this, LokasiPurbakala::class.java)
            detail.putExtra("judul", "Taman Purbakala Soppeng")
            detail.putExtra("deskripsi", "soppeng sulawesi selatan")
            detail.putExtra("lat",-4.3476326 )
            detail.putExtra("lon",119.8814801)
            startActivity(detail)
        }
    }
}

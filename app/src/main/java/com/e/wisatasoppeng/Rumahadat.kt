package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rumahadat.*
import kotlinx.android.synthetic.main.activity_tamankalong.*

class Rumahadat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumahadat)

        lokasirumahadat.setOnClickListener {
            startActivity(Intent(this, LokasiTamkal::class.java))
            val detail = Intent(this, LokasiTamkal::class.java)
            detail.putExtra("judul", "Rumah Adat SAO MARIO")
            detail.putExtra("deskripsi", "jl.poros, pangkajenne-soppeng, Laringgi, Mario Riawa, Kabupaten Soppeng, Sulawesi Selatan 9085jl.poros, pangkajenne-soppeng, Laringgi, Mario Riawa, Kabupaten Soppeng, Sulawesi Selatan 90852")
            detail.putExtra("lat", -4.1360457)
            detail.putExtra("lon", 119.8688898)
            startActivity(detail)
        }
    }
}

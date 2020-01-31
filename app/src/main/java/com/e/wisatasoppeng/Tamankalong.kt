package com.e.wisatasoppeng

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_peta.*
import kotlinx.android.synthetic.main.activity_tamankalong.*
class Tamankalong : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamankalong)

        lokasitamkal.setOnClickListener {
            val detail=Intent(this,LokasiTamkal::class.java)
            detail.putExtra("judul","Taman kalong soppeng")
            detail.putExtra("deskripsi","Botto, Lalabata, Soppeng Regency, South Sulawesi 90811")
            detail.putExtra("lat",-4.3558956)
            detail.putExtra("lon",119.8881182)
            startActivity(detail)

        }

        }

    }



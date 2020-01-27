package com.e.wisatasoppeng

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_lokasi_purbakala.*
import kotlinx.android.synthetic.main.activity_lokasi_rumahadat.*
import kotlinx.android.synthetic.main.activity_lokasi_rumahadat.navigasi
import kotlinx.android.synthetic.main.activity_lokasi_umpungeng.*

class LokasiPurbakala : FragmentActivity(),OnMapReadyCallback {
    private var latLng : LatLng? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokasi_purbakala)

        val judul = intent.getStringExtra("judul")
        val deskripsi= intent.getStringExtra("deskripsi")
        val latitude =intent.getDoubleExtra("lat",0.0)
        val longitude =intent.getDoubleExtra("lon",0.0)

        latLng= LatLng(latitude,longitude)

        //set judul
        judulpurbakala.text=judul
        //set deskripsi
        purbakalaTxt.text=deskripsi
        // map fragment
        val mapFragment=supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)

        //onclick navigasiv
        navigasi.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/maps/@$latitude,$longitude,224m")
            startActivity(Intent.createChooser(intent, "lanjutkan dengan.."))
        }
    }
    override fun onMapReady(p0: GoogleMap?) {
        val maps=p0
        val marker = maps?.addMarker(MarkerOptions().position(latLng!!).title(judulpurbakala.text.toString()))
        marker?.showInfoWindow()
        maps?.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,15f))
    }
}


package com.e.wisatasoppeng

import android.content.Intent
import android.location.Location
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_peta.*

class Peta : FragmentActivity(),OnMapReadyCallback{


    lateinit var taman_kalong:LatLng
    lateinit var taman_purbakala:LatLng

    private var latLng:LatLng?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peta)

        val judul = intent.getStringExtra("judul")
        val deskripsi= intent.getStringExtra("deskripsi")
        val latitude =intent.getDoubleExtra("lat",0.0)
        val longitude =intent.getDoubleExtra("lon",0.0)

        latLng= LatLng(latitude,longitude)

        //set judul
        judulkab.text=judul
        //set deskripsi
        deskripsiTxt.text=deskripsi
        // map fragment
        val mapFragment=supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)

        //onclick navigasiv
        navigasi.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/maps/place/Watansoppeng/@$latitude,$longitude,20z")
            startActivity(Intent.createChooser(intent, "lanjutkan dengan.."))
        }
    }
    override fun onMapReady(p0: GoogleMap?) {
        val maps=p0
        val marker = maps?.addMarker(MarkerOptions().position(latLng!!).title(judulkab.text.toString()))
        marker?.showInfoWindow()
        maps?.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,15f))

        taman_kalong= LatLng(-4.3558956,119.8859295)
        maps?.addMarker(MarkerOptions().position(taman_kalong).title("Taman Kalong SOppeng"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(taman_kalong,10f))

        taman_purbakala= LatLng(-4.3476326,119.8792914)
        maps?.addMarker(MarkerOptions().position(taman_purbakala).title("Taman purbakala"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(taman_purbakala,10f))

        val builder=LatLngBounds.Builder()
        builder.include(taman_kalong)
    }
}


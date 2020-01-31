package com.e.wisatasoppeng

import android.content.Context
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
    lateinit var Rumah_adat:LatLng
    lateinit var Desa_umpungeng:LatLng
    lateinit var Villa_yuliana:LatLng
    lateinit var Waduk_ompo:LatLng
    lateinit var Lejja_soppeng:LatLng

    private var latLng:LatLng?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peta)

        val judul = intent.getStringExtra("judul")
        val deskripsi= intent.getStringExtra("deskripsi")
        val latitude =intent.getDoubleExtra("lat",0.0)
        val longitude =intent.getDoubleExtra("lon",0.0)
//
        latLng= LatLng(latitude,longitude)
//
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

        Rumah_adat= LatLng(-4.1360457,119.8688898)
        maps?.addMarker(MarkerOptions().position(Rumah_adat).title("Rumah Adat SAO MARIO"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(Rumah_adat,10f))

        Desa_umpungeng= LatLng(-4.4082562,119.7976063)
        maps?.addMarker(MarkerOptions().position(Desa_umpungeng).title("Umpungen titik nol Indonesia"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(Desa_umpungeng,10f))

        Villa_yuliana= LatLng(-4.3488663,119.8843051)
        maps?.addMarker(MarkerOptions().position(Villa_yuliana).title("Museum Villa Yuliana Soppeng"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(Villa_yuliana,10f))

        Waduk_ompo= LatLng(-4.3312528,119.8818952)
        maps?.addMarker(MarkerOptions().position(Waduk_ompo).title("Waduk Ompo Soppeng"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(Waduk_ompo,10f))

        Lejja_soppeng= LatLng(-4.1524437,119.7863458)
        maps?.addMarker(MarkerOptions().position(Lejja_soppeng).title("Permandian Air Panas Lejja"))
        maps?.moveCamera(CameraUpdateFactory.newLatLngZoom(Lejja_soppeng,10f))



        val builder=LatLngBounds.Builder()
        builder.include(taman_kalong)
        builder.include(taman_purbakala)
        builder.include(Rumah_adat)
        builder.include(Desa_umpungeng)
        builder.include(Villa_yuliana)
        builder.include(Waduk_ompo)
        builder.include(Lejja_soppeng)

    }
}


package com.e.wisatasoppeng

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.e.wisatasoppeng.*
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.activity_eksekutif.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_profil.*

class Home: Fragment(), View.OnClickListener {
    override fun onClick(v: View?) {

    }

    lateinit var carouselView: CarouselView

    val sampleImages = intArrayOf(
        R.drawable.bannersatu,
        R.drawable.bannerdua,
        R.drawable.bannertiga,
        R.drawable.bannerempat
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.setTitle("WisataTa Soppeng")
        val view: View
        view = inflater.inflate(R.layout.activity_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        carouselView = view.findViewById(R.id.carouselView)
        carouselView.setPageCount(4)
        carouselView.setImageListener(imageListener)

        tamkal.setOnClickListener {
            startActivity(Intent(activity, Tamankalong::class.java))
        }
        villa.setOnClickListener {
            startActivity(Intent(activity, Villayuliana::class.java))

        }
        tampur.setOnClickListener {
            startActivity(Intent(activity, tampur::class.java))

        }
        lejja.setOnClickListener {
            startActivity(Intent(activity, Lejja::class.java))
        }
        waduk.setOnClickListener {
            startActivity(Intent(activity, Waduk::class.java))
        }
        umpungeng.setOnClickListener {
            startActivity(Intent(activity, Umpungeng::class.java))
        }
        rumahadat.setOnClickListener {
            startActivity(Intent(activity, Rumahadat::class.java))
        }
        tampur.setOnClickListener {
            startActivity(Intent(activity, Tamanpurbakala::class.java))
        }

        buttonabout.setOnClickListener {
            startActivity(Intent(activity,About::class.java))
        }


        buttonberita.setOnClickListener {
            val url =
                "https://soppengkab.go.id/kesbangpol-soppeng-skpd-dan-camat-untuk-tidak-melayani-lsm-ormas-yang-akan-investigasi/"
            val webView = Intent(Intent.ACTION_VIEW)
            webView.data = Uri.parse(url)
            startActivity(webView)

        }
        buttonpeta.setOnClickListener {

            val detail=Intent(activity,Peta::class.java)
            detail.putExtra("judul","Soppeng Regency")
            detail.putExtra("deskripsi","soppeng sulawesi selatan")
            detail.putExtra("lat",-4.3589798)
            detail.putExtra("lon",119.8891839)
            startActivity(detail)



        }
        buttonprofil.setOnClickListener {
            startActivity(Intent(activity, Profil::class.java))

        }
            buttonfasilitas.setOnClickListener {
                startActivity(Intent(activity, Fasilitas::class.java))
            }
        }
        var imageListener: ImageListener = object : ImageListener {
            override fun setImageForPosition(position: Int, imageView: ImageView?) {
                activity?.let {
                    Glide.with(this@Home).load(sampleImages[position]).into(imageView!!)
                }
            }
        }
    }

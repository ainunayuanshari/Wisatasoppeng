package com.e.wisatasoppeng

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.e.wisatasoppeng.R
import kotlinx.android.synthetic.main.activity_adapter_fasilitas.view.*
import kotlinx.android.synthetic.main.activity_fasilitas.view.*
import org.w3c.dom.Text
import java.net.URI
import java.net.URL


class AdapterFasilitas(private val daftarGambar: ArrayList<String>,private val judulGambar: ArrayList<String>) :
    RecyclerView.Adapter<AdapterFasilitas.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar = itemView.gambarFasilitas
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_fasilitas, parent, false))
    }

    override fun getItemCount(): Int {
        return daftarGambar.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val progress = CircularProgressDrawable(holder.itemView.context)
        Glide.with(holder.itemView.context).load(daftarGambar.get(position))
            .into(holder.gambar)

        holder.itemView.setOnClickListener() {

            imagePreview(daftarGambar.get(position),holder.itemView.context,judulGambar.get(position))

        }

    }
    private fun imagePreview(url:String, context: Context,judul:String){
        val view=LayoutInflater.from(context).inflate(R.layout.zoom,null)
        val imageViewZoom=view.findViewById<ImageView>(R.id.imageZoom)

        val judulzoom=view.findViewById<TextView>(R.id.judul)
        judulzoom.text=judul
        Glide.with(context).load(url).into(imageViewZoom)

        val alert=AlertDialog.Builder(context)
        alert.setView(view)
        alert.setPositiveButton("TUTUP"){dialog, which ->
            dialog.dismiss()
        }
        alert.create().show()
    }

}


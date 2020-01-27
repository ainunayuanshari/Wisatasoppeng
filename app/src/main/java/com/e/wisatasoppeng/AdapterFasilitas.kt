package com.e.wisatasoppeng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.e.wisatasoppeng.R
import kotlinx.android.synthetic.main.activity_adapter_fasilitas.view.*
import kotlinx.android.synthetic.main.activity_fasilitas.view.*



class AdapterFasilitas(private val daftarGambar: ArrayList<String>) :
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
            Toast.makeText(
                holder.itemView.context, daftarGambar.get(position),
                Toast.LENGTH_SHORT).show()
        }

    }
}


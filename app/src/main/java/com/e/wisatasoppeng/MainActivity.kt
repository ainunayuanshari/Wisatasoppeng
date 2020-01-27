package com.e.wisatasoppeng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val intent=Intent(this,Home::class.java)
        //startActivity(intent)

        supportFragmentManager.beginTransaction().replace(R.id.container_utama, Home()).commit()

    }

}


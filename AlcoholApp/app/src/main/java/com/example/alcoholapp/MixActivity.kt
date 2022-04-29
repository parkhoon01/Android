package com.example.alcoholapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.Beer.*
import com.example.alcoholapp.Beer.Lager.*
import com.example.alcoholapp.Mix.Somac
import com.example.alcoholapp.Mix.hibol
import com.example.alcoholapp.Mix.jelly
import com.example.alcoholapp.Mix.tagk
import com.example.alcoholapp.Tack.JangSoo
import com.example.alcoholapp.databinding.BeerMainBinding
import com.example.alcoholapp.databinding.MixMainBinding
import com.example.alcoholapp.databinding.SojuMainBinding
import com.example.alcoholapp.soju.*

class MixActivity : AppCompatActivity() {
    lateinit var binding: MixMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MixMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image1: ImageView = findViewById(R.id.imageView45)
        image1.setOnClickListener {
            val intent = Intent(applicationContext, Somac::class.java)
            startActivity(intent)
        }

        val image2: ImageView = findViewById(R.id.imageView47)
        image2.setOnClickListener {
            val intent = Intent(applicationContext, tagk::class.java)
            startActivity(intent)
        }

        val image3: ImageView = findViewById(R.id.imageView48)
        image3.setOnClickListener {
            val intent = Intent(applicationContext, jelly::class.java)
            startActivity(intent)
        }

        val image4: ImageView = findViewById(R.id.imageView49)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, hibol::class.java)
            startActivity(intent)
        }


    }
}
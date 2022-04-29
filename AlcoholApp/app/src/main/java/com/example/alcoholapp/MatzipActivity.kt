package com.example.alcoholapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.Beer.*
import com.example.alcoholapp.Beer.Lager.*
import com.example.alcoholapp.Matzip.*
import com.example.alcoholapp.Tack.JangSoo
import com.example.alcoholapp.databinding.BeerMainBinding
import com.example.alcoholapp.databinding.MatzipBinding
import com.example.alcoholapp.databinding.SojuMainBinding
import com.example.alcoholapp.soju.*

class MatzipActivity : AppCompatActivity() {
    lateinit var binding: MatzipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MatzipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image: ImageView = findViewById(R.id.imageView56)
        image.setOnClickListener {
            val intent = Intent(applicationContext, lovi::class.java)
            startActivity(intent)
        }

        val image2: ImageView = findViewById(R.id.imageView57)
        image2.setOnClickListener {
            val intent = Intent(applicationContext, yong::class.java)
            startActivity(intent)
        }

        val image3: ImageView = findViewById(R.id.imageView58)
        image3.setOnClickListener {
            val intent = Intent(applicationContext, iche::class.java)
            startActivity(intent)
        }

        val image4: ImageView = findViewById(R.id.imageView59)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, wara::class.java)
            startActivity(intent)
        }

        val image5: ImageView = findViewById(R.id.imageView60)
        image5.setOnClickListener {
            val intent = Intent(applicationContext, san::class.java)
            startActivity(intent)
        }


    }
}
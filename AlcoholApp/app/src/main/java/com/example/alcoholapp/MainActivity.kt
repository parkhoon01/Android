package com.example.alcoholapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.alcoholapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView9.bringToFront()

        val image4: ImageView = findViewById(R.id.imageView4)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, BodActivity::class.java)
            startActivity(intent)
        }
        val image5: ImageView = findViewById(R.id.imageView5)
        image5.setOnClickListener {
            val intent = Intent(applicationContext, TraditionActivity::class.java)
            startActivity(intent)
        }
        val image6: ImageView = findViewById(R.id.imageView6)
        image6.setOnClickListener {
            val intent = Intent(applicationContext, BeerActivity::class.java)
            startActivity(intent)
        }
        val image7: ImageView = findViewById(R.id.imageView7)
        image7.setOnClickListener {
            val intent = Intent(applicationContext, SojuActivity::class.java)
            startActivity(intent)
        }
        val image8: ImageView = findViewById(R.id.imageView10)
        image8.setOnClickListener {
            val intent = Intent(applicationContext, MixActivity::class.java)
            startActivity(intent)
        }
        val image9: ImageView = findViewById(R.id.imageView11)
        image9.setOnClickListener {
            val intent = Intent(applicationContext, MatzipActivity::class.java)
            startActivity(intent)
        }

    }
}
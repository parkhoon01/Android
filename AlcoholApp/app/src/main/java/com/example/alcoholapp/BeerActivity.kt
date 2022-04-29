package com.example.alcoholapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.Beer.*
import com.example.alcoholapp.Beer.Lager.*
import com.example.alcoholapp.Tack.JangSoo
import com.example.alcoholapp.databinding.BeerMainBinding

class BeerActivity : AppCompatActivity() {
    lateinit var binding: BeerMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BeerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image1: ImageView = findViewById(R.id.imageView30)
        image1.setOnClickListener {
            val intent = Intent(applicationContext, Pellong::class.java)
            startActivity(intent)
        }

        val image2: ImageView = findViewById(R.id.imageView31)
        image2.setOnClickListener {
            val intent = Intent(applicationContext, Insang::class.java)
            startActivity(intent)
        }

        val image3: ImageView = findViewById(R.id.imageView32)
        image3.setOnClickListener {
            val intent = Intent(applicationContext, SangSang::class.java)
            startActivity(intent)
        }

        val image4: ImageView = findViewById(R.id.imageView33)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, Arirang::class.java)
            startActivity(intent)
        }

        val image5: ImageView = findViewById(R.id.imageView34)
        image5.setOnClickListener {
            val intent = Intent(applicationContext, Daehan::class.java)
            startActivity(intent)
        }

        val image6: ImageView = findViewById(R.id.imageView35)
        image6.setOnClickListener {
            val intent = Intent(applicationContext, Gyeong::class.java)
            startActivity(intent)
        }

        val image7: ImageView = findViewById(R.id.imageView36)
        image7.setOnClickListener {
            val intent = Intent(applicationContext, Milki::class.java)
            startActivity(intent)
        }

        val image8: ImageView = findViewById(R.id.imageView37)
        image8.setOnClickListener {
            val intent = Intent(applicationContext, Witch::class.java)
            startActivity(intent)
        }

        val image9: ImageView = findViewById(R.id.imageView38)
        image9.setOnClickListener {
            val intent = Intent(applicationContext, Mine::class.java)
            startActivity(intent)
        }

        val image10: ImageView = findViewById(R.id.imageView17)
        image10.setOnClickListener {
            val intent = Intent(applicationContext, Ob::class.java)
            startActivity(intent)
        }

        val image11: ImageView = findViewById(R.id.imageView18)
        image11.setOnClickListener {
            val intent = Intent(applicationContext, Twe::class.java)
            startActivity(intent)
        }

        val image12: ImageView = findViewById(R.id.imageView20)
        image12.setOnClickListener {
            val intent = Intent(applicationContext, Good::class.java)
            startActivity(intent)
        }

        val image13: ImageView = findViewById(R.id.imageView21)
        image13.setOnClickListener {
            val intent = Intent(applicationContext, Kozel::class.java)
            startActivity(intent)
        }
        val image14: ImageView = findViewById(R.id.imageView22)
        image14.setOnClickListener {
            val intent = Intent(applicationContext, Trev::class.java)
            startActivity(intent)
        }

        val image15: ImageView = findViewById(R.id.imageView41)
        image15.setOnClickListener {
            val intent = Intent(applicationContext, Hepe::class.java)
            startActivity(intent)
        }

        val image16: ImageView = findViewById(R.id.imageView44)
        image16.setOnClickListener {
            val intent = Intent(applicationContext, Hineken::class.java)
            startActivity(intent)
        }

        val image17: ImageView = findViewById(R.id.imageView42)
        image17.setOnClickListener {
            val intent = Intent(applicationContext, sapporo::class.java)
            startActivity(intent)
        }
        val image18: ImageView = findViewById(R.id.imageView23)
        image18.setOnClickListener {
            val intent = Intent(applicationContext, Max::class.java)
            startActivity(intent)
        }
    }
}
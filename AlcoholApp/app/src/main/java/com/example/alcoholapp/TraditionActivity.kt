package com.example.alcoholapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.Chung.baekhwa
import com.example.alcoholapp.Chung.cheonbee
import com.example.alcoholapp.Chung.chungha
import com.example.alcoholapp.Chung.mowal
import com.example.alcoholapp.Ryuju.bock
import com.example.alcoholapp.Ryuju.mahwa
import com.example.alcoholapp.Ryuju.sansa
import com.example.alcoholapp.Ryuju.seol
import com.example.alcoholapp.Tack.JangSoo
import com.example.alcoholapp.Tack.aurazi
import com.example.alcoholapp.Tack.bae
import com.example.alcoholapp.Tack.idong
import com.example.alcoholapp.databinding.ActivityMainBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class TraditionActivity : AppCompatActivity() {
    lateinit var binding : TraditionMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TraditionMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView9.bringToFront()

        val image4: ImageView = findViewById(R.id.imageView4)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, JangSoo::class.java)
            startActivity(intent)
        }

        val image7: ImageView = findViewById(R.id.imageView7)
        image7.setOnClickListener {
            val intent = Intent(applicationContext, idong::class.java)
            startActivity(intent)
        }

        val image10: ImageView = findViewById(R.id.imageView10)
        image10.setOnClickListener {
            val intent = Intent(applicationContext, aurazi::class.java)
            startActivity(intent)
        }

        val image2: ImageView = findViewById(R.id.imageView2)
        image2.setOnClickListener {
            val intent = Intent(applicationContext, bae::class.java)
            startActivity(intent)
        }

        val image5: ImageView = findViewById(R.id.imageView5)
        image5.setOnClickListener {
            val intent = Intent(applicationContext, chungha::class.java)
            startActivity(intent)
        }

        val image8: ImageView = findViewById(R.id.imageView8)
        image8.setOnClickListener {
            val intent = Intent(applicationContext, baekhwa::class.java)
            startActivity(intent)
        }

        val image11: ImageView = findViewById(R.id.imageView11)
        image11.setOnClickListener {
            val intent = Intent(applicationContext, mowal::class.java)
            startActivity(intent)
        }

        val image12: ImageView = findViewById(R.id.imageView12)
        image12.setOnClickListener {
            val intent = Intent(applicationContext, cheonbee::class.java)
            startActivity(intent)
        }

        val image6: ImageView = findViewById(R.id.imageView6)
        image6.setOnClickListener {
            val intent = Intent(applicationContext, seol::class.java)
            startActivity(intent)
        }

        val image9: ImageView = findViewById(R.id.imageView9)
        image9.setOnClickListener {
            val intent = Intent(applicationContext, bock::class.java)
            startActivity(intent)
        }

        val image: ImageView = findViewById(R.id.imageView)
        image.setOnClickListener {
            val intent = Intent(applicationContext, mahwa::class.java)
            startActivity(intent)
        }

        val image13: ImageView = findViewById(R.id.imageView13)
        image13.setOnClickListener {
            val intent = Intent(applicationContext, sansa::class.java)
            startActivity(intent)
        }
    }
}
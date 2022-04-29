package com.example.jejuapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jejuapp.Restran.galchi
import com.example.jejuapp.Travel.*

class TravelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_spot)

        val image13: ImageView = findViewById(R.id.imageView13)
        image13.setOnClickListener {
            val intent = Intent(applicationContext, borom::class.java)
            startActivity(intent)
        }
        val image14: ImageView = findViewById(R.id.imageView14)
        image14.setOnClickListener {
            val intent = Intent(applicationContext, chenje::class.java)
            startActivity(intent)
        }
        val image15: ImageView = findViewById(R.id.imageView15)
        image15.setOnClickListener {
            val intent = Intent(applicationContext, kenung::class.java)
            startActivity(intent)
        }
        val image16: ImageView = findViewById(R.id.imageView16)
        image16.setOnClickListener {
            val intent = Intent(applicationContext, juli::class.java)
            startActivity(intent)
        }
        val image17: ImageView = findViewById(R.id.imageView17)
        image17.setOnClickListener {
            val intent = Intent(applicationContext, misul::class.java)
            startActivity(intent)
        }
    }
}
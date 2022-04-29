package com.example.jejuapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jejuapp.Restran.*

class MatzipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        val image4: ImageView = findViewById(R.id.imageView4)
        image4.setOnClickListener {
            val intent = Intent(applicationContext, galchi::class.java)
            startActivity(intent)
        }
        val image5: ImageView = findViewById(R.id.imageView5)
        image5.setOnClickListener {
            val intent = Intent(applicationContext, gooksoo::class.java)
            startActivity(intent)
        }
        val image6: ImageView = findViewById(R.id.imageView6)
        image6.setOnClickListener {
            val intent = Intent(applicationContext, gogi::class.java)
            startActivity(intent)
        }
        val image7: ImageView = findViewById(R.id.imageView7)
        image7.setOnClickListener {
            val intent = Intent(applicationContext, fish::class.java)
            startActivity(intent)
        }
        val image8: ImageView = findViewById(R.id.imageView8)
        image8.setOnClickListener {
            val intent = Intent(applicationContext, jondal::class.java)
            startActivity(intent)
        }
        val image9: ImageView = findViewById(R.id.imageView9)
        image9.setOnClickListener {
            val intent = Intent(applicationContext, maoodon::class.java)
            startActivity(intent)
        }
    }
}
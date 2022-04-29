package com.example.jejuapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jejuapp.Restran.galchi
import com.example.jejuapp.leisure_detail.gun
import com.example.jejuapp.leisure_detail.maze
import com.example.jejuapp.leisure_detail.nexon
import com.example.jejuapp.leisure_detail.wind

class leisure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leisure)

        val leis1: ImageView = findViewById(R.id.leisure_image1)
        leis1.setOnClickListener {
            val intent = Intent(applicationContext, wind::class.java)
            startActivity(intent)
        }
        val leis2: ImageView = findViewById(R.id.leisure_image2)
        leis2.setOnClickListener {
            val intent = Intent(applicationContext, nexon::class.java)
            startActivity(intent)
        }
        val leis3: ImageView = findViewById(R.id.leisure_image3)
        leis3.setOnClickListener {
            val intent = Intent(applicationContext, gun::class.java)
            startActivity(intent)
        }
        val leis4: ImageView = findViewById(R.id.leisure_image4)
        leis4.setOnClickListener {
            val intent = Intent(applicationContext, maze::class.java)
            startActivity(intent)
        }
    }

}
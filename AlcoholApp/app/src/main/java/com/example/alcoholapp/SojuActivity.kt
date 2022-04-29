package com.example.alcoholapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.Beer.*
import com.example.alcoholapp.Beer.Lager.*
import com.example.alcoholapp.Tack.JangSoo
import com.example.alcoholapp.databinding.BeerMainBinding
import com.example.alcoholapp.databinding.SojuMainBinding
import com.example.alcoholapp.soju.*

class SojuActivity : AppCompatActivity() {
    lateinit var binding: SojuMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SojuMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(applicationContext, cham::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            val intent = Intent(applicationContext, chun::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            val intent = Intent(applicationContext, jinro::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            val intent = Intent(applicationContext, daesun::class.java)
            startActivity(intent)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{
            val intent = Intent(applicationContext, hanra::class.java)
            startActivity(intent)
        }


    }
}
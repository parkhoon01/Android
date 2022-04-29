package com.example.jejuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jejuapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            val intent = Intent(applicationContext, TravelActivity::class.java)
            startActivityForResult(intent, 10)
        }
        binding.button2.setOnClickListener{
            val intent = Intent(applicationContext, MatzipActivity::class.java)
            startActivityForResult(intent, 20)
        }
        binding.button3.setOnClickListener{
            val intent = Intent(applicationContext, leisure::class.java)
            startActivityForResult(intent, 30)
        }
//        button1.setOnClickListener{
//            val intent = Intent(applicationContext, SecondActivity::class.java)
//            startActivity(intent)
//        }
//        val button2: Button = findViewById(R.id.button2)
//        button2.setOnClickListener{
//            val intent = Intent(applicationContext, ThirdActivity::class.java)
//            startActivity(intent)
//        }
    }
}
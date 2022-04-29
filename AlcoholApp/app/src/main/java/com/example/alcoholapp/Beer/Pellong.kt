package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Pellong: AppCompatActivity() {
    lateinit var binding : PellongaleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PellongaleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
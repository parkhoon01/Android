package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Daehan: AppCompatActivity() {
    lateinit var binding : DaehanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DaehanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
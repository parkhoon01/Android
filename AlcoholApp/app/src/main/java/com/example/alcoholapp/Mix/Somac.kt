package com.example.alcoholapp.Mix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Somac: AppCompatActivity() {
    lateinit var binding : SomacBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SomacBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
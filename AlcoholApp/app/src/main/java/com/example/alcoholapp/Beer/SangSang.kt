package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class SangSang: AppCompatActivity() {
    lateinit var binding : SangsangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SangsangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
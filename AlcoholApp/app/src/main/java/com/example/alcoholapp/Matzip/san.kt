package com.example.alcoholapp.Matzip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class san: AppCompatActivity() {
    lateinit var binding : SanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
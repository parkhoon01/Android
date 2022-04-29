package com.example.alcoholapp.soju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class daesun: AppCompatActivity() {
    lateinit var binding : DaesunBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DaesunBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
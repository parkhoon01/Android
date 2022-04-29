package com.example.alcoholapp.Ryuju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class seol: AppCompatActivity() {
    lateinit var binding : SeoljungBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SeoljungBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
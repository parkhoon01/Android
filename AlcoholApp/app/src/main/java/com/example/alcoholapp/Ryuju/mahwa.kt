package com.example.alcoholapp.Ryuju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class mahwa: AppCompatActivity() {
    lateinit var binding : MahwaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MahwaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
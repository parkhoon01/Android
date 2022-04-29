package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Insang: AppCompatActivity() {
    lateinit var binding : InsangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InsangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
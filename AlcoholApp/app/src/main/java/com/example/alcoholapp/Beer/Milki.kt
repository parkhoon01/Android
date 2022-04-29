package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Milki: AppCompatActivity() {
    lateinit var binding : MilkiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MilkiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
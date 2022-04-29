package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Hepe: AppCompatActivity() {
    lateinit var binding : HepeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HepeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
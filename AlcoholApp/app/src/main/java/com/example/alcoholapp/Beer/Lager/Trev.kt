package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Trev: AppCompatActivity() {
    lateinit var binding : TrevBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TrevBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
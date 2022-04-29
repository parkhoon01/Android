package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Kozel: AppCompatActivity() {
    lateinit var binding : KozelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KozelBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
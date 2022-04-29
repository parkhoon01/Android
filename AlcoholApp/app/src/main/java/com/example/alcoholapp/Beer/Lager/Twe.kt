package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Twe: AppCompatActivity() {
    lateinit var binding : TewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
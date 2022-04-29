package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Max: AppCompatActivity() {
    lateinit var binding : MaxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MaxBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
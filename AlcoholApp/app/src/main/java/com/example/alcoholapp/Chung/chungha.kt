package com.example.alcoholapp.Chung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.AuraziBinding
import com.example.alcoholapp.databinding.ChunghaBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class chungha: AppCompatActivity() {
    lateinit var binding : ChunghaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ChunghaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
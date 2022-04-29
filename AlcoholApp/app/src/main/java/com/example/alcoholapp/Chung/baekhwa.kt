package com.example.alcoholapp.Chung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.AuraziBinding
import com.example.alcoholapp.databinding.BackhwaBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class baekhwa: AppCompatActivity() {
    lateinit var binding : BackhwaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BackhwaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.alcoholapp.Chung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.AuraziBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.MowalBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class mowal: AppCompatActivity() {
    lateinit var binding : MowalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MowalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
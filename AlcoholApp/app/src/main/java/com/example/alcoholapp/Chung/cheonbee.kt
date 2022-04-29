package com.example.alcoholapp.Chung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.AuraziBinding
import com.example.alcoholapp.databinding.CheonbeeBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class cheonbee: AppCompatActivity() {
    lateinit var binding : CheonbeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CheonbeeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
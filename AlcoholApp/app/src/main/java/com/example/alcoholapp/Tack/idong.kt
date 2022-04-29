package com.example.alcoholapp.Tack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.IdongBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class idong: AppCompatActivity() {
    lateinit var binding : IdongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = IdongBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
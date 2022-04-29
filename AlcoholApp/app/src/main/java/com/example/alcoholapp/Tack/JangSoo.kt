package com.example.alcoholapp.Tack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class JangSoo: AppCompatActivity() {
    lateinit var binding : JansooBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JansooBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
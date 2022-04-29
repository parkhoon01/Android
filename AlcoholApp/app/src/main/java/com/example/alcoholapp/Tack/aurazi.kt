package com.example.alcoholapp.Tack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.AuraziBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class aurazi: AppCompatActivity() {
    lateinit var binding : AuraziBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AuraziBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
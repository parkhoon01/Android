package com.example.alcoholapp.Tack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.BaeBinding
import com.example.alcoholapp.databinding.IdongBinding
import com.example.alcoholapp.databinding.JansooBinding
import com.example.alcoholapp.databinding.TraditionMainBinding

class bae: AppCompatActivity() {
    lateinit var binding : BaeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BaeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class sapporo: AppCompatActivity() {
    lateinit var binding : SapporoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SapporoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.alcoholapp.Matzip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class iche: AppCompatActivity() {
    lateinit var binding : IcheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = IcheBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
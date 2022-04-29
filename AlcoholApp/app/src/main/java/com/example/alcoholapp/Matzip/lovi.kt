package com.example.alcoholapp.Matzip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class lovi: AppCompatActivity() {
    lateinit var binding : LoviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoviBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
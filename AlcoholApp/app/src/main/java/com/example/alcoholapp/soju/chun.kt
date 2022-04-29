package com.example.alcoholapp.soju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class chun: AppCompatActivity() {
    lateinit var binding : ChumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ChumBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
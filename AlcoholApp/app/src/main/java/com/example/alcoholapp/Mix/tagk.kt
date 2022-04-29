package com.example.alcoholapp.Mix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class tagk: AppCompatActivity() {
    lateinit var binding : TagkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TagkBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
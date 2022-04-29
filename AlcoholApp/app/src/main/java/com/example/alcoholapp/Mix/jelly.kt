package com.example.alcoholapp.Mix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class jelly: AppCompatActivity() {
    lateinit var binding : JellyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JellyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
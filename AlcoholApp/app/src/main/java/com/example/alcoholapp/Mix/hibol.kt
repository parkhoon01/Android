package com.example.alcoholapp.Mix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class hibol: AppCompatActivity() {
    lateinit var binding : HibolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HibolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
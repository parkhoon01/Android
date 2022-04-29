package com.example.alcoholapp.Matzip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class yong: AppCompatActivity() {
    lateinit var binding : YongsanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = YongsanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.alcoholapp.soju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class jinro: AppCompatActivity() {
    lateinit var binding : JinroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JinroBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
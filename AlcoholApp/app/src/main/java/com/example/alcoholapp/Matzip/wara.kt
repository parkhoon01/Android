package com.example.alcoholapp.Matzip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class wara: AppCompatActivity() {
    lateinit var binding : WaraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WaraBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
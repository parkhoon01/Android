package com.example.alcoholapp.Ryuju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class bock: AppCompatActivity() {
    lateinit var binding : BockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BockBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.alcoholapp.soju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class cham: AppCompatActivity() {
    lateinit var binding : ChamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ChamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
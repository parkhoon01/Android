package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Witch: AppCompatActivity() {
    lateinit var binding : WitchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WitchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
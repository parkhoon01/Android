package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Ob: AppCompatActivity() {
    lateinit var binding : ObBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ObBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
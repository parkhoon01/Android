package com.example.alcoholapp.Ryuju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class sansa: AppCompatActivity() {
    lateinit var binding : SansaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SansaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
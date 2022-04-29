package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Arirang: AppCompatActivity() {
    lateinit var binding : ArirangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ArirangBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
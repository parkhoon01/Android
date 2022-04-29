package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Gyeong: AppCompatActivity() {
    lateinit var binding : GyungbockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GyungbockBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
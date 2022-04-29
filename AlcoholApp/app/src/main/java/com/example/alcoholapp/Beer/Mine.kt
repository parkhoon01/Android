package com.example.alcoholapp.Beer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Mine: AppCompatActivity() {
    lateinit var binding : MineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MineBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
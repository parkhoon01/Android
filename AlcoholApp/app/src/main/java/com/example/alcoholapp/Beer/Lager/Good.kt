package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Good: AppCompatActivity() {
    lateinit var binding : GoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
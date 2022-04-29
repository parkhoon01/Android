package com.example.alcoholapp.Beer.Lager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class Hineken: AppCompatActivity() {
    lateinit var binding : HinekenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HinekenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
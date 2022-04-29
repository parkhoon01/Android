package com.example.alcoholapp.soju

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alcoholapp.databinding.*

class hanra: AppCompatActivity() {
    lateinit var binding : HanraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HanraBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
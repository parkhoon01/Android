package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var viewModel: MyViewModel
    private lateinit var viewModelFactory: MyViewModelFactory
    private lateinit var viewModelLive: MyViewModelLive


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //viewModelFactory = MyViewModelFactory(50)

        // viewModel = MyViewModel()
        //viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)    // Singleton
        viewModelLive = ViewModelProvider(this).get(MyViewModelLive::class.java)
        textView = findViewById(R.id.textView)
       // textView.text = viewModel.getCurrentVal().toString()
        findViewById<Button>(R.id.button).setOnClickListener{
            //counter++   // Data processing code

            //textView.text = viewModel.increaseCounter().toString()  // Bind data to view
            viewModelLive.increaseScore()
        }
        val myObserver = Observer<Int>{
            textView.text = it.toString()
        }
        viewModelLive.score.observe(this, myObserver)
    }
}
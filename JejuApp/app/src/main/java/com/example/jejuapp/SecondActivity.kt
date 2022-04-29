package com.example.jejuapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.jejuapp.adapter.ItemAdapter
import com.example.jejuapp.datamodel.DataSet


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
//        val button: Button = findViewById(R.id.button4)
//        button.setOnClickListener{ finish() }


        val dataset = DataSet().makeSet()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataset)
    }
}
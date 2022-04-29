package com.example.activitytodo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.activitytodo.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var datalist: MutableList<String>? = null
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        findViewById<FloatingActionButton>(R.id.main_fab)
        binding.mainFab.setOnClickListener{
            val intent = Intent(this, TodoActivity::class.java)
            startActivityForResult(intent, 20)
        }

        datalist = savedInstanceState?.let{
            it.getStringArrayList("datalist")?.toMutableList()  // null이 아니면
        } ?: let{ mutableListOf<String>() }   // null 이면

        var layoutManager = LinearLayoutManager(this)
        binding.mainRecyclerView.layoutManager = layoutManager
        adapter = MyAdapter(datalist)
        binding.mainRecyclerView.adapter = adapter
        binding.mainRecyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 20 && resultCode == Activity.RESULT_OK){
            data!!.getStringExtra("result")?.let {
                datalist?.add(it)
                adapter.notifyDataSetChanged()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putStringArrayList("datalist", ArrayList(datalist))
    }
}
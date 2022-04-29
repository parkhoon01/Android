package com.example.activityswitching

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bundle: Bundle? = intent.extras
        val age: Int? = bundle?.getInt("age")

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val ret = Intent()
            ret.putExtra("name", "Mike : " + age)
            setResult(RESULT_OK, ret)
            finish()
        }
    }
}
package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Roll button referencing
        val rollBtn: Button = findViewById(R.id.roll)
        rollBtn.setOnClickListener {
            //Toast.makeText(this, "Button Clicked!!", Toast.LENGTH_LONG).show()
            val myDice:Dice = Dice(6)
            val num = myDice.roll()
            //val textview: TextView = findViewById(R.id.number)
            //textview.text = num.toString()
            val diceImg : ImageView = findViewById(R.id.diceView)
            when(num){
                1 -> diceImg.setImageResource(R.drawable.dice_1)
                2 -> diceImg.setImageResource(R.drawable.dice_2)
                3 -> diceImg.setImageResource(R.drawable.dice_3)
                4 -> diceImg.setImageResource(R.drawable.dice_4)
                5 -> diceImg.setImageResource(R.drawable.dice_5)
                6 -> diceImg.setImageResource(R.drawable.dice_6)
            }
        }
    }
    // inner Class
    class Dice(private val sides:Int){
        //val sides = 6
        fun roll():Int{
            return (1..sides).random()
        }
    }
}
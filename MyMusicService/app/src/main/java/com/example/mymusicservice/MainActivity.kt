package com.example.mymusicservice

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //private lateinit var player: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // player = MediaPlayer.create(this, R.raw.music)
        findViewById<Button>(R.id.btn_play).setOnClickListener{
            btnClick(it)
        }
        findViewById<Button>(R.id.btn_pause).setOnClickListener{
//            if(player.isPlaying) player.pause()
//            println("Music is paused.")
            btnClick(it)
        }
    }

    fun btnClick(view: View){
        val intent = Intent(this, MusicService::class.java)
        if(view.id == R.id.btn_play)
            intent.putExtra("PLAY", false)
        else intent.putExtra("PLAY", true)

        startService(intent)
    }

    override fun onDestroy() {
        //player.release()
        super.onDestroy()
    }
}
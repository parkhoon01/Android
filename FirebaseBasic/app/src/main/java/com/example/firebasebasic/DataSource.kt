package com.example.firebaseapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase

class DataSource {
    fun getData(): LiveData<MutableList<Movie>> {
        val liveMovies = MutableLiveData<MutableList<Movie>>()
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("movie")
        ref.addValueEventListener(object : ValueEventListener {
            val mlist = mutableListOf<Movie>()
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()) {
                    for(movieSnapshot in snapshot.children) {
                        val data = movieSnapshot.getValue(Movie::class.java)
                        mlist.add(data!!)
                    }
                    liveMovies.value = mlist
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        return liveMovies
    }
}
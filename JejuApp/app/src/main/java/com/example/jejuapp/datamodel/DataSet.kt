package com.example.jejuapp.datamodel

import com.example.jejuapp.R

class DataSet {
    fun makeSet() : List<Affirmation>{
        return listOf<Affirmation>(Affirmation(R.string.affirmation1, R.drawable.back3),
            Affirmation(R.string.affirmation2, R.drawable.chen1),
            Affirmation(R.string.affirmation3, R.drawable.gyung),
            Affirmation(R.string.affirmation4, R.drawable.joosang),
            Affirmation(R.string.affirmation5, R.drawable.misul),
            Affirmation(R.string.affirmation6, R.drawable.shinchan),
            Affirmation(R.string.affirmation7, R.drawable.borom),
            Affirmation(R.string.affirmation8, R.drawable.back3),
            Affirmation(R.string.affirmation9, R.drawable.back3),
            Affirmation(R.string.affirmation10, R.drawable.back3))
    }
}
package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerHolder(itemview: View): RecyclerView.ViewHolder(itemview){
    private val poster = itemview.findViewById<ImageView>(R.id.poster)
    fun bind(image: Int) = poster.setImageResource(image)
}

class ViewPagerAdapter(private val mlist: List<Int>) : RecyclerView.Adapter<ViewPagerHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview, parent, false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(mlist[position])
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

}
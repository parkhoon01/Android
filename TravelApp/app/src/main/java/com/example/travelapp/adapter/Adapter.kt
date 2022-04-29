package com.example.travelapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.R

class Adapter {
    class ProfileAdapter(private val context: Context) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

        var datas = mutableListOf<SpotData>()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.item_recycler_ex,parent,false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int = datas.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(datas[position])
        }

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            private val txtName: TextView = itemView.findViewById(R.id.tv_rv_name)
            private val txtAge: TextView = itemView.findViewById(R.id.tv_rv_age)
            private val imgProfile: ImageView = itemView.findViewById(R.id.img_rv_photo)

            fun bind(item: SpotData) {
                txtName.text = item.name
                txtAge.text = item.age.toString()
                Glide.with(itemView).load(item.img).into(imgProfile)

            }
        }


    }
}
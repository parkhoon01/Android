package com.example.recyclerapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerapp.R
import com.example.recyclerapp.datamodel.Affirmation
import com.example.recyclerapp.datamodel.DataSet

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
        // Inner class ItemViewHolder
        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
            val textview: TextView = view.findViewById(R.id.item_title)
            val imageview: ImageView = view.findViewById(R.id.item_image)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemlayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(itemlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textview.text = context.resources.getString(item.strResource)
        holder.imageview.setImageResource(item.imageResource)
    }

    override fun getItemCount() = dataset.size
}
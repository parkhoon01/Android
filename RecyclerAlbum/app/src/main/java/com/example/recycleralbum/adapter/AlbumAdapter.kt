package com.example.recycleralbum.adapter

import android.content.Context
import android.icu.util.MeasureUnit
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleralbum.R
import com.example.recycleralbum.datamodel.Album

class AlbumAdapter(val context: Context, val albumList: MutableList<Album>?) : RecyclerView.Adapter<AlbumAdapter.MyViewHolder>() {
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var title: TextView = itemView.findViewById(R.id.title)
            var count: TextView = itemView.findViewById(R.id.count)
            var thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
            var overflow: ImageView = itemView.findViewById(R.id.overflow)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.album_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val album = albumList!![position]
        holder.title.text = album.name
        holder.count.text = album.numOfSongs.toString() + "songs"
        holder.thumbnail.setImageResource(album.thumbnail)
        holder.overflow.setOnClickListener{ showPopupMenu(holder.overflow) }
    }

    private fun showPopupMenu(view: View){
        val popup = PopupMenu(context, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.menu_album, popup.menu)
        popup.setOnMenuItemClickListener(MenuListener())
        popup.show()
    }

    class MenuListener : PopupMenu.OnMenuItemClickListener{
        override fun onMenuItemClick(p0: MenuItem?): Boolean {
            return false
        }

    }
    override fun getItemCount(): Int {
        return albumList!!.size
    }

}
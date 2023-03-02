package com.example.pinterestclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pinterestclone.R
import com.example.pinterestclone.model.OzimniModelim


class LishniyAdapter(val list: ArrayList<OzimniModelim>) :
    RecyclerView.Adapter<LishniyAdapter.SearchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val item = list[position]
        holder.apply {
            Glide.with(ivImage).load(item.imgae).into(ivImage)
            tvText.text=item.text

        }
    }

    class SearchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivImage = view.findViewById<ImageView>(R.id.image)
        val tvText = view.findViewById<TextView>(R.id.text)
    }

}
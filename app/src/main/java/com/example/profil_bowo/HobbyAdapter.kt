package com.example.profil_bowo

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbyAdapter (private val list:ArrayList<HobbyData>):
    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>(){

    class HobbyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val nama = itemView.findViewById<TextView>(R.id.namahobby)
        private val desc = itemView.findViewById<TextView>(R.id.deschobby)

        fun bind(get: HobbyData) {
            nama.text = get.nama
            desc.text = get.desc


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        return HobbyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_hobby, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
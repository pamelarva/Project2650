package com.example.project2650

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterSpace(private val listBuku:List<Model>): RecyclerView.Adapter<AdapterSpace.ViewHolder>(){
    class ViewHolder (ItemView: View):RecyclerView.ViewHolder(ItemView){
        val gambar: ImageView = itemView.findViewById(R.id.imageC)
        val judul: TextView = itemView.findViewById(R.id.textjudul)
        val teks: TextView = itemView.findViewById(R.id.textpenjelasan)
        val desk: TextView = itemView.findViewById(R.id.textView13)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_space,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelBuku = listBuku[position]

        holder.gambar.setImageResource(modelBuku.gambar)
        holder.judul.text = modelBuku.judul
        holder.teks.text = modelBuku.teks
        holder.desk.text = modelBuku.desk
    }
}
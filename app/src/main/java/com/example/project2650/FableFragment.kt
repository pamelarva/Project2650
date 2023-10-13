package com.example.project2650

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FableFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_fable,container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerBukuFable)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(activity)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(
            BukuModel(R.drawable.monkey, "Litle Monkey",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.garden, "Animal Garden",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.jungle, "Jungle Story",
                "Buku anak-anak."))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
package com.example.project2650

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ScienceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_science,container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerBukuScience)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(activity)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(
            BukuModel(R.drawable.book1, "Emi's Beach Adventure",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.book2, "Ade's Adventure",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.book4, "Mermaid To Rescue",
                "Buku anak-anak."))

        val adapter = AdapterScience(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
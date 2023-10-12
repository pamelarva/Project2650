package com.example.project2650

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FairyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_fairy,container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerBukuFairy)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(activity)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(
            BukuModel(R.drawable.backyard, "In Your Own Backyard",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.forest, "Encharted Forest",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.world, "Unseen World",
                "Buku anak-anak."))

        val adapter = AdapterFairy(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
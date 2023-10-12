package com.example.project2650

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val btnBookKid: Button = findViewById(R.id.buttonBookKid)
        val btnReading: Button = findViewById(R.id.buttonReading)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
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
        data.add(
            BukuModel(R.drawable.book1, "Emi's Beach Adventure",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.book2, "Ade's Adventure",
                "Buku anak-anak."))
        data.add(
            BukuModel(R.drawable.book4, "Mermaid To Rescue",
                "Buku anak-anak."))
        //set adapter
        val adapter = AdapterHome(data)
        //set adapter ke recyclre view
        rvBuku.adapter = adapter

        //event button book kid
        btnBookKid.setOnClickListener{
            val intentBookKidActivity = Intent(this, BookKidActivity::class.java)
            startActivity(intentBookKidActivity)
        }
        btnReading.setOnClickListener {
            val intentReadingActivity = Intent (this, ReadingActivity::class.java)
            startActivity(intentReadingActivity)
        }
    }
}
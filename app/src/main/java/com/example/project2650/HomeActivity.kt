package com.example.project2650

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val btnBookKid: Button = findViewById(R.id.buttonBookKid)

        //event button book kid
        btnBookKid.setOnClickListener{
        }
    }
}
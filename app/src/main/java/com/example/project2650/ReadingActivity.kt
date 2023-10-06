package com.example.project2650

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class ReadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)

        //INSTANCE
        val btnLegend:Button = findViewById(R.id.buttonLegend)
        val btnMyth:Button = findViewById(R.id.buttonMyth)

        //event button legend
        btnLegend.setOnClickListener {
            replaceFragment(LegendFragment())
        }
        //event button myth
        btnMyth.setOnClickListener {
            replaceFragment(MythFragment())
        }
    }
    //create method replace fragment
    private fun replaceFragment (frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentReading,frg)
        fragmentTrx.commit()
    }
}
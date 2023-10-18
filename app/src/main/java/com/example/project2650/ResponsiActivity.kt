package com.example.project2650

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        //instance
        val location: ImageView = findViewById(R.id.imageButton2)

        //lokasi
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6, -122, 3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW,gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) !=null) {
                startActivity(mapIntent)
            }
        }
    }
}
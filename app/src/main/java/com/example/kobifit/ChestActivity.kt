package com.example.kobifit

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ChestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chest)

        val pompkiIntent = findViewById<ImageView>(R.id.btnPompki)

        pompkiIntent.setOnClickListener {

            val pompInt = Intent(this, PompkiActivity::class.java)
            startActivity(pompInt)

        }



    }
}
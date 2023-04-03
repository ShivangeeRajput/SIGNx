package com.example.signify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ASL_Flash : AppCompatActivity() {

    lateinit var btnPDF: Button
    lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asl_flash2)

        btnPDF=findViewById(R.id.btnPDF)

        btnPDF.setOnClickListener {
            startActivity(Intent(this@ASL_Flash,flash_PDF::class.java))
        }
    }
}
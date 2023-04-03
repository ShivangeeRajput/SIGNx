package com.example.signify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ISL : AppCompatActivity() {

    lateinit var btnPDF: Button
    lateinit var imageView: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isl)

        btnPDF=findViewById(R.id.btnPDF)

        btnPDF.setOnClickListener {
            startActivity(Intent(this@ISL,ISLPDF::class.java))
        }

    }
}
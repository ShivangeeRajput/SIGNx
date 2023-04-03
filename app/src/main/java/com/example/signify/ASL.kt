package com.example.signify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.signify.R

class ASL : AppCompatActivity() {

    lateinit var btnPDF: Button
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asl)

        btnPDF=findViewById(R.id.btnPDF)

        btnPDF.setOnClickListener {
            startActivity(Intent(this@ASL,ASLPDF::class.java))
        }

    }
}
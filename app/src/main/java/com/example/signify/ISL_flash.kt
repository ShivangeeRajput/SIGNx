package com.example.signify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ISL_flash : AppCompatActivity() {

    lateinit var btnPDF:Button
    lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isl_flash)

        btnPDF=findViewById(R.id.btnPDF)

        btnPDF.setOnClickListener {
            startActivity(Intent(this@ISL_flash,ISL_Fash_PDF::class.java))
        }

    }

}
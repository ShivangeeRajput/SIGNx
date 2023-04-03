package com.example.signify

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class ISLPDF : AppCompatActivity() {

    lateinit var pdfView: PDFView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islpdf)

        pdfView=findViewById(R.id.pdfView)

        pdfView.fromAsset("ISL.pdf").load()
    }
}
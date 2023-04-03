package com.example.signify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class ASLPDF : AppCompatActivity() {

    lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aslpdf)

        pdfView=findViewById(R.id.pdfView)

        pdfView.fromAsset("asl.pdf").load()
    }
}
package com.example.signify

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class ISL_Fash_PDF : AppCompatActivity() {

    lateinit var pdfView: PDFView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isl_fash_pdf)

        pdfView=findViewById(R.id.pdfView)

        pdfView.fromAsset("ASL-Numbers-ASDC.pdf").load()
    }
    }

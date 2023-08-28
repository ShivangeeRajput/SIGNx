package com.example.signify.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.signify.R

class Slash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash)

        supportActionBar?.hide()
// providing time limit for splash activity
     Handler().postDelayed({
         val intent = Intent(
             this@Slash, Login::class.java)
         startActivity(intent)
         finish()
     },2000)
    }
}

package com.example.signify.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.signify.MainActivity
import com.example.signify.R
import com.google.firebase.auth.FirebaseAuth



class Login : AppCompatActivity() {

    //declaring variables

    private lateinit var edt_email: EditText
    private lateinit var edt_password : EditText
    private lateinit var btnlogin: TextView
    private lateinit var btnsignupp : TextView
    //firebase
    private lateinit var mAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // changing the color of toolbar manually
        supportActionBar?.hide()

        mAuth= FirebaseAuth.getInstance()



        edt_email=findViewById(R.id.edt_email)
        edt_password=findViewById(R.id.edt_password)
        btnsignupp=findViewById(R.id.btnsignup)
        btnlogin= findViewById(R.id.btnlogin)

        //code for remain as logged in for already signed in users

        if (mAuth.currentUser != null){
            Toast.makeText(this@Login,"User is already signed in!", Toast.LENGTH_SHORT).show()
            val intent= Intent(this@Login, MainActivity::class.java)
            startActivity(intent)
        }
        //redirecting user to signup page
        btnsignupp.setOnClickListener{
            intent= Intent(this@Login, SignIn::class.java)
            startActivity(intent)
        }

        //logic for logging in user
        btnlogin.setOnClickListener{
            val email=edt_email.text.toString()
            val password=edt_password.text.toString()

            login(email,password);
        }
    }

    private fun login(email: String,password:String){
        //logic for logging in
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // code for logging in user
                    val intent=Intent(this@Login, MainActivity::class.java)
                    startActivity(intent)

                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this@Login,"User does not exist",Toast.LENGTH_SHORT).show()
                }
            }


    }
}
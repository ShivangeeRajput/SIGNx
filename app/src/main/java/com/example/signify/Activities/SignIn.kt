package com.example.signify.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.signify.MainActivity
import com.example.signify.R
import com.google.firebase.auth.FirebaseAuth


class SignIn : AppCompatActivity() {

    private lateinit var edt_name: EditText
    private lateinit var edt_email: EditText
    private lateinit var edt_password: EditText
    private lateinit var btnsignup: Button
    private lateinit var btnloginn : TextView

    private lateinit var mAuth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)



        supportActionBar?.hide()
        mAuth= FirebaseAuth.getInstance()


        edt_name=findViewById(R.id.edt_name)
        edt_email=findViewById(R.id.edt_email)
        edt_password=findViewById(R.id.edt_password)
        btnsignup=findViewById(R.id.btnsignup)
        btnloginn=findViewById(R.id.btnloginn)


       btnloginn.setOnClickListener{
           intent= Intent(this@SignIn, Login::class.java)
           startActivity(intent)

       }
        btnsignup.setOnClickListener{
            val email =edt_email.text.toString()
            val password =edt_password.text.toString()

            if (email.isBlank() || password.isBlank()){
                Toast.makeText(this@SignIn,"Email & Password Can't be blank",Toast.LENGTH_SHORT).show()

            }
            signup(email,password)
        }
    }

    private fun signup(email: String, password: String){

        //logic for signin up
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // code for jumping to home activity
                    val intent=Intent(this@SignIn, MainActivity::class.java)
                    startActivity(intent)

                } else {
                    // If sign in fails, display a message to the user.(Toast)
                    Toast.makeText(this@SignIn,"Some error occured",Toast.LENGTH_SHORT).show()
                }
            }


    }



}

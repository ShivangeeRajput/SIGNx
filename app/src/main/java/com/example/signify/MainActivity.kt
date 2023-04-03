package com.example.signify


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.signify.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDbRef: DatabaseReference

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mAuth = FirebaseAuth.getInstance()
        mDbRef= FirebaseDatabase.getInstance().getReference()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState == null) {
            supportActionBar?.hide()
            replaceFragment(Home())
        }


        binding.bottomNav.selectedItemId = R.id.home

        binding.bottomNav.setOnItemSelectedListener {

            when(it.itemId){
                //declare all bottom navigation here like home and learn
                R.id.profile -> {
                    supportActionBar?.show()
                    replaceFragment(Profile())
                }
                R.id.home -> { supportActionBar?.hide()
                    replaceFragment(Home())
                }
                R.id.learning -> { supportActionBar?.hide()
                    replaceFragment(learning())
                }
            }
            true
        } }



    private fun replaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }



    }




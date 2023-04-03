package com.example.signify

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.signify.Activities.Login
import com.example.signify.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth



class Profile : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    // This property is only valid between onCreateView and
   // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var mAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        mAuth = FirebaseAuth.getInstance()
        //enabling  options menu
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }


     //creating and accessing  menu for logging out
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu, inflater)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.logout -> {
                mAuth.signOut()
                val intent = Intent(context, Login::class.java)
                startActivity(intent)
                activity?.finish()
            }
            R.id.rateus -> {

            }
            R.id.followus -> {

            }
        }
        return  true
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


}

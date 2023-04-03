package com.example.signify

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.signify.databinding.FragmentLearningBinding


class learning : Fragment() {

    private var _binding: FragmentLearningBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLearningBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.cvAsl.setOnClickListener{
                startActivity(Intent(context,ASLPDF::class.java))
            }
           binding.cvisl.setOnClickListener {
                startActivity(Intent(context,ISL::class.java))
            }
            binding.cvAslFlash.setOnClickListener {
                startActivity(Intent(context,ASL_Flash::class.java))
            }
            binding.cvIslFlash.setOnClickListener {
                startActivity(Intent(context,ISL_flash::class.java))
            }


    }

}
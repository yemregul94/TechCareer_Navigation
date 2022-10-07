package com.works.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.works.navigation_project.databinding.FragmentAlphaBinding

class AlphaFragment : Fragment() {
    private lateinit var binding: FragmentAlphaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAlphaBinding.inflate(inflater, container, false)

        binding.buttonToB.setOnClickListener {
            val navigateToBravo = AlphaFragmentDirections.alphaToBravo()
            Navigation.findNavController(it).navigate(navigateToBravo)
        }

        return binding.root
    }
}
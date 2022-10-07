package com.works.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.works.navigation_project.databinding.FragmentBravoBinding

class BravoFragment : Fragment() {
    private lateinit var binding: FragmentBravoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBravoBinding.inflate(inflater, container, false)

        binding.buttonToD.setOnClickListener {
            val navigateToDelta = BravoFragmentDirections.bravoToDelta()
            Navigation.findNavController(it).navigate(navigateToDelta)
        }

        return binding.root
    }
}
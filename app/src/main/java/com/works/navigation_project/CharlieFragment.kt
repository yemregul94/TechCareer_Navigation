package com.works.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.works.navigation_project.databinding.FragmentCharlieBinding

class CharlieFragment : Fragment() {
    private lateinit var binding: FragmentCharlieBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCharlieBinding.inflate(inflater, container, false)

        binding.buttonToD2.setOnClickListener {
            val navigateToDelta = CharlieFragmentDirections.charlieToDelta()
            Navigation.findNavController(it).navigate(navigateToDelta)
        }

        return binding.root
    }
}
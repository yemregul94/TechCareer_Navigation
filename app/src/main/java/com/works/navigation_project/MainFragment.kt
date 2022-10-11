package com.works.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.works.navigation_project.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.buttonToA.setOnClickListener {
            val navigateToAlpha = MainFragmentDirections.mainToAlpha()
            Navigation.findNavController(it).navigate(navigateToAlpha)
        }

        binding.buttonToC.setOnClickListener {
            val navigateToCharlie = MainFragmentDirections.mainToCharlie()
            Navigation.findNavController(it).navigate(navigateToCharlie)
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Snackbar.make(binding.root, "Çıkış Yapmak İstiyor Musunuz?", Snackbar.LENGTH_LONG).setAction("Evet") {
                    isEnabled = false
                    requireActivity().onBackPressed()
                }.show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

        return binding.root
    }

}
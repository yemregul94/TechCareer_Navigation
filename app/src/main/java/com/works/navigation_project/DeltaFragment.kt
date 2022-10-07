package com.works.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.works.navigation_project.databinding.FragmentDeltaBinding

class DeltaFragment : Fragment() {
    private lateinit var binding: FragmentDeltaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDeltaBinding.inflate(inflater, container, false)

        return binding.root
    }

}
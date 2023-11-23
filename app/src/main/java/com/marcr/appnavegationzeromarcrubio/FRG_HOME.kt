package com.marcr.appnavegationzeromarcrubio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.marcr.appnavegationzeromarcrubio.databinding.FragmentFRGHOMEBinding

class FRG_HOME  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFRGHOMEBinding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_FRG_HOME_to_FRG2, null)
        }
        return binding.root
    }
}

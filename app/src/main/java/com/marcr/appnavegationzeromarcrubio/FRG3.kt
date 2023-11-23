package com.marcr.appnavegationzeromarcrubio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.marcr.appnavegationzeromarcrubio.databinding.FragmentFRG2Binding
import com.marcr.appnavegationzeromarcrubio.databinding.FragmentFRG3Binding


class FRG3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFRG3Binding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_FRG3_to_FRG4, null)
        }
        return binding.root
    }

}
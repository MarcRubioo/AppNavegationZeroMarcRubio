package com.marcr.appnavegationzeromarcrubio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.marcr.appnavegationzeromarcrubio.databinding.FragmentFRG2Binding
import com.marcr.appnavegationzeromarcrubio.databinding.FragmentFRG4Binding

class FRG4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFRG4Binding.inflate(layoutInflater)
        return binding.root
    }
}
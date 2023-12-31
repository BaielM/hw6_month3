package com.example.hw61

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw6_month3.databinding.FragmentImageBinding

class ImageFragment : Fragment() {

    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

}
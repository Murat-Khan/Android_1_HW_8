package com.murat.android_1_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.murat.android_1_hw_8.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
  lateinit var  binding : FragmentSecondBinding
  lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)

            binding.detailName.text = navArgs.cinemaMy.cinemaName
            binding.detailGenre.text = navArgs.cinemaMy.cinemaGenre
            Glide.with(binding.detailImage).load(navArgs.cinemaMy.cinemaImage).into(binding.detailImage)



}


    }

}
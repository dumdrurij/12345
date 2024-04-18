package com.example.picasso.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.picasso.databinding.FragmentFirstBinding
import com.example.picasso.ui.adapters.MyAdapter

class FirstFragment:Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.fragmentButton?.setOnClickListener {
            Log.i("MY_TAG", "Ну раз нажали,получите)) ")
        }

            binding?.myList?.layoutManager = LinearLayoutManager(binding?.myList?.context?: requireContext())
            val myAdapter: MyAdapter = MyAdapter()
        binding?.myList?.adapter = myAdapter


        myAdapter.setData(listOf("String","Other string","Therd string"))

    }
}





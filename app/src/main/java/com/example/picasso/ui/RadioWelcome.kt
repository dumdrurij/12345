package com.example.picasso.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.picasso.databinding.WelcomeRadioBinding



class RadioWelcome: Fragment() {

    private var binding: WelcomeRadioBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = WelcomeRadioBinding.inflate(inflater, container, false)
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val radioList = listOf<Radio>(
            Radio(name = "name", country = "a"),
            Radio(name = "name", country = "s"),
            Radio(name = "name", country = "y"),
            Radio(name = "name", country = "d"),
            Radio(name = "name", country = "a"),
            Radio(name = "name", country = "s"),
            Radio(name = "name", country = "g"),
            Radio(name = "name", country = "d"),
            Radio(name = "name", country = "a"),
            Radio(name = "name", country = "s"),
            Radio(name = "name", country = "y"),
            Radio(name = "name", country = "k"),
            Radio(name = "name", country = "a"),
            Radio(name = "name", country = "s"),
            Radio(name = "name", country = "o"),
            Radio(name = "name", country = "i"),

            )
            val myAdapter: MyListAdapter = MyListAdapter()
            binding?.myList?.adapter = myAdapter
            myAdapter.setList(radioList)


    }

}

data class Radio(
        val name: String,
        val country: String,
        val image: String = "https://images.app.goo.gl/CEU38CNbYh11WRiY6",

    )
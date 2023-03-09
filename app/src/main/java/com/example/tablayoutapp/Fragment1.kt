package com.example.tablayoutapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val frag1 = inflater.inflate(R.layout.fragment_1, container, false)


        return frag1.rootView
    }

    companion object {

        @JvmStatic
        fun newInstance() =  Fragment1()

    }
}
package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class aboutme : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Sobre Nosotros"
        (activity as AppCompatActivity?)!!.supportActionBar!!.subtitle = "Alumnos"

        return inflater.inflate(R.layout.fragment_aboutme, container, false)
        setHasOptionsMenu(true);

    }

}

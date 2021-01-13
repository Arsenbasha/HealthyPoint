package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class inicio : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Leandro Paredes"
        (activity as AppCompatActivity?)!!.supportActionBar!!.subtitle = "Quienes somos"
        val options = navOptions {
            anim {
                enter = R.anim.entrar
                exit = R.anim.salir
                popExit = R.anim.derecha
                popEnter = R.anim.izquierda
            }
        }
        view.findViewById<Button>(R.id.back)?.setOnClickListener {
            findNavController().navigate(R.id.mainFragment, null, options)
        }
        view.findViewById<Button>(R.id.inicio_btn)?.setOnClickListener {
            findNavController().navigate(R.id.action_inicio_to_motionlayout, null, options)
        }
    }
}
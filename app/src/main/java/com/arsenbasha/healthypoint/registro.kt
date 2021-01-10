package com.arsenbasha.healthypoint

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class registro : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.registro, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.derecha
                exit = R.anim.salir
                popExit=R.anim.izquierda
                popEnter=R.anim.entrar

            }
        }
        view.findViewById<Button>(R.id.Registro2_btn)?.setOnClickListener {
            var nombre= view.findViewById<TextView>(R.id.userNameNewUser).text.toString()
            var apellido= view.findViewById<TextView>(R.id.ApellidoNewUser).text.toString()
            var mail= view.findViewById<TextView>(R.id.mailNewUser).text.toString()

            findNavController().navigate(R.id.action_registro_to_registro2, null, options)
        }
        view.findViewById<Button>(R.id.cancel_btn)?.setOnClickListener {
            findNavController().navigate(R.id.action_registro_to_mainFragment, null, options)
        }
    }


}

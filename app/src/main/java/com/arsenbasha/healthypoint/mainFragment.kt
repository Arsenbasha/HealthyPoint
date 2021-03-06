package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.navigation.ui.AppBarConfiguration


class mainFragment : Fragment() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Leandro Paredes"
        (activity as AppCompatActivity?)!!.supportActionBar!!.subtitle = "Inicio de sesión"
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.entrar
                exit = R.anim.salir
                popExit = R.anim.derecha
                popEnter = R.anim.izquierda
            }
        }
        view.findViewById<Button>(R.id.Registro_btn)?.setOnClickListener {
            findNavController().navigate(R.id.registro, null, options)
        }
        view.findViewById<Button>(R.id.Entrar_btn)?.setOnClickListener {
            Toast.makeText(context, "Inicio de session Correcto", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_mainFragment_to_inicio, null, options)
        }

    }

}




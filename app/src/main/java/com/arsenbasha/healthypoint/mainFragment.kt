package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class mainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
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
            findNavController().navigate(R.id.action_mainFragment_to_inicio, null, options)
        }
    }
}

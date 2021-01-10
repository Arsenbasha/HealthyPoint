package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class registro2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.registro2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.derecha
                exit = R.anim.salir
                popExit = R.anim.derecha
                popEnter = R.anim.izquierda

            }
        }
        view.findViewById<Button>(R.id.back_btn)?.setOnClickListener {
            findNavController().navigate(R.id.action_registro2_to_registro, null, options)
        }
        view.findViewById<Button>(R.id.RegistroEntrar_btn)?.setOnClickListener {
            findNavController().navigate(R.id.action_registro2_to_inicio, null, options)
        }
    }
}

package com.arsenbasha.healthypoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class list : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Leandro Paredes"
        (activity as AppCompatActivity?)!!.supportActionBar!!.subtitle = "Lista de entrenamiento"

        val view: View = inflater.inflate(R.layout.list, container, false)
        val arrayAdapter: ArrayAdapter<*>
        val diasSemana =
            mutableListOf("lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        val listaSemana = view.findViewById<ListView>(R.id.listaSemana)

        arrayAdapter =
            ArrayAdapter(view.context, android.R.layout.simple_expandable_list_item_1, diasSemana)
        listaSemana.adapter = arrayAdapter

        val options = navOptions {
            anim {
                enter = R.anim.entrar
                exit = R.anim.salir
                popExit = R.anim.derecha
                popEnter = R.anim.izquierda
            }
        }
        view.findViewById<Button>(R.id.backbtn)?.setOnClickListener {
            findNavController().navigate(R.id.action_motionlayout_to_inicio, null, options)
        }
        return view

    }


}
package com.arsenbasha.healthypoint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class inicio : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_inicio, container, false)
        val arrayAdapter: ArrayAdapter<*>
        val diasSemana =
            mutableListOf("lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        val listaSemana = view.findViewById<ListView>(R.id.listaSemana)

        arrayAdapter =
            ArrayAdapter(view.context, android.R.layout.simple_expandable_list_item_1, diasSemana)
        listaSemana.adapter =arrayAdapter
        return view
    }


}
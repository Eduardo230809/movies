package com.example.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.movies.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {
    lateinit var fBinding : FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentMenuBinding.inflate(layoutInflater)
        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fBinding.BtnClasificacion.setOnClickListener {
            it.findNavController().navigate(R.id.irAClasificacion)
        }
        fBinding.BtnPelicula.setOnClickListener {
            it.findNavController().navigate(R.id.irAPelicula)
        }
        fBinding.BtnGenero.setOnClickListener {
            it.findNavController().navigate(R.id.irAGenero)
        }
        fBinding.BtnIdioma.setOnClickListener {
            it.findNavController().navigate(R.id.irAIdioma)
        }
        fBinding.BtnNacionalidad.setOnClickListener {
            it.findNavController().navigate(R.id.irANacionalidad)
        }
    }
}
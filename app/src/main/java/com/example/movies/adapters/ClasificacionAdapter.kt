package com.example.movies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.ItemClasificacionBinding
import com.example.movies.models.ClasificacionItem

class ClasificacionAdapter (val clasificacionLista : List<ClasificacionItem>): RecyclerView.Adapter<ClasificacionAdapter.ClasificacionHolder>() {

    inner class ClasificacionHolder(val binding: ItemClasificacionBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(clasificacion: ClasificacionItem) {
            with(binding) {
                TxtAbreviacion.text = clasificacion.abreviacion
                TxtId.text = clasificacion.idClasificacion.toString()
                TxtNombre.text = clasificacion.nombre
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClasificacionHolder {
        val binding = ItemClasificacionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ClasificacionHolder(binding)
    }

    override fun onBindViewHolder(holder: ClasificacionHolder, position: Int) {
        holder.bind(clasificacionLista[position])
    }

    override fun getItemCount(): Int = clasificacionLista.size

}
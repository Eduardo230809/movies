package com.example.movies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.ItemNacionalidadBinding

import com.example.movies.models.NacionalidadItem

class NacionalidadAdapter (val nacionalidadLista : List<NacionalidadItem>): RecyclerView.Adapter<NacionalidadAdapter.NacionalidadHolder>() {

    inner class NacionalidadHolder(val binding: ItemNacionalidadBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(nacionalidad: NacionalidadItem) {
            with(binding) {
                TxtId.text = nacionalidad.idNacionalidad.toString()
                TxtNombre.text = nacionalidad.nombre
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NacionalidadHolder {
        val binding = ItemNacionalidadBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NacionalidadHolder(binding)
    }

    override fun onBindViewHolder(holder: NacionalidadHolder, position: Int) {
        holder.bind(nacionalidadLista[position])
    }

    override fun getItemCount(): Int = nacionalidadLista.size

}
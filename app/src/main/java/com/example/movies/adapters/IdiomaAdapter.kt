package com.example.movies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.ItemIdiomaBinding
import com.example.movies.models.IdiomaItem

class IdiomaAdapter (val idiomaLista : List<IdiomaItem>): RecyclerView.Adapter<IdiomaAdapter.IdiomaHolder>() {

    inner class IdiomaHolder(val binding: ItemIdiomaBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(idioma: IdiomaItem) {
            with(binding) {
                TxtId.text = idioma.idIdioma.toString()
                TxtNombre.text = idioma.nombre
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IdiomaHolder {
        val binding = ItemIdiomaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return IdiomaHolder(binding)
    }

    override fun onBindViewHolder(holder: IdiomaHolder, position: Int) {
        holder.bind(idiomaLista[position])
    }

    override fun getItemCount(): Int = idiomaLista.size

}
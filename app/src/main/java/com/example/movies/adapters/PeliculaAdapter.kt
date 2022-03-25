package com.example.movies.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.ItemPeliculaBinding
import com.example.movies.models.PeliculaItem

class PeliculaAdapter (val peliculaLista : List<PeliculaItem>): RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>() {

    inner class PeliculaHolder(val binding: ItemPeliculaBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(pelicula: PeliculaItem) {
            with(binding) {
                TxtClasificacion.text = pelicula.clasificacion
                TxtDuracion.text = pelicula.duracion
                TxtNacionalidad.text = pelicula.nacionalidad
                TxtSinopsis.text = pelicula.sinopsis
                TxtTipoMetraje.text = pelicula.tipoMetraje
                TxtTitulo.text = pelicula.titulo
                TxtId.text = pelicula.idPelicula.toString()

            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PeliculaHolder {
        val binding = ItemPeliculaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PeliculaHolder(binding)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.bind(peliculaLista[position])
    }

    override fun getItemCount(): Int = peliculaLista.size


}
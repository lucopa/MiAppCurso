package com.example.miappcurso.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miappcurso.R
import com.example.miappcurso.data.models.Films

class FilmsAdapter(
    private val filmsList: List<Films>,
    private val onClickListener: (Films) -> Unit,
    private val onClickDelete: (Int) -> Unit,
    private val onClickEdit: (Int) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return filmsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filmsList[position]
        holder.funcion(item, onClickListener, onClickDelete)

        holder.binding.botonEditar.setOnClickListener { onClickEdit(position) }
    }

}
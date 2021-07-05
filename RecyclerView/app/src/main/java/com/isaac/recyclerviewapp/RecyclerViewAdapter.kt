package com.isaac.recyclerviewapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.isaac.recyclerviewapp.databinding.ActivityDisplayBinding
import com.isaac.recyclerviewapp.databinding.ViewitemBinding

class RecyclerViewAdapter(var names: Array<MyData>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(var binding: ViewitemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int

    ): RecyclerViewAdapter.ViewHolder {
        val binding: ViewitemBinding = ViewitemBinding.inflate(
            LayoutInflater.from(parent.context)

        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        with(holder) {
            with(names[position]) {
                binding.nameTxt.text = name
                binding.surname.text = surname
                binding.image.setImageResource(names[position].image)

                holder.itemView.setOnClickListener {
                    Toast.makeText(
                        holder.itemView.context, "You clicked $name $surname",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }}












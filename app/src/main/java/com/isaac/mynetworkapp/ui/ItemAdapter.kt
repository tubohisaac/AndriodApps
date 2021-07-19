package com.isaac.mynetworkapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isaac.mynetworkapp.databinding.ItemlayoutBinding
import com.isaac.mynetworkapp.model.Item

class ItemAdapter(var items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemVH>() {
    class ItemVH(private val binding: ItemlayoutBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bindItem(item: Item) {
            binding.apply {
                txtid.text = item.id.toString()
                textName.text = item.name
                textPrice.text = item.price.toString()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemVH {
        val binding = ItemlayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ItemVH(binding)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemVH, position: Int) {
      holder.bindItem(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
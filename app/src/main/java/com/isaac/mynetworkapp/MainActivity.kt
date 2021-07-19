package com.isaac.mynetworkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.isaac.mynetworkapp.databinding.ActivityMainBinding
import com.isaac.mynetworkapp.ui.ItemAdapter
import com.isaac.mynetworkapp.ui.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        itemAdapter = ItemAdapter(listOf())
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.itemRv.apply{
            adapter = itemAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)

        }
           viewModel.run {
               getItems()
               userLiveData.observe(this@MainActivity, { items ->
                   itemAdapter.items = items
                   itemAdapter.notifyDataSetChanged()
               })
           }






    }
}
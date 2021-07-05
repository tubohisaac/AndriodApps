package com.isaac.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.recyclerviewapp.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {
    lateinit var binding : ActivityDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
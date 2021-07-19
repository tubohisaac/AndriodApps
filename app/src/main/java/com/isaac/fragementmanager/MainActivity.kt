package com.isaac.fragementmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.fragementmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
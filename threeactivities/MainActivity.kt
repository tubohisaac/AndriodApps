package com.isaac.threeactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.isaac.threeactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val myintent = Intent(this, Activity2::class.java)
            startActivity(myintent)}

            binding.toAct2Btn1.setOnClickListener {
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
            }
        }
    }
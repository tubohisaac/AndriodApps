package com.isaac.threeactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.threeactivities.databinding.Activity2Binding
import com.isaac.threeactivities.databinding.Activity3Binding

class Activity2 : AppCompatActivity() {

    lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val myintent2 = Intent( this, Activity3::class.java)
            startActivity(myintent2)}

            binding.toAct1Btn2.setOnClickListener {
                val anintent = Intent( this, MainActivity::class.java)
                startActivity(anintent)
            }
        }
    }

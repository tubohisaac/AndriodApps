package com.isaac.threeactivities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.isaac.threeactivities.databinding.Activity3Binding
import com.isaac.threeactivities.databinding.ActivityMainBinding


class Activity3 : AppCompatActivity() {

    lateinit var  binding:Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            val myintent3 = Intent(this,MainActivity::class.java)
            startActivity(myintent3)
        }
          binding.toAct2Btn.setOnClickListener {
              val anyintent = Intent(this,Activity2::class.java)
              startActivity(anyintent)
          }
    }
}
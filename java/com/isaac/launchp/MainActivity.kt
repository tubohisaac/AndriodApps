package com.isaac.launchp

import android.content.Intent
import android.content.pm.LauncherApps
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.isaac.launchp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.gksBtn.setOnClickListener {
            val gksURL = Intent(Intent.ACTION_VIEW)
            gksURL.data = Uri.parse("https://www.google.com/")
            startActivity(gksURL)

        }
    }

}




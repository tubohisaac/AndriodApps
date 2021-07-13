package com.isaac.PhoneBook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.PhoneBook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.run{
            displayfirstname.text = intent.getStringExtra("name" )
            displaysurname.text = intent.getStringExtra("surname")
            displayphonenumber.text = intent.getIntExtra("phonenumber", 0).toString()


        }

    }
}
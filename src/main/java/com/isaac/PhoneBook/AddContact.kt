package com.isaac.PhoneBook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.isaac.PhoneBook.data.Contact
import com.isaac.PhoneBook.data.ContactDatabase
import com.isaac.PhoneBook.databinding.ActivityAddContactBinding
import com.isaac.PhoneBook.viewmodel.ContactViewModel

class AddContact : AppCompatActivity() {
    private lateinit var binding: ActivityAddContactBinding
    private lateinit var contactViewModel: ContactViewModel
    private lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)


        database = ContactDatabase.getInstance(this)
        contactViewModel = ViewModelProvider(this)[ContactViewModel::class.java]

        binding.saveContactBtn.setOnClickListener {
            val firstname = binding.firstnameInput.text.toString()
            val surname = binding.surnameInput.text.toString()
            val phonenumber = binding.numberinput.text.toString().toInt()

            addContact(firstname, surname, phonenumber)
        }

    }

    private fun addContact(firstname: String, surname: String, phonenumber: Int) {
        val contact = Contact(id = 0, firstname, surname, phonenumber)
        contactViewModel.addContact(database, contact)

    }


}
//addContact()?.let { it1 -> database.contactDao().addContact()
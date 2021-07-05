package com.isaac.recyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isaac.recyclerviewapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object {

    }

    lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: RecyclerViewAdapter
    lateinit var names: Array<MyData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names: Array<MyData> = arrayOf(
            MyData("Alex", "Micheal", R.drawable.ic_face_child),
            MyData("Okonkwo", "Angela", R.drawable.ic__hair_day),
            MyData("Park", "David", R.drawable.ic_greeters_face),
            MyData("Jonathan", "Fashola", R.drawable.ic_zeimusu_face_),
            MyData("Olamide", "John", R.drawable.ic_personnage_femme),
            MyData("Alex", "Micheal", R.drawable.ic_face_child),
            MyData("Osifo", "Angela", R.drawable.ic_face_child),
            MyData("Joyce", "Johnson", R.drawable.ic__hair_day),
            MyData("Babatunde", "Fashola", R.drawable.ic__hair_day),
            MyData("Olamide", "John", R.drawable.ic_zeimusu_face_),
            MyData("Elijah", "Micheal", R.drawable.ic_greeters_face),
            MyData("Jessica", "Adams", R.drawable.ic_personnage_femme),
            MyData("Babatunde", "Fashola", R.drawable.ic_face3),
            MyData("Olamide", "John", R.drawable.ic_face1),
            MyData("Caleb", "Mike", R.drawable.ic_face8),
            MyData("Becky", "Sam", R.drawable.ic_zeimusu_face_),
            MyData("Cynthia", "Patrick", R.drawable.ic_face2),
            MyData("Darlinton", "Emeka", R.drawable.ic_greeters_face),
            MyData("Johnson", "Charles", R.drawable.ic_face9),
            MyData("Ifeanyi", "Okeke", R.drawable.ic_face1)

        )

        myAdapter = RecyclerViewAdapter(names)
        binding.recycler.adapter = myAdapter



    }


}

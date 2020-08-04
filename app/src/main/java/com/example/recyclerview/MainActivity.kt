package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // recyclerView_main.setBackgroundColor(color,BLUE)
        recyclerView_main.layoutMnanager=LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("Shary", "Omar", "Ally", "Moha", "Fayma", "Abu", "Jay", "Bahma", "Nasra"))
        val ageAdapter= AgeRecyclerViewAdapter(listOf(12,39,25,6,38,45,67,19,20,48))

        recyclerView_main.adapter = namesAdapter
    }
}

package com.example.entrega_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewItems)
        btnLogout = findViewById(R.id.btnLogout)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            Item("Pikachu", "Elemento electrico"),
            Item("Bolbasour", "Elemento Agua/Planta"),
            Item("Charizard", "Elemento Fuego")
        )

        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter

        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}



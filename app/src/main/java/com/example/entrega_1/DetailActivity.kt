package com.example.entrega_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName = findViewById<TextView>(R.id.tvItemName)
        val tvDescription = findViewById<TextView>(R.id.tvItemDescription)
        val btnBack = findViewById<Button>(R.id.btnBackToList)

        // Obtener datos del Intent
        val name = intent.getStringExtra("itemName")
        val description = intent.getStringExtra("itemDescription")

        tvName.text = name
        tvDescription.text = description

        // Volver a MainActivity
        btnBack.setOnClickListener {
            finish()
        }
    }
}

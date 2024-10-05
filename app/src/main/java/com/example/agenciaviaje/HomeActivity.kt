package com.example.agenciaviaje

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Lista de lugares (ejemplo)
        val places = listOf(
            Place("MACHU PICCHU", "Precio: S/.400", R.drawable.ga),
            Place("LA CATEDRAL DE AREQUIPA", "Precio: S/.120", R.drawable.gaa),
            Place("PLAZA DE ARMAS IQUITOS", "Precio: S/.250", R.drawable.gaaa)
        )

        // Configuración del RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_places)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PlacesAdapter(places)
    }
}

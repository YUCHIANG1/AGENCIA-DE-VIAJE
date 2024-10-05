package com.example.agenciaviaje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        // Configurar el padding para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Encontrar el botón de registro y configurar el clic
        val registerButton = findViewById<Button>(R.id.btnRegister)
        registerButton.setOnClickListener {
            // Mostrar un Toast que indica que el registro fue exitoso
            Toast.makeText(this, "¡REGISTRO EXITOSO!", Toast.LENGTH_SHORT).show()

            // Navegar a la actividad principal (HomeActivity) después de registrarse
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

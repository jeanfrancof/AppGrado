package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button;


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val botonRegistrarse: Button = findViewById(R.id.botonregistrarse)
        botonRegistrarse.setOnClickListener {
            val intent = Intent(this@MainActivity, Registro::class.java)
            startActivity(intent)
        }
    }
}

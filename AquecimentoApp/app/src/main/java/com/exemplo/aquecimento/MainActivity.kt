package com.exemplo.aquecimento

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Exercício 2: ponte XML -> código
        val btn = findViewById<Button>(R.id.btnTeste)

        // Exercício 3: Toast ao clicar
        btn.setOnClickListener {
            Toast.makeText(this, "oi", Toast.LENGTH_SHORT).show()
        }

        // CheckBox e Switch (exercício 5) e SeekBar (exercício 6)
        // já funcionam sozinhos, sem código adicional.
    }
}

package com.example.aquecimento

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Liga esta Activity ao layout activity_main.xml
        setContentView(R.layout.activity_main)

        // Tarefa 2: a ponte do XML para o código.
        // O R.id.btnTeste só existe porque o XML declarou android:id="@+id/btnTeste".
        val btn = findViewById<Button>(R.id.btnTeste)

        // Tarefa 3: reagir ao clique.
        // O bloco entre chaves só roda quando o usuário toca no botão.
        btn.setOnClickListener {
            Toast.makeText(this, "oi", Toast.LENGTH_SHORT).show()
        }

        // Tarefas 5 e 6: CheckBox, Switch e SeekBar existem só no XML.
        // Não precisam de código nenhum aqui para aparecer e funcionar na tela.
    }
}

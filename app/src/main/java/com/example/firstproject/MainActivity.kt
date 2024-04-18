package com.example.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCalcular: Button = findViewById<Button>(R.id.btnCalcular)
        val edtaltura: EditText = findViewById(R.id.edttext_altura)
        val edtpeso: EditText = findViewById(R.id.edttext_peso)


        btnCalcular.setOnClickListener {

            val alturaStr = edtaltura.text.toString()
            val pesoStr = edtpeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {

                val altura: Float = edtaltura.text.toString().toFloat()
                val alturafinal: Float = altura * altura
                val peso: Float = edtpeso.text.toString().toFloat()
                val result: Float = peso / alturafinal


                val intent = Intent(this, resultActivity2::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", result)
                    }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }


        }


    }
}

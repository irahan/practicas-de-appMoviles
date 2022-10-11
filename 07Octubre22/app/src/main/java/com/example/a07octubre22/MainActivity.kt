package com.example.a07octubre22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a07octubre22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            val np = binding.edProfesor.text.toString()
            val nm = binding.edMateria.text.toString()
            val resu = binding.edResumen.text.toString()
            val valor = binding.valor.rating

            openDetailActivity(np,nm,resu,valor)
        }
    }

    private fun openDetailActivity(np: String, nm:String, resu: String, valor: Float) {
     val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("nomprof",np)
        intent.putExtra("nommat",nm)
        intent.putExtra("nomresum",resu)
        intent.putExtra("nomvalor",valor)
        startActivity(intent)

    }
}
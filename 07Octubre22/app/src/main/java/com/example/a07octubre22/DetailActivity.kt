package com.example.a07octubre22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a07octubre22.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val nombre_profesor = bundle.getString("nomprof") ?: ""
        val nombre_materia = bundle.getString("nommat") ?: ""
        val resumen = bundle.getString("nomresum") ?: ""
        val valor = bundle.getFloat("nomvalor")

         binding.tvProfesor.text = nombre_profesor
        binding.tvMateria.text = nombre_materia
        binding.tvResumen.text = resumen
        binding.calif.rating = valor
    }
}
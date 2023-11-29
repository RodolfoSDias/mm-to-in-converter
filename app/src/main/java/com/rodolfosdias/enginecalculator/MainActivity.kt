package com.rodolfosdias.enginecalculator

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme



import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rodolfosdias.enginecalculator.databinding.ActivityMainBinding
import com.rodolfosdias.enginecalculator.ui.theme.EnginecalculatorTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val mm : Double = binding.medidaMm.text.toString().toDouble()
            val polegada: Double = String.format("%.4f", mm / 25.4).toDouble()


            binding.result.text = "${polegada} in"
        }
    }

}
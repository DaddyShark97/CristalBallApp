package com.example.cristalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvPrediction.setOnClickListener {
            binding.tvPrediction.text = getPrediction()
        }
    }
    private fun getPrediction(): String{
        return resources.getStringArray(R.array.prediction)[randomNumber()]
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.prediction).size - 1
        return (0..size).random()
    }
}
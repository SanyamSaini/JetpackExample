package com.sanyam.jetpack.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanyam.jetpack.example.databinding.ActivityWeatherBinding

class WeatherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}
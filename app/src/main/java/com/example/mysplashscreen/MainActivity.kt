package com.example.mysplashscreen

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.helloTextView)
    }

    fun changeLanguage(view: View) {
        val language = when (view.id) {
            R.id.englishButton -> "English"
            R.id.spanishButton -> "Spanish"
            R.id.frenchButton -> "French"
            R.id.germanButton -> "German"
            R.id.italianButton -> "Italian"
            else -> "Unknown"
        }

        // Implement language change logic here
        updateHelloText(language)
    }

    private fun updateHelloText(language: String) {
        helloTextView.text = "Hello, World! ($language)"
    }
}

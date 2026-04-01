package com.example.multiplicationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Created variables for the buttons and text input
        val multiplybtn = findViewById<Button>(R.id.multiplyBtn)
        val numTxtInput = findViewById<EditText>(R.id.numTxtInput)
        // Created an on click listener for the multiply button
        multiplybtn.setOnClickListener {
            // Created an intent to go to the next activity
            val intent = Intent(this, MainActivity2::class.java)
            // Added the table number to the intent
            intent.putExtra("tableNumber", numTxtInput.text.toString())
            startActivity(intent)

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
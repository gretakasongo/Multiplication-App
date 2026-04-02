package com.example.multiplicationapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        // assigning data from intent to a variable
        val bundle: Bundle? = intent.extras
        // getting the table number from the intent
        val tableString: String? = bundle?.getString("tableNumber")
        // converting the table number to an integer
        val tableNumber = tableString!!.toInt()
        val Table = findViewById<TextView>(R.id.Table)
        var timesDisplay: String ="$tableNumber x table\n\n"
        // creating counter for while loop
        var count = 1
        // setting the text of the table to the table number
        Table.text = timesDisplay
        // while loop to display the table
        while (count <=10){
            //example: user enters 5 and count is 1 SO: 5 x 1 = 5 (answer)
            val answer = tableNumber * count
            /*display as:
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
             */
            timesDisplay += "$tableNumber x $count = $answer\n"
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
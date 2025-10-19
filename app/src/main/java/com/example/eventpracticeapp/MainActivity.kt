package com.example.eventpracticeapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Declare UI components
    private lateinit var etName: TextInputEditText
    private lateinit var etAge: TextInputEditText
    private lateinit var btnSubmit: Button
    private lateinit var tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        btnSubmit = findViewById(R.id.btnSubmit)
        tvOutput = findViewById(R.id.tvOutput)

        // Set click listener for Submit button
        btnSubmit.setOnClickListener {
            handleSubmit()
        }
    }

    private fun handleSubmit() {
        // Get input values
        val name = etName.text.toString().trim()
        val ageInput = etAge.text.toString().trim()

        // Validate that fields are not empty
        if (name.isEmpty() || ageInput.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            return
        }

        // Validate age input with try-catch
        try {
            val age = ageInput.toInt()

            // Additional validation for reasonable age range
            if (age < 1 || age > 150) {
                Toast.makeText(this, "Please enter a valid age (1-150)", Toast.LENGTH_SHORT).show()
                return
            }

            // Display success message
            val message = "Name: $name\nAge: $age years old"
            tvOutput.text = message
            Toast.makeText(this, "Information submitted successfully!", Toast.LENGTH_SHORT).show()

        } catch (e: NumberFormatException) {
            // Handle invalid age input
            Toast.makeText(this, "Please enter a valid number for age", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.praktikumjobsheet1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = "Hai"

        buttonButton.setOnClickListener {
            val name = nameEditText.text.toString()
            buttonTextView.text = "Hai $name ganteng"
        }
    }
}
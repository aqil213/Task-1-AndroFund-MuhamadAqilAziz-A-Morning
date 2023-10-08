package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class masuk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val textview = findViewById<TextView>(R.id.text).apply {
            text = message
        }
    }
}

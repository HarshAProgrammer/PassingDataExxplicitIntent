package com.example.passingdataexplicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val first = findViewById<EditText>(R.id.firstOrder)
        val second = findViewById<EditText>(R.id.secondOrder)
        val button = findViewById<Button>(R.id.btnSend)

        button.setOnClickListener {

        }


    }
}
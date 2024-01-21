package com.example.passingdataexplicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val order = findViewById<TextView>(R.id.receivedOrder)

        val orderOfCustomers = intent.getStringExtra("Order")

        order.text = orderOfCustomers.toString()




    }
}
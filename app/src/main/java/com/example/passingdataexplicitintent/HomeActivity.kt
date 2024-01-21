package com.example.passingdataexplicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {

    // creating key
    companion object{

    const val KEY = "com.example.passingdataexplicitintent.HomeActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        val first = findViewById<EditText>(R.id.firstOrder)
        val second = findViewById<EditText>(R.id.secondOrder)
        val third = findViewById<EditText>(R.id.thirdOrder)
        val fourth = findViewById<EditText>(R.id.fourthOrder)
        val button = findViewById<Button>(R.id.btnSend)

        button.setOnClickListener {

            val message = first.text.toString() + " " +second.text.toString() + " " +third.text.toString() + " " +
                    fourth.text.toString()

            val intent = Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("Order",message)
            startActivity(intent)


        }


    }
}


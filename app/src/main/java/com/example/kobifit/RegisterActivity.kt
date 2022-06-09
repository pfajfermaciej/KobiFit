package com.example.kobifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val textLogIntent = findViewById<TextView>(R.id.textLoginNow)
        //val createAccIntent = findViewById<Button>(R.id.createAccButton)

        //przejscie z rejestracji do login activity
        textLogIntent.setOnClickListener {

            val textLoginInt = Intent(this, LoginActivity::class.java)
            startActivity(textLoginInt)
        }

        //utworz konto activity
        /*createAccIntent.setOnClickListener {

            val createAccountInt = Intent(this, CreateAccountActivity::class.java)
            startActivity(createAccountInt)
        }
         */

    }
}
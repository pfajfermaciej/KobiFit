package com.example.kobifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val regIntent = findViewById<TextView>(R.id.textRegister)
        val logIntent = findViewById<Button>(R.id.loginButton)
        val forPassInt = findViewById<TextView>(R.id.textForgetPass)

        //przejscie do register activity
        regIntent.setOnClickListener {

            val registerInt = Intent(this, RegisterActivity::class.java)
            startActivity(registerInt)

        }

        //przejscie do glownego menu zaraz po zalogowaniu
        logIntent.setOnClickListener {

            val loginInt = Intent(this, MainActivity::class.java)
            startActivity(loginInt)

        }

        //przejscie do forgot password activity
        forPassInt.setOnClickListener {

            val forgetPasswordInt = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(forgetPasswordInt)
        }


        // zwrocic uwage na kolor pasku gornego na telefonie(kolor taki sam jak aplikacji i klawisze funkcyjjne w tele

    }
}
package com.example.kobifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager


class SplashScreen : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)


        handler = Handler()
        handler.postDelayed({

            val intentSplash = Intent(this, LoginActivity::class.java)
            startActivity(intentSplash)
            finish()
        }, 3000) //opoznienie 3sec do przejscia do login activity
    }
}
package com.example.akshayapatra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val logo = findViewById<ImageView>(R.id.splash_logo)
        val text = findViewById<TextView>(R.id.splash_text)

        val topanim = AnimationUtils.loadAnimation(this, R.anim.topani)
        val botani= AnimationUtils.loadAnimation(this, R.anim.bottt)
        logo.startAnimation(topanim)
        text.startAnimation(botani)

        topanim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
               val intent = Intent(applicationContext,MainActivity::class.java)
                startActivity(intent)
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })
    }
}
package com.example.zadanie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kolejny = findViewById<Button>(R.id.bt1)
        val poprzedni = findViewById<Button>(R.id.poprzedni)
        var zdj = 0;


        kolejny.setOnClickListener {
            zdj++
            if (zdj == 1) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__2_)
            } else if (zdj == 2) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.images)
            } else if (zdj == 3) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__1_)
            } else if (zdj == 4) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane)
            } else if (zdj == 0) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__2_)
                zdj = 1;
            } else if (zdj == 5) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__2_)
                zdj = 1;
            }

        }

        poprzedni.setOnClickListener {
            zdj--
            if (zdj == 1 || zdj == 0) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__2_)
                zdj = 4
            } else if (zdj == 2) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.images)
            } else if (zdj == 3) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane__1_)
            } else if (zdj == 4) {
                findViewById<ImageView>(R.id.img).setImageResource(R.drawable.pobrane)
            }
        }
            val osx = findViewById<Button>(R.id.bt)
            osx.setOnClickListener {
            val dane = findViewById<EditText>(R.id.skala).toString().toInt()
            findViewById<ImageView>(R.id.img).setRotationX(dane.toFloat())
        }
    }
}
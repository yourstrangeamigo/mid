package com.kamila.kemelmidterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val exit = findViewById<TextView>(R.id.textView3)
        exit.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }
    }
}
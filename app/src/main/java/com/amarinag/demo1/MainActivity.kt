package com.amarinag.demo1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btn_next)
        val info: TextView = findViewById(R.id.tv_info)
        info.text = getString(R.string.username)

        btnNext.setOnClickListener {
            Log.d("AMG", "Buton pulsado")
            Toast.makeText(this@MainActivity, "btn clicked", Toast.LENGTH_SHORT).show()
        }
    }
}


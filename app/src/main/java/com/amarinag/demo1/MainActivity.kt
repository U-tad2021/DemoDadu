package com.amarinag.demo1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btn_next)

        btnNext.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d("AMG", "Buton pulsado")
                Toast.makeText(this@MainActivity, "btn clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, HelloWorldActivity::class.java)
                startActivity(intent)
            }

        })
        /*
        btnNext.setOnClickListener {
            Log.d("AMG", "Buton pulsado")
            Toast.makeText(this@MainActivity, "btn clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, HelloWorldActivity::class.java)
            startActivity(intent)
        })
        */

    }
}


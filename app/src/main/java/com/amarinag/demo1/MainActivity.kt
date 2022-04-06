package com.amarinag.demo1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AMG", "onCreate()")

        val btnNext: Button = findViewById(R.id.btn_next)
        val tvTitle: TextView = findViewById(R.id.tv_title)
        val etUsername: EditText = findViewById(R.id.et_name)

        tvTitle.setOnClickListener {
            etUsername.setText("Username secure")
        }
        etUsername.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                etUsername.setText("Username secure")
                return true
            }

        })

        btnNext.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val text = etUsername.text.toString()
                Log.d("AMG", "Buton pulsado $text")
                Toast.makeText(this@MainActivity, "btn clicked  $text", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, HelloWorldActivity::class.java)
                intent.putExtra(EXTRA_CONTROL, "DADU")
                intent.putExtra(EXTRA_AGE, 56)
                intent.putExtra(EXTRA_USERNAME, text)
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

    override fun onStart() {
        super.onStart()
        Log.d("AMG", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AMG", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AMG", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AMG", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AMG", "onDestroy()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("AMG", "onRestart()")
    }
}


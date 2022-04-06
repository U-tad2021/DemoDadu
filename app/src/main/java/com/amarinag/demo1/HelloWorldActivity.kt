package com.amarinag.demo1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_CONTROL = "extra_control"
const val EXTRA_AGE = "extra_age"
const val EXTRA_USERNAME = "extra_username"

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        val control = intent.extras?.getString(EXTRA_CONTROL)
        val age = intent.extras?.getInt(EXTRA_AGE)
        val username = intent.extras?.getString(EXTRA_USERNAME)
        val tvHello: TextView = findViewById(R.id.tv_hello)

        Log.d("AMG", "age: $age")
        Log.d("AMG", "control: $control")
        Log.d("AMG", "username: $username")
        Log.d("AMG", "username: $username <> age: $age")
        Toast.makeText(this, "control digits: $control", Toast.LENGTH_SHORT).show()

        tvHello.setText(getString(R.string.welcome_username_age, username, age))
        //tvHello.setText("Username: $username <> Age: $age")


    }
}
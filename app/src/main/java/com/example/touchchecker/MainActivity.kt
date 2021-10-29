package com.example.touchchecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    private lateinit var globalTouchService: Intent
    private lateinit var touchCheckerSwitch: SwitchCompat

    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchCheckerSwitch = findViewById(R.id.touchCheckerSwitch)

        globalTouchService = Intent(this, GlobalTouchService::class.java)

        touchCheckerSwitch.setOnCheckedChangeListener { _, b ->
            if (b) showToast("on") else showToast("off")
        }
    }

    private fun showToast(word: String) {
        toast?.cancel()

        toast = Toast.makeText(applicationContext, "Touch checker is $word", Toast.LENGTH_SHORT)
        toast?.show()
    }

    private fun 
}
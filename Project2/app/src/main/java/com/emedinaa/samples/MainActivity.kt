package com.emedinaa.samples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            goToScreen02()
        }

        button2.setOnClickListener {
            goToScreen03()
        }
    }

    private fun goToScreen02(){
        val intent= Intent(this, Screen02Activity::class.java)
        startActivity(intent)
    }

    private fun goToScreen03(){
        val intent= Intent(this, Screen03Activity::class.java)
        startActivity(intent)
    }
}

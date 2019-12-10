package com.emedinaa.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen03.*

class Screen03Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen03)


        button.setOnClickListener {
            back()
        }
    }

    private fun back(){
        finish()
    }
}

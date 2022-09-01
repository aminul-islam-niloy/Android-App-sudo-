package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter


class Spinner : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val spin = findViewById<android.widget.Spinner>(R.id.spinId)
        val fruits= arrayOf("Apple","Orange","Lime","Banana","Mango","Lichi","JackFoot","Grapes")
        val arrayAdp= ArrayAdapter(this@Spinner,android.R.layout.simple_dropdown_item_1line,fruits)
        spin.adapter=arrayAdp
    }
}
package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast

class ToastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_page)

        val btnS= findViewById<Button>(R.id.bStoast)
        val btnL= findViewById<Button>(R.id.bLtoast)
        val btnC= findViewById<Button>(R.id.bCtoast)

        btnS.setOnClickListener {
            Toast.makeText(this@ToastPage,"This is Short toast Message !",Toast.LENGTH_SHORT).show()
        }
        btnL.setOnClickListener {
            Toast.makeText(this@ToastPage,"This is Long toast Message !",Toast.LENGTH_LONG).show()
        }
        btnC.setOnClickListener {
            Toast.makeText(this@ToastPage,"This is Custom toast Message !",Toast.LENGTH_SHORT).show()
        }


    }


}
package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class DifferentSwitch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_differents_switch)
        val swt= findViewById<Switch>(R.id.switch1)

        swt.setOnClickListener{
            if(swt.isChecked)
                Toast.makeText(this@DifferentSwitch,"Switch On",Toast.LENGTH_SHORT).show()
        else
                Toast.makeText(this@DifferentSwitch,"Switch Off",Toast.LENGTH_SHORT).show()
        }


    }
}
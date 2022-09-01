package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        val click = findViewById<Button>(R.id.chackClickbtn1)
        val cOne= findViewById<CheckBox>(R.id.checkBox1)
        val cTwo = findViewById<CheckBox>(R.id.checkBox2)

        click.setOnClickListener {
            if(cOne.isChecked && cTwo.isChecked){
                Toast.makeText(this@CheckBox,"Java + Kotlin",Toast.LENGTH_SHORT).show()
            }
            else if(cOne.isChecked){
                Toast.makeText(this@CheckBox,"Java",Toast.LENGTH_SHORT).show()
            }
            else if(cTwo.isChecked){
                Toast.makeText(this@CheckBox,"Kotlin",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this@CheckBox,"Nothing is Selected! ",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
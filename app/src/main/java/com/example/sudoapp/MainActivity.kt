package com.example.sudoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val intent=Intent(this@MainActivity,InputOutput::class.java)
            startActivity(intent)
        }

        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            val intent=Intent(this@MainActivity,ToastPage::class.java)
            startActivity(intent)
        }

        val btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener {
            val intent=Intent(this@MainActivity,ButtonStyle::class.java)
            startActivity(intent)
        }

        val btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener {
            val intent=Intent(this@MainActivity,CheckBox::class.java)
            startActivity(intent)
        }

        val btn7 = findViewById<Button>(R.id.button7)
        btn7.setOnClickListener {
            val intent=Intent(this@MainActivity,Spinner::class.java)
            startActivity(intent)
        }

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener {
            val intent=Intent(this@MainActivity,DifferentSwitch::class.java)
            startActivity(intent)
        }

        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent=Intent(this@MainActivity,ProgressingBar::class.java)
            startActivity(intent)
        }

        val btn10= findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent=Intent(this@MainActivity,ScroolView::class.java)
            startActivity(intent)
        }

        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent=Intent(this@MainActivity,ParagraphView::class.java)
            startActivity(intent)
        }

    }
}
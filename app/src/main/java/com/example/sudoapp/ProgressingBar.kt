package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class ProgressingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progressing_bar)

        val progressBar= findViewById<ProgressBar>(R.id.progressBar)
        val clickbtn= findViewById<Button>(R.id.progressclickbtn)

        clickbtn.setOnClickListener {
            var barStatus =0
            Thread(Runnable { while (barStatus<100){
                barStatus +=1
                try {
                    Thread.sleep(20)
                    progressBar.progress = barStatus
                }
                catch ( exp: InterruptedException){
                    exp.printStackTrace()
                }
            }
            }).start()
        }

    }
}
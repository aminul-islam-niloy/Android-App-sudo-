package com.example.sudoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class ScroolView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrool_view)

        val listview= findViewById<ListView>(R.id.listview)
        val fruits= arrayOf("alex","Amanadil","Lucifer","Ragnar","Jack","Jones","Eiver","Bion","Tom","Nil Armstone","Faminin","emini","Bieber","Maron","Herry Style","Imran","Atif","Moin")
        val adp= ArrayAdapter(this@ScroolView,android.R.layout.simple_list_item_1,fruits)
        listview.adapter=adp

        listview.setOnItemClickListener { parent,view,position,id->
            Toast.makeText(this@ScroolView,"Item Clicked:-$id",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var text1: EditText
    lateinit var text2:EditText
    lateinit var bButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text1=findViewById(R.id.Text1)
        text2=findViewById(R.id.Text2)
        bButton=findViewById(R.id.button)
        bButton.setOnClickListener{
            val name= text1.text.toString()
            val name2=text2.text.toString()
            Toast.makeText(applicationContext,  "$name , $name2", Toast.LENGTH_SHORT).show()
        }

    }
}
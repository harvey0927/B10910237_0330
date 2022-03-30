package com.example.b10910237_0330

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var v1:TextView=findViewById<TextView>(R.id.textView)
        v1.text="Hello World!"
        var b1:Button=findViewById(R.id.button)


    }
}
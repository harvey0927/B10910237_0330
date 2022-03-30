package com.example.b10910237_0330

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var v1:TextView=findViewById<TextView>(R.id.textView)
        v1.text="Hello World!"
        var b1:Button=findViewById<Button>(R.id.button)
        var img1: ImageView=findViewById<ImageView>(R.id.imageView)
        findViewById<Button>(R.id.button).setOnClickListener {
            img1.visibility=View.GONE
        }




    }
}
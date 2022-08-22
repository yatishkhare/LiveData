package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var timer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer = findViewById(R.id.textView)

        val viewModel = ViewModelProvider(this ).get(MainViewModel::class.java)

        viewModel.startTimer()
        viewModel.seconds().observe(this, Observer {
            timer.text = it.toString()
        })
    }

}
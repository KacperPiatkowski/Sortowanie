package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var brute: TextView
    private lateinit var KMP: TextView
    private lateinit var BM: TextView
    private lateinit var RK: TextView
    private lateinit var wykonaj: Button
    private lateinit var ilerazy: EditText
    private lateinit var ileelementow: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
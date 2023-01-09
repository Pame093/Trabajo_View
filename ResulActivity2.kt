package com.example.saludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class ResulActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resul2)
        val btnBack= findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener { getAndShowName() }
    }
    fun getAndShowName(){
        val bundle= intent.extras
        val name = bundle?.get("INTENT_NAME")
        val tvGreeting= findViewById<TextView>(R.id.tvGreeting)
        tvGreeting.text = "Bienvenido $name"
       


    }

}
package com.example.saludar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowName= findViewById<Button>(R.id.btnShowName)
        btnShowName.setOnClickListener { checkValue() }
    }
    fun checkValue(){
        val etName= findViewById<EditText>(R.id.etName)
        if(etName.text.isEmpty()){
            val intent = Intent(this, ResulActivity2::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
        }else{
            showErrorName()
        }
    }
    fun showErrorName(){
        Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()

    }




}
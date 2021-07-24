package com.example.birthdayapp


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdayapp.R.id.birthdayGreetings


class BirthdayGreet : AppCompatActivity() {
    /*companion object{
        const val inputName = "input_name"
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
        val name = intent.getStringExtra("name")

        val text = findViewById<View>(R.id.birthdayGreetings) as TextView
        text.text = "$name!"


        //birthdayGreetings.text = "Happy Birthday $name"
       //val name = intent.getStringExtra(inputName)


    }
}
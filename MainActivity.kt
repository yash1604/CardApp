package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.birthdayapp.R.id.PersonName
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun nextScreen(view: View) {

         val text = findViewById<View>(R.id.PersonName) as EditText
         val name = text.text.toString()

         // val name: String = PersonName.getText().toString()
        // Toast.makeText(this,"button clicked by  $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this,BirthdayGreet::class.java)
       // intent.putExtra(BirthdayGreet.inputName, "name")
          intent.putExtra("name",name)
        startActivity(intent)
    }

}



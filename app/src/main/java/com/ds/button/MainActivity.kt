package com.ds.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Button


const val EXTRA_MESSAGE = "com.ds.button.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button:Button = findViewById<Button>(R.id.button)
    }



fun sendMessage(view:View) {
    val editText = findViewById<EditText>(R.id.editTextTextPersonName)
    val message = editText.text.toString()
    val intent = Intent(this, DisplayMessageActivity::class.java).apply{
        putExtra(EXTRA_MESSAGE, message)
    }
    startActivity(intent)
}

}

package com.ds2.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

const val EXTRA_MESSAGE = "com.ds2.helloworld.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View)
    {
        //Executa ao clicar no botão submit / enviar
        "variavel <= Objeto no Layout"
        val editTextMessage  = findViewById<EditText>(R.id.editTextMessage)
        val message = editTextMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /*Comentário*/
}
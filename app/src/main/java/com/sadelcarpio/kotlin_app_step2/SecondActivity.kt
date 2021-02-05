package com.sadelcarpio.kotlin_app_step2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras //el bundle es una clase usada para pasar datos entre actividades
        val msg = bundle!!.getString("user_message") //se usa !! porque su clase es ?, de la primera actividad

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() //es lo mismo que ponerlo en main
        txvUserMessage.text = msg //muestra el texto de la primera actividad en la segunda
    }
}
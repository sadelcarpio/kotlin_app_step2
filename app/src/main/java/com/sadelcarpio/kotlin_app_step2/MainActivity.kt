package com.sadelcarpio.kotlin_app_step2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // IMPORTANTE, importa los views del xml

class MainActivity : AppCompatActivity() { //punto de entrada de la aplicación
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //si no reconoce el boton pon alt + enter para importar las librerías
        btnShowToast.setOnClickListener {
            // Código
            //Log.i("MainActivity", "Button was clicked !") //alt + enter para importar las librerías
            // El Log es visible solo en el logcat, para visualizar:
            // (como si fuera un anuncio breve, toast message)
            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            Toast.makeText(this, "Second Button was clicked !", Toast.LENGTH_SHORT).show()

            val message: String = etUserMessage.text.toString() //convierte el texto ingresado a string
        }
    }
}
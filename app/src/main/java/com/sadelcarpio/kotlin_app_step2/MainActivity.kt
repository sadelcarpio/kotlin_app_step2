package com.sadelcarpio.kotlin_app_step2

import android.content.Intent
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
            val message: String = etUserMessage.text.toString() //convierte el texto ingresado a string
            //Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java) //intento de pasar de una
            //actividad a otra, con ::class.java se llama a una clase de java en kotlin (?)

            intent.putExtra("user_message", message) //key (primer argumento) es un identificador

            startActivity(intent) //Explicit intent, este comando solo pasa a la siguiente actividad, no
            //pasa los datos
        }

        btnShare.setOnClickListener {
            val message: String = etUserMessage.text.toString() //convierte el texto ingresado a string
            val intent = Intent()  //no tiene argumentos porque no sabemos a dónde nos llevará
            intent.action = Intent.ACTION_SEND //propiedad de enviar
            intent.putExtra(Intent.EXTRA_TEXT, message) //el key predefinido es Intent.EXTRA_TEXT (reconocible por otras apps)
            intent.type = "text/plain" //tipo de dato a compartir

            startActivity(Intent.createChooser(intent, "Compartir en :")) //muestra la ventana de compartir
        }
    }
}
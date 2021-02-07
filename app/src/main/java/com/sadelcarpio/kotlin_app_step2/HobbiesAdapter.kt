package com.sadelcarpio.kotlin_app_step2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentHobby: Hobby? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, "Clickeaste " + currentHobby!!.title, Toast.LENGTH_SHORT).show()
            }

            itemView.imgShare.setOnClickListener {
                val message: String = "Mi hobby es: " + currentHobby!!.title //convierte el texto ingresado a string
                val intent = Intent()  //no tiene argumentos porque no sabemos a dónde nos llevará
                intent.action = Intent.ACTION_SEND //propiedad de enviar
                intent.putExtra(Intent.EXTRA_TEXT, message) //el key predefinido es Intent.EXTRA_TEXT (reconocible por otras apps)
                intent.type = "text/plain" //tipo de dato a compartir

                context.startActivity(Intent.createChooser(intent, "Compartir en :")) //muestra la ventana de compartir
            }
        }

        fun setData(hobby: Hobby?, pos: Int) {
            itemView.txvTitle.text = hobby!!.title

            this.currentHobby = hobby
            this.currentPosition = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
}
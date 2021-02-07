package com.sadelcarpio.kotlin_app_step2

data class Hobby(var title: String)

object Supplier { //da los hobbies a mostrar en el recycleview

    val hobbies = listOf<Hobby>(
            Hobby("Nadar"),
            Hobby("Correr"),
            Hobby("Fútbol"),
            Hobby("Basket"),
            Hobby("Dibujo"),
            Hobby("Leer"),
            Hobby("Pintura"),
            Hobby("Programar"),
            Hobby("Bailar"),
            Hobby("Nadar"),
            Hobby("Correr"),
            Hobby("Fútbol"),
            Hobby("Basket"),
            Hobby("Dibujo"),
            Hobby("Leer"),
            Hobby("Pintura"),
            Hobby("Programar"),
            Hobby("Bailar")
    )

}
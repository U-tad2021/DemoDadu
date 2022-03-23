package com.amarinag.demo1


interface Vehicle {
    val wheels: Int
}

class Car(val doors: Int = 4, var window: Int = 9, override val wheels: Int = 8) : Vehicle

fun main() {
    val myCar = Car()
    val myCar2 = Car(5)
    val myCar3 = Car(window = 6)


    println("myCar ${myCar.toString()}")
    println("myCar2 ${myCar2.toString()}")
    println("myCar3 ${myCar3.toString()}")


    val anon = Anon("name", "lastName")

    println("anon: $anon")
    println("anon name: ${anon.name}")
}
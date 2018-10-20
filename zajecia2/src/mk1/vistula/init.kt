package mk1.vistula

import mk1.vistula.Colour.*

data class Person(val name: String, val age: Int? = null) {
    override fun toString():String{
        return this.name
    }
}

fun main(args:Array<String>) {
    printTheOldest()
    println(max(5,7))
    println(YELLOW.rgb())
}

fun findTheOldest(): Person? {
    val theOldest = people.maxBy { it.age ?: 0 }
    return theOldest
}

fun printTheOldest() {
    println("Najstarszy to : ${findTheOldest()}")
}


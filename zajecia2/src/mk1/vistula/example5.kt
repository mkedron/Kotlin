package mk1.vistula
import mk1.vistula.Colour.*

fun main(args: Array<String>) {
    exercise5()

}

private fun exercise1() {
    println("n = $n")
    println(lang)
    lang.forEach { printLang(it) }
    println(lang.size)
    lang.set(1, "Scala")
    println("Zmiana języka")
    lang.forEach { printLang(it) }
}

private fun printLang(it: String) {
    println("Kolejny język to : $it")
}

private fun exercise2() {
    println(names)
    val newNames = names.plus("Micky")
    println(newNames)
}


private fun exercise3() {
    val rec1 = Rectangle(3,3)
    val rec2 = Rectangle(5,8)

    println(rec1.isSquare)
    println(rec2.field)
    val field2 = rec2.field
    rec2.length=2
    println(field2)
    println(rec2.field)
}

class Rectangle(var width: Int, var length: Int) {
    val isSquare: Boolean
    get() = width == length

    val field: Int
    get() = width*length
}

private fun exercise4() {
    println(Colour.BLUE.rgb())
    println(BLUE.rgb())

}

fun miks(c1: Colour, c2: Colour) = when( setOf<Colour>(c1,c2)) {
    setOf(RED,YELLOW) -> ORANGE
    setOf(YELLOW,BLUE) -> GREEN
    setOf(BLUE,VIOLET) -> INDIGO
    else -> throw Exception("Dirty colour")
}

fun miksSet(colours:Set<Colour>) = when( colours ) {
    setOf(RED,YELLOW) -> ORANGE
    setOf(YELLOW,BLUE) -> GREEN
    setOf(BLUE,VIOLET) -> INDIGO
    else -> throw Exception("Dirty colour")
}
private fun exercise5() {
    println(miks(RED,YELLOW))
//    println(miks(RED,RED))
    println(miksSet(setOf(YELLOW,BLUE)))
    println(miksSet(setOf(YELLOW,BLUE,BLUE)))
    val colours1 = setOf<Colour>(YELLOW, GREEN)
    val colours2 = setOf<Colour>(YELLOW,YELLOW,GREEN)
    println(colours1.size)
    println(colours2.size)

}
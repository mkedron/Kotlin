package mk1.vistula

import sun.security.krb5.KrbException

val lang = arrayOf<String>("Kotlin", "Java")
val people = listOf<Person>(Person("Al"), Person("Paul", 14), Person("Mike", 13))

val n = 5

val names = people.map { person -> person.name }

enum class Colour(val r: Int, val g: Int, val b: Int) {
    RED(255,0,0), ORANGE(255,165,0), YELLOW(255,255,0),
    GREEN(0,255,0), BLUE(0,0,255), INDIGO(75,0,130),
    VIOLET(238,130,238);
    fun rgb() = (r*256+g)*256+b
}
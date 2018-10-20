package z2.kotlin.mkedron

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know !"
}

fun String.lastChar(): Char = this.get(this.length-1)
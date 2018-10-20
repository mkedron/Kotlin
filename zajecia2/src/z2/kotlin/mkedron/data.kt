package z2.kotlin.mkedron

val number = 76
val percent =
        if(number in 1..100) {
            number
        } else {
            throw IllegalArgumentException("Percent has to be between 1 and 100 !")
        }

val list = listOf(1,4,5,3)
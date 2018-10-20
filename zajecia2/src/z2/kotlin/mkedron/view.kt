package z2.kotlin.mkedron

open class View {
    open fun click() = println("View klikniety")
}
class Button: View() {
    override fun click() = println("Button klikniety")
}

fun View.showOff() = println("View showniety")

//fun Button.showOff() = println("Button showniety")
package z2.kotlin.mkedron

fun main(args: Array<String>) {
    println("Hello World");

    println(recognize('8'));
    println(recognize('d'));
    println(recognize('$'));
    println(recognize('A'));

    println("Percent is : $percent%");

    println(joinToString(list," * ","<<",">>"))
    println(joinToString(list,prefix = "<<",postfix = ">>"))

    println("Dzien dobry".lastChar())

    var button = Button()
    var view = View()

    println(button.click())
    println(view.click())
    println(button.showOff())
    println(view.showOff())
}
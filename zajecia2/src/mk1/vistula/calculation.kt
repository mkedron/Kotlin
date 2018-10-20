package mk1.vistula

interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr) :Int {
    if(e is Num) {
        return e.value
    }
    if(e is Sum) {
        return eval(e.left)+ eval(e.right)
    }
    throw IllegalArgumentException("Unknown argument type")
}

private val sum = Sum(Num(1), Sum(Num(2), Num(3)))

fun main(args: Array<String>) {
    println(eval(sum))
    val tmp: Expr = Num(1)
    println(tmp)
}
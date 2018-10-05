package tech.bts.webdevreview.classes

fun main(args: Array<String>) {

    val calculator = CalculatorKotlin(0.0)
    calculator.add(7.0)
    calculator.add(8.0)

    calculator.divideBy(3.0)

    println(calculator.value)
    println(calculator.counter)

}
package tech.bts.webdevreview.simpleprogram

import tech.bts.webdevreview.classes.util.MathUtilKotlin
import java.util.*

fun main(args: Array<String>) {

    println("Hello world!")

    var age : Int = 28

    if (age >= 18) {
        println("adult")
    } else if (age >= 13) {
        println("teenager")
    } else {
        println("kid")
    }

    var i = 0
    while (i <= 10) {
        println(i)
        i ++
    }

    for(j in 1..10) {
        println(j)
    }

    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(11)
    println(numbers)
    println(numbers.get(1))

    val names : MutableList<String> = mutableListOf("potato", "tomato")
    // var names : mutableListOf<String>("potato", "tomato")
    println(names)

    val prices: MutableMap<String, Double>
    prices = HashMap()

    prices["potato"] = 3.30
    prices["tomato"] = 1.65

    val priceOfPotato = prices["potato"]
    println(priceOfPotato)

    for (price in prices.values) {
        println(price)
    }

    for (product in prices.keys) {
        println(product)
    }

    println(prices)

    printHello("Tue")

    val x = MathUtilKotlin.power(2.0, 10)
    println(x)
    println(MathUtilKotlin.factorial(5.0))

}
fun printHello(name: String) {
    println("Hello $name!")
}
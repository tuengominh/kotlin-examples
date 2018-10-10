package tech.bts.webdevreview.simpleprogram

import tech.bts.webdevreview.classes.util.StringUtilKotlin

fun main(args: Array<String>) {

    println(StringUtilKotlin.repeatString("go", 3))
    println(StringUtilKotlin.repeatString("xxx", 0))

    println(StringUtilKotlin.padLeft("go", 6))
    println(StringUtilKotlin.padLeft("gone", 6))

    println(StringUtilKotlin.padRight("go", 6) + "go")
    println(StringUtilKotlin.padRight("gone", 6) + "gone")

    println(StringUtilKotlin.repeatString(StringUtilKotlin.padRight("go", 5), 3))

    println(StringUtilKotlin.listOfNumbers(3, 18))
}
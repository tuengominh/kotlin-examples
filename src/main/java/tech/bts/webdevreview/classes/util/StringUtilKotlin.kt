package tech.bts.webdevreview.classes.util

import java.util.ArrayList

object StringUtilKotlin {

    fun repeatString(s: String, n: Int): String {

        var result = ""
        for (i in 1..n) {
            result += s
        }
        return result
    }

    fun padLeft(s: String, n: Int): String {

        return repeatString(" ", n - s.length) + s
    }

    fun padRight(s: String, n: Int): String {

        return s + repeatString(" ", n - s.length)
    }

    fun listOfNumbers(start: Int, end: Int): List<Int> {

        val result = ArrayList<Int>()
        for (i in start..end) {
            result.add(i)
        }
        return result
    }
}

package tech.bts.webdevreview.classes

object MathUtilKotlin {

    fun power(base: Double, exponent: Int): Double {

        var result = 1.0

        var counter = 1
        while (counter <= exponent) {
            result = result * base
            counter = counter + 1
        }
        // for (i in 1..exponent) { result *= base }
        return result
    }

    fun factorial(n: Double): Double {

        var result = 1.0

        var counter = 1
        while (counter <= n) {
            result *= counter.toDouble()
            counter = counter + 1
        }
        return result
    }
}


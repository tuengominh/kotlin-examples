package tech.bts.webdevreview.classes.machine.stats

class StatsKotlin {

    var sum = 0.0
        private set
    var count = 0
        private set
    var max = Double.MIN_VALUE
        private set
    var min = Double.MAX_VALUE
        private set

    val average: Double
        get() = sum / count

    fun add(x: Double) {
        if (x > max) { max = x }
        if (x < min) { min = x }
        sum += x
        count++
    }
}
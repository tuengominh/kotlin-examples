package tech.bts.webdevreview.classes.machine.stats

fun main(args: Array<String>) {

    var stats = StatsKotlin()
    stats.add(7.0)
    stats.add(8.0)
    stats.add(4.0)
    stats.add(5.0)
    stats.add(10.0)

    println(stats.sum)
    println(stats.count)
    println(stats.average)
    println(stats.max)
    println(stats.min)
}
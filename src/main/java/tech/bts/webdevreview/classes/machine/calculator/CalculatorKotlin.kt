package tech.bts.webdevreview.classes.machine.calculator

class CalculatorKotlin(var value: Double) {

    var counter: Int = 0 // we have the getter automatically declared here
    private set // remove this, we have the setter declared

    fun add(x: Double) {
        // fun add(x: Double) : Unit {
        // Unit equals void
        this.value += x
        this.counter++
    }

    fun divideBy(denominator: Double) {
        this.value = this.value / 3
        this.counter++
    }

}
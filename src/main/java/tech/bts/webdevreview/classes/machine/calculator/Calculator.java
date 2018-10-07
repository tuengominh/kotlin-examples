package tech.bts.webdevreview.classes.machine.calculator;

public class Calculator {

    private double value;
    private int counter;

    public Calculator(double intValue) {
        this.value = intValue;
        this.counter = 0;
    }

    public void add(double x) {
        this.value += x;
        this.counter ++;
    }

    public void divideBy(double denominator) {
        this.value = this.value / 3;
        this.counter ++;
    }

    public double getValue() {
        return value;
    }

    public int getCounter() { return counter; }

    public void setValue(double value) {
        this.value = value;
    }
}

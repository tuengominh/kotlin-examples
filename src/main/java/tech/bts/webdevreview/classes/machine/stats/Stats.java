package tech.bts.webdevreview.classes.machine.stats;

public class Stats {

    private double sum = 0;
    private int counter = 0;
    private double max = Double.MIN_VALUE;
    private double min = Double.MAX_VALUE;

    public void add(double x) {
        if (x > max) { max = x; }
        if (x < min) { min = x; }
        sum += x;
        counter ++;
    }

    public double getSum() { return sum; }
    public int getCount() { return counter; }
    public double getAverage() { return sum / 2; }
    public double getMax() { return max; }
    public double getMin() { return min; }
}
package tech.bts.webdevreview.classes;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(0);
        calculator.add(7);
        calculator.add(8);

        calculator.divideBy(3);

        System.out.println(calculator.getValue());
        System.out.println(calculator.getCounter());

        calculator.setValue(0);
    }
}

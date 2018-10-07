package tech.bts.webdevreview.classes.machine.stats;

public class MainStats {

    public static void main(String[] args) {

        Stats stats = new Stats();
        stats.add(7);
        stats.add(8);
        stats.add(4);
        stats.add(5);

        System.out.println(stats.getSum());
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
    }
}

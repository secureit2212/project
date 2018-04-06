package com.alex;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Statistic s1;

        if (args[0].equals("1")) {
            s1 = new StatisticLoop();
        } else {
            s1 = new StatisticRec();

        }
        System.out.println(Arrays.toString(args));
        new App().m(s1);
    }

    public void m(Statistic s1) {
        int[] array = {7, 6, 3, 9, 5, 2};
        int sum = s1.sum(array);
        int max = s1.max(array);
        int min = s1.min(array);
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("sum=" + sum);
    }
}

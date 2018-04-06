package com.alex.lesson1;

public class StatisticLoop implements Statistic {
    public StatisticLoop() {
        System.out.println("Loop statistic");
    }

    private int common(int initial, int[] array, Function function) {
        int acc = initial;
        for (int i = 0; i < array.length; i++) {
            acc = function.call(acc, array[i]);
        }
        return acc;
    }

    @Override
    public int sum(int[] array) {
        return common(0, array, new Sum());
    }

    @Override
    public int min(int[] array) {
        return common(Integer.MAX_VALUE, array, new Min());
    }

    @Override
    public int max(int[] array) {
        return common(Integer.MIN_VALUE, array, new Max());
    }
}

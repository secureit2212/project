package com.alex.lesson1;

import java.util.Arrays;

public class StatisticRec implements Statistic {
    public StatisticRec() {
        System.out.println("Rec statistic");
    }

    private int common(int[] array, Function function) {
        if (array.length == 1) {
            return array[0];
        } else {
            int[] newArrray = Arrays.copyOfRange(array, 1, array.length);
            newArrray[0] = function.call(array[0], array[1]);
            return common(newArrray, function);
        }
    }

    @Override
    public int sum(int[] array) {
        return common(array, new Sum());
    }

    @Override
    public int min(int[] array) {
        return common(array, new Min());
    }

    @Override
    public int max(int[] array) {
        return common(array, new Max());
    }
}

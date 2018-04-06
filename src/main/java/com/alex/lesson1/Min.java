package com.alex.lesson1;

public class Min implements Function {
    @Override
    public int call(int a, int b) {
        return Math.min(a, b);
    }
}

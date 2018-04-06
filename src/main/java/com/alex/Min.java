package com.alex;

public class Min implements Function {
    @Override
    public int call(int a, int b) {
        return Math.min(a, b);
    }
}

package com.alex;

public class Max implements Function {
    @Override
    public int call(int a, int b) {
        return Math.max(a, b);
    }
}

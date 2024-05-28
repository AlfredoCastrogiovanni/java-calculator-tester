package com.example;

public class Calculator {

    private Calculator() {}

    public static float add(float x, float y) {
        return x + y;
    }

    public static float substract(float x, float y) {
        return x - y;
    }

    public static float divide(float x, float y) {
        if (y == 0) throw new ArithmeticException("Cannot divide by 0!");
        return x / y;
    }

    public static float multiply(float x, float y) {
        return x * y;
    }
}

package com.niit.java23.polymorphics;

public class Calculator {
    public float add(int a, int b) {
        return a+b;
    }

    public float add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b) {
        return a +b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        calculator.add(1, 2, 3);
        calculator.add(1.0f, 2.0f);
    }
}

package com.niit.java23.bt;

import java.util.Scanner;

public class Calculator {
    private int a, b;
    private float result;

    public float add(int a, int b) {
        return a + b;
    }

    public float sub(int a, int b) {
        return a - b;
    }

    public float multiple(int a, int b) {
        return a * b;
    }

    public float divided(int a, int b) {
        return a / b;
    }


    public void doCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number one");
        a = scanner.nextInt();
        System.out.println("Please enter your number two");
        b = scanner.nextInt();
        System.out.println("Please enter your operator");
        scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        switch (operator) {
            case "+":
                result = add(a, b);
                break;

            case "-":
                result = sub(a, b);
                break;

            case "*":
                result = multiple(a, b);
                break;

            case "/":
                result = divided(a, b);
                break;
        }

        System.out.println("Ket qua cua phep tinh "+a+" "+operator+" "+b+" la "+result);
    }
}

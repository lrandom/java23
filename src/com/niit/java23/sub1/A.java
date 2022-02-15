package com.niit.java23.sub1;

public class A {
    protected void printNumber() {
        int number = 10;
        number = number++;
        System.out.println(number);
    }

    public static void main(String[] args) {
        A a = new A();
        a.printNumber();
    }
}

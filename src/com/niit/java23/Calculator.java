package com.niit.java23;

public class Calculator {
    private int a = 1, b = 2;


    public  void setAB(int a, int b) {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        this.a = a;
        this.b = b;

    }


    public  int calculator() {
        return a + b;
    }
}

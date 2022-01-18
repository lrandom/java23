package com.niit.java23;

public class Person {
    public synchronized void wakeup() {
        System.out.println("I am wake up");
    }

    public synchronized void working() {
        System.out.println("I am working");
        try {
            wait();
        } catch (Exception e) {

        }
        System.out.println("I am continue working");
    }

    public synchronized void breakfast() {
        System.out.println("Im get breakfast");
        try {
            notify();
        } catch (Exception e) {

        }
    }

}
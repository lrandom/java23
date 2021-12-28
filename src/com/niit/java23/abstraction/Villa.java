package com.niit.java23.abstraction;

public class Villa extends House {

    @Override
    public void printHouse() {
        System.out.println("Print Blue");
    }

    public void makeYard() {
        System.out.println("Make yard super largest");
    }
}

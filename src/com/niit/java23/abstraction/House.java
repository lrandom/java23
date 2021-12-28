package com.niit.java23.abstraction;

public abstract class House {

    //non-abstract method
    public void build() {
        System.out.println("Building house");
    }

    //abstract method
    public abstract void printHouse();
}

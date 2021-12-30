package com.niit.java23.polymorphics;

public class Child extends Parent {
    public void sayMyName() {
        System.out.println("My name is Child Class");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.sayMyName();
    }
}

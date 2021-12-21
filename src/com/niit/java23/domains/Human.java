package com.niit.java23.domains;

public class Human {
    public static String className;

    public String eyeColor;
    public String height;
    public String weight;
    public String name;
    public int yearOfBirth;

    public Human() {

    }

    public Human(String eyeColor) {

    }

    public Human(String eyeColor, String height, String weight, String name, int yearOfBirth) {
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void learn() {
        System.out.println(name + " is learning");
    }

    public int getAge() {
        return 2021 - yearOfBirth;
    }

    public static void printClasName() {
        System.out.println(Human.className);

    }
}

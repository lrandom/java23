package com.niit.java23;

import com.niit.java23.abstraction.House;
import com.niit.java23.abstraction.TropicalHouse;
import com.niit.java23.abstraction.Villa;
import com.niit.java23.domains.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getHouse(new Villa());

        House house = new House() {
            @Override
            public void printHouse() {
                System.out.println("print red");
            }
        };
    }

    public static void getHouse(House villa) {
        villa.printHouse();
    }
}

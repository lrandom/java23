package com.niit.java23;

import com.niit.java23.bt.Calculator;
import com.niit.java23.bt.Rectangle;
import com.niit.java23.bt.Square;
import com.niit.java23.domains.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Calculator calculator = new Calculator();
        calculator.doCalculator();*/

       /* Square square = new Square();
        System.out.println("Vui long nhap vao do dai cua square");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextFloat();
        square.setEdgeWidth(side);
        System.out.println("Diện tích hình vuông là " + square.getArea());*/

        Rectangle rectangle = new Rectangle();
        System.out.println("Vui long nhap vao do dai canh 1 cua rectangle");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextFloat();
        rectangle.setEdgeOne(side);
        System.out.println("Vui long nhap vao do dai canh 2 của reactangle");
        side = scanner.nextFloat();
        rectangle.setEdgeTwo(side);
        System.out.println("Diện tích hình CN là " + rectangle.getArea());
    }
}

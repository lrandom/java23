package com.niit.java23;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a :");
        float a = scanner.nextFloat();
        System.out.println("nhập số b :");
        float b = scanner.nextFloat();
        System.out.println("nhập số c :");
        float c = scanner.nextFloat();


        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = (b * b) - (4 * a * c);
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm phân biệt là : " + x1 + " và " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép là :  " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

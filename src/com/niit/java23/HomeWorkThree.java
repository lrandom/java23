package com.niit.java23;

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        int a, b, c, min, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào số thứ nhất");
        a = scanner.nextInt();
        System.out.println("Vui lòng nhập vào số thứ hai");
        b = scanner.nextInt();
        System.out.println("Vui lòng nhập vào số thứ ba");
        c = scanner.nextInt();
        min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("Số nhỏ nhất là");
        System.out.println(min);

        max = a;
        if(max < b){
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("Số lớn nhất là");
        System.out.println(max);
    }
}

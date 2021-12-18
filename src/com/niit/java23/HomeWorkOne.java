package com.niit.java23;

import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Đây là số chẵn");
        }else{
            System.out.println("Đây là số lẻ");
        }
    }
}

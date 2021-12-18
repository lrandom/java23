package com.niit.java23;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int number = 0;
        boolean flag = true;
        System.out.println("Vui long nhap vao một số");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag==true) {
            System.out.println("Đây là số NT");
        }else{
            System.out.println("Đây ko phải số NT");
        }
    }
}

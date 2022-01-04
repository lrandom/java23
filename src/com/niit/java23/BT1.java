package com.niit.java23;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhap so thu nhat: ");
                a = scanner.nextInt();
                break;
            } catch (Exception e) {
                //bắt nhập lại ở đây
                scanner = new Scanner(System.in);
            }
        } while (true);

        scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap so thu hai: ");
                b = scanner.nextInt();
                break;
            } catch (Exception e) {
                //bắt nhập lại ở đây
                scanner = new Scanner(System.in);
            }
        } while (true);

        System.out.println("Tong hai so la");
        System.out.println(a + b);
    }
}

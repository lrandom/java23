package com.niit.java23;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap vao mot so");
        int n = new java.util.Scanner(System.in).nextInt();
        int total = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
                total += i;
            }
        }

        if(total == n) {
            System.out.println("Đây là số hh");
        }else{
            System.out.println("Đây ko phải số hh");
        }
    }
}

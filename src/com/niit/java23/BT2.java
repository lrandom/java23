package com.niit.java23;

public class BT2 {
    public static void main(String[] args) {
        int n = 1;
        int[] arr = new int[]{3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            n = 1;
            for (int j = 1; j <=arr[i] ; j++) {
                n = n * j;
            }

            System.out.println("Giai thua cua so " + arr[i] + " la " + n);
        }
    }
}

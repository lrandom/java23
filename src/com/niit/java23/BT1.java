package com.niit.java23;

public class BT1 {
    public static void main(String[] args) {
        int tmp = 0;
        int[] arr = new int[]{3, 4, 10, 4, 5, 6, 4, 2, 4, 5, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package com.niit.java23;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*try {
            FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/data1.txt");
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println(   e.getMessage());
            System.out.println("KHÔNG TÌM THẤY FILE HỆ THỐNG");
        }

        System.out.println("Hello");*/

        int[] numbers = new int[]{1, 2, 3, 4};

        try {
            //System.out.println(numbers[10]);
            //System.out.println(10 / 0);
            System.out.println("ABCD");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bạn đã truy cập vượt quá số phần tử trong mảng");
        } catch (Exception e) {
            System.out.println("Lỗi gì đó ko xác định");
        } finally {
            System.out.println("Chạy vào hết mọi thứ");
        }

        System.out.println("Hello");
    }

}

package com.niit.java23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String names[] = new String[10];
        names[0] = "Luan";
        names[1] = "Nam";

        System.out.println(names[0]);
        System.out.println(names[3]);

        int ages[] = new int[10];
        ages[0] = 20;


        String countries[] = new String[]{
                "Viet Nam", "USA", "Japan"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        for (String country : countries
        ) {
            System.out.println(country);
        }


        //mảng hai chiều - cách 1
        String provinces[][] = new String[3][4];//3 hàng 4 cột
        provinces[0][0] = "Hà Nội";
        provinces[0][1] = "tp.Hồ Chí Minh";
        provinces[0][2] = "Đà Nẵng";
        provinces[0][3] = "Hải Phòng";
        provinces[1][0] = "California";
        provinces[1][1] = "Texas";

        for (int i = 0; i < provinces.length; i++) {
            for (int j = 0; j < provinces[i].length; j++) {
                System.out.println(provinces[i][j]);
            }
        }


        String[][] list = new String[][]{
                {"A", "B"},
                {"C", "D"},
                {"E", "F"}
        };
        System.out.println(list[0][1]);
        System.out.println(list[2][1]);


    }
}

package com.niit.java23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Bạn đã đủ tuổi");
        }

        if (age >= 20) {
            System.out.println("Bạn đã đủ tuổi");
        } else {
            System.out.println("Bạn chưa đủ tuổi");
        }

        if (age >= 6 && age <= 12) {
            System.out.println("Bạn là trẻ em");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Bạn là thiếu niên");
        } else if (age >= 18 && age <= 30) {
            System.out.println("Bạn là thanh niên");
        } else if (age >= 31 && age <= 50) {
            System.out.println("Bạn là trung niên");
        }

        switch (age) {
            case 6:
                ///
                System.out.println("Bạn còn bé quá");
                break;

            case 7:
                //
                System.out.println("Bạn hơi lớn");
                break;

            case 18:
                //
                System.out.println("BẠN ĐÃ ĐỦ TUỔI");
                break;

            default:
                System.out.println("Không biết xử lý ntn");
        }

        //nested if - if lồng nhau
        /*if () {
            if () {
                if () {

                }
            }
        }*/

    }
}

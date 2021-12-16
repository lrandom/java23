package com.niit.java23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
     /*   System.out.println("Hello World");*/

        //1. Gợi nhớ ý nghĩa của cái giá trị nằm trong biến đó
        //2. Ko được lẫn lộn giữa tiếng Việt và tiếng Anh
        //3. Hạn chế sử dụng sử dụng số trong tên biến
        //4. ko đc đặt tên biến trùng vs từ khoá trong ngôn ngữ Java

        //PasCal -> được sử dụng để đặt tên lớp
        //camelCase -> được sử dụng để đặt tên biến và hàm
        //snake_case == under_score -> được sử dụng để đặt tên biến và hàm (thủ tục)
        //kebab-case -> được sử dụng để đặt tên trong class trong thẻ html
        //UNDER_SCORE-> đặt tên hằng

        /*String name = "Nguyen Van A";
        int age = 20;
        double height = 1.75;
        System.out.println(name); //line new
        System.out.println(age+" "+10);
        System.out.println(height);*/

        //định dạng kết quả
        //print format
        /*System.out.printf("%s %n", name);//placeholder
        System.out.printf("%d %d %n",age,10);
        System.out.printf("%f %n",height);*/

        /*System.out.println("Vui lòng nhập số tuổi của bạn");
        Scanner scanner = new Scanner(System.in);
        int yourAge = scanner.nextInt();//lấy số tuổi nhập từ bàn phím cho vào biến yourAage
        System.out.println("Tên bạn là gì");
        String yourName = scanner.nextLine();
        System.out.printf("Tuổi của bạn là %d",yourAge);*/

       /* int num = 10;
        num++;
        System.out.println(num);//11
        num--;
        System.out.println(num);//10
        boolean isAccept = true;
        System.out.println(isAccept);//true
        System.out.println(!(!isAccept));//true*/

        /*
        int num = 10;
        System.out.println(++num);//11 ///12
        System.out.println(num);//11*/

        /*int numberOne = 10;
        int numberTwo = 20;

        System.out.println(numberOne == numberTwo);//false
        System.out.println(numberOne != numberTwo);//true
        System.out.println(numberOne > numberTwo);//false
        System.out.println(numberOne < numberTwo);//true
        System.out.println(numberOne >= numberTwo);//false
        System.out.println(numberOne <= numberTwo);//true*/

        //toán tử trinary - toán tử ba ngôi
      /*  int age = 16;
        boolean isAccept = (age >= 18) ? true : false;
        System.out.println(isAccept);*/


        /*int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;

        System.out.println((numberOne==10 && numberTwo==30));//false
        System.out.println((numberOne==20 || numberTwo==30));//false*/

        int numberOne = 10;
        long numberTwo = numberOne;//chuyển ngầm định (implicit conversion)

        long numberThree = 1000000000;
        short numberFour =(short)numberThree;//chuyển kiểu tường minh (explicit conversion)

        System.out.println(numberTwo);
        System.out.println(numberFour);

    }
}

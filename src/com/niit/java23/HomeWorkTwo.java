package com.niit.java23;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        float numberOne, numberTwo;
        float result = 0;
        String operationName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ nhất");
        numberOne = scanner.nextFloat();
        System.out.println("Mời bạn nhập số thứ hai");
        numberTwo = scanner.nextFloat();


        do {
            System.out.printf("%n");
            System.out.println("Mời bạn nhập tên phép tính");
            scanner = new Scanner(System.in);
            operationName = scanner.nextLine();

            switch (operationName) {
                case "+":
                    result = numberOne + numberTwo;
                    break;

                case "-":
                    result = numberOne - numberTwo;
                    break;

                case "*":
                    result = numberOne * numberTwo;
                    break;

                case "/":
                    result = numberOne / numberTwo;
                    break;
            }

            System.out.printf("Kết quả của phép tính là: %f", result);
        } while (operationName.equalsIgnoreCase("+") ||
                operationName.equalsIgnoreCase("-") ||
                operationName.equalsIgnoreCase("*") ||
                operationName.equalsIgnoreCase("/"));
    }



}

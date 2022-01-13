package com.niit.java23.ex2;

import java.util.Scanner;

public class MainExecution {
    public static void main(String[] args) {
        int choice = 0;
        EmployeeManager employeeManager = new EmployeeManager();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui long chon");
            System.out.println("1. Them NV");
            System.out.println("2. Danh sach NV");
            System.out.println("3. Thoat");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeManager.addEmployee();
                    break;

                case 2:
                    employeeManager.listEmployee();
                    break;

            }
        } while (choice != 3);
    }
}

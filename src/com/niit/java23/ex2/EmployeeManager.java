package com.niit.java23.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<>();
    public static final String DB_FILE = "/Users/lrandom/Desktop/Employee.dat";

    public EmployeeManager() {
        File file = new File(DB_FILE);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(DB_FILE);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                employees = (ArrayList<Employee>) objectInputStream.readObject();
            } catch (Exception e) {

            }
        }
    }

    public void listEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap id");
        int id = scanner.nextInt();
        System.out.println("Vui long nhap ten");
        String name = scanner.next();
        System.out.println("Vui long nhap tuoi");
        int age = scanner.nextInt();
        System.out.println("Vui long nhap luong");
        double salary = scanner.nextDouble();
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
        employees.add(employee);
        saveData();
    }

    public void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream(DB_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
        } catch (Exception e) {

        }
    }

    public void displayHighestEmployeeSalary() {

    }

    public void displayLowestEmployeeSalary() {

    }

}

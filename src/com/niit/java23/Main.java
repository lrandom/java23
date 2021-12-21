package com.niit.java23;

import com.niit.java23.domains.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human luan = new Human("brown","1.72","75","Luan",1992);//tạo ra một đối tượng từ lớp Human// instance of Class
        //instance == doi tuong
        luan.walk();
        luan.eat();
        luan.learn();

        Human nam = new Human();//tạo ra một đối tưọng từ lớp Human
        nam.name = "Nam";
        luan.eyeColor = "black";
        nam.walk();
        nam.eat();
        nam.learn();

        Human.className = "Human";
        Human.printClasName();

    }
}

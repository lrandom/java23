package com.niit.java23;

import com.niit.java23.abstraction.House;
import com.niit.java23.abstraction.TropicalHouse;
import com.niit.java23.abstraction.Villa;
import com.niit.java23.demo_inner_class.Button;
import com.niit.java23.demo_inner_class.OnClickLister;
import com.niit.java23.demo_inner_class.RegularOuter;
import com.niit.java23.demo_inner_class.StaticOuter;
import com.niit.java23.domains.Human;
import com.niit.java23.interfaces.IMobilePhone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*        getHouse(new Villa());

        House house = new House() {
            @Override
            public void printHouse() {
                System.out.println("print red");
            }
        };*/
      /*  IMobilePhone samsungPhone = new Iphone();
        samsungPhone.callPhone("01728917298");*/

        //Regular inner class
/*        RegularOuter regularOuter = new RegularOuter();
        RegularOuter.RegularInner regularInner = regularOuter.new RegularInner();
        regularInner.display();

        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.display();*/

        Button button = new Button();
        button.setOnClickListener(new OnClickLister() {
            @Override
            public void onClick() {
                System.out.println("Button Clicked");
            }
        });

        Button button1 = new Button();
        button.setOnClickListener(new OnClickLister() {
            @Override
            public void onClick() {
                System.out.println("Bạn đã tham gia vào lớp lập trình Java web 23");
            }
        });
    }

/*    public static void getHouse(House villa) {
        villa.printHouse();
    }*/
}

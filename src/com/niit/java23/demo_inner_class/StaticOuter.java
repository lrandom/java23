package com.niit.java23.demo_inner_class;

import javax.xml.namespace.QName;

public class StaticOuter {
    private String name = "Regular Outer Class";
    private static int age = 20;

    public static class StaticInner {
        public void display() {
            System.out.println(age);
        }
    }
}

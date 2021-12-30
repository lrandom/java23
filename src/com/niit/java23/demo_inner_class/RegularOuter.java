package com.niit.java23.demo_inner_class;

public class RegularOuter {
    private String name = "Regular Outer Class";

    public void display() {
        System.out.println("Regular Outer Class");
        class MethodLocalInner {
            public void display() {
                System.out.println("Method Local Inner Class");
            }
        }
        MethodLocalInner mli = new MethodLocalInner();
        mli.display();
    }

    public class RegularInner {
        public void display() {
            System.out.println(name);
        }
    }
}

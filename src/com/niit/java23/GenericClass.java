package com.niit.java23;

public class GenericClass<T, E> {
    private T t;
    private E e;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <K> void add(K a, K b) {
        if (a instanceof Integer && b instanceof Integer) {
            System.out.println((Integer) a + (Integer) b);
        } else if (a instanceof Float && b instanceof Float) {
            System.out.println((Float) a + (Float) b);
        }
    }




/*
    public void add(Float a, Float b) {
        System.out.println(a + b);
    }

*/


    public static void main(String[] args) {
        GenericClass<String, String> gc = new GenericClass<>();
        gc.setT("Hello");
        System.out.println(gc.getT()); //Hello

        GenericClass<Integer, String> gc2 = new GenericClass<>();
        gc2.setT(new Integer(10));
        System.out.println(gc2.getT()); //10

        GenericClass<Float, String> gc3 = new GenericClass<>();
        gc3.setT(new Float(10.5));
        System.out.println(gc3.getT()); //10.5

        gc.add("Hello", "World");
        gc.add(new Integer(10), new Integer(20));
        gc.add(new Float(10.5), new Float(20.5));
    }
}

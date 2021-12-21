package com.niit.java23;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");//Hello World

        System.out.println(stringBuilder.toString());

        stringBuilder.delete(0, 5);//World]
        System.out.println(stringBuilder.toString());

        stringBuilder.insert(1, "Hello ");//Hello World
        System.out.println(stringBuilder.toString());

        stringBuilder.reverse();//dlroW olleH
        System.out.println(stringBuilder.toString());
    }
}

package com.niit.java23;

public class BT {
    public static void main(String[] args) {
        String name = "Luan";
        String placeHolder = "X";
        placeHolder = placeHolder.replaceAll("X", "XXXXXXXXXX");
        placeHolder = placeHolder.replaceAll("X", "XXXXXXXXXX");//100 ký tự
        placeHolder = placeHolder.replaceAll("X", "XXXXXXXXXX");//1000 ký tự X
        placeHolder = placeHolder.replaceAll("X", name + "\n");
        System.out.println(placeHolder);
    }
}

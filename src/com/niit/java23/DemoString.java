package com.niit.java23;

public class DemoString {
    public static void main(String[] args) {
/*        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); //So sánh về địa chỉ của chuỗi
        System.out.println(s1.equals(s2));

        String s3 = new String("Hi");
        String s4 = new String("Hi");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.length());
        System.out.println(s3.charAt(0));

        String s5 = new String("Hello Motor");
        char[] dest = new char[6];
        s5.getChars(0,5,dest,1);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }*/

        String s6 = new String("Hello Worls");
        System.out.println(s6.compareTo("Hello World"));

        System.out.println(s6.startsWith("Hello"));//true
        System.out.println(s6.endsWith("World"));//false

        System.out.println(s6.indexOf("o"));//4
        System.out.println(s6.lastIndexOf("o"));//7

        String s7 = s6.substring(4,5);

        String a = "Hello";
        String b = a.concat(" World"); //Hello World

        "hello".replace("l", "L");
        " Hello ".trim();//"Hello"

        "HELLO".equalsIgnoreCase("hello");//true
        "HELLO".equals("hello");//false



    }

}

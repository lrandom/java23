package com.niit.java23;

import java.util.StringTokenizer;

public class DemoTokenizer {
    public static void main(String[] args) {
        StringTokenizer token = new StringTokenizer("Hi-there-I-am", "-", true);
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }


        System.out.println("===========================");
    }
}

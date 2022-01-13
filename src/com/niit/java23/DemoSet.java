package com.niit.java23;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("Name");
        hs.add("Luan");
        hs.add("Luan");
        for (String s : hs) {
            System.out.println(s);
        }
    }
}

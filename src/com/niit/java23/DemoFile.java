package com.niit.java23;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        File file = new File("/Users/lrandom/Documents/");
        File newDir = new File(file, "newDir");
        newDir.mkdir();
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}

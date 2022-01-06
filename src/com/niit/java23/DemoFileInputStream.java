package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/data.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

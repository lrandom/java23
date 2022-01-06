package com.niit.java23;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoFileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/lrandom/Desktop/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ( (line=bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {

        }
    }
}

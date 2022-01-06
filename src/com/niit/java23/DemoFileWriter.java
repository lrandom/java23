package com.niit.java23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DemoFileWriter {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("/Users/lrandom/Desktop/test.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("I am Luan");
            bufferedWriter.flush();
            fileWriter.close();
            bufferedWriter.close();

        } catch (Exception e) {

        }
    }
}

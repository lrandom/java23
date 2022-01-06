package com.niit.java23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoWriteObjectToFile {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream object
            FileOutputStream fos = new FileOutputStream("/Users/lrandom/Desktop/human.dat");
            Human luan = new Human();
            luan.setAge(29);
            luan.setName("Luan");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(luan);
            objectOutputStream.close();
            fos.close();
        } catch (Exception e) {

        }
    }
}

package com.niit.java23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoFileOutputStream {
    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Downloads/file-1.mp3");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fos = new FileOutputStream("/Users/lrandom/Documents/file-1.mp3");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                //System.out.print((char) i);
                //fos.write(i);
                bufferedOutputStream.write(i);
            }
            bufferedOutputStream.flush();//đảm bảo dữ liệu sync từ buffer(cache) vào ổ cứng


            //fos.write("Hello World".getBytes());
            fos.close();
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

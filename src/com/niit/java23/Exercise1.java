package com.niit.java23;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class Exercise1 {
    public static void downloadImage(String imageLink) {
        //download ảnh
        try {
            URL url = new URL(imageLink);
            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream(imageLink.substring(imageLink.lastIndexOf("/") + 1));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, length);
            }
            fileOutputStream.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //đọc đường dẫn ảnh
        try {
            FileReader fileReader = new FileReader("/Users/lrandom/Desktop/list_url.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                downloadImage(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

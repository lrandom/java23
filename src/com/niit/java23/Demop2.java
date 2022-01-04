package com.niit.java23;

import java.io.*;

public class Demop2 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/data1.txt");
            //xử lý gì đó
            fis.close();//đóng kết nối
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println(   e.getMessage());
            System.out.println("KHÔNG TÌM THẤY FILE HỆ THỐNG");
        }


        try( FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/data1.txt")){
            //xử lý gì đó
        }catch (IOException e){

        }

    }
}

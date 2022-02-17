package com.niit.java23;

import java.sql.Driver;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
            //Kết nối đến mysql server
            DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_23",
                    "root", "koodinh@");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

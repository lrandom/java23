package com.niit.java23;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
            //Kết nối đến mysql server
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_23",
                    "root", "koodinh@");

            //thực thi các câu lệnh sql
            //thực thi câu lệnh insert
/*            Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO users(email,pwd,salary) VALUES ('mm@gmail.com','1234',1000)");

            ResultSet rs = stm.executeQuery("SELECT * FROM users");
            while(rs.next()) {
                String email = rs.getString("email");
                Double salary = rs.getDouble("salary");
                System.out.println(email);
                System.out.println(salary);
            };*/


            //tạo ra result set mà có khả năng update dữ liệu
            //Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet rs = stm.executeQuery("SELECT * FROM users");
            //rs.relative(3);
            /*rs.absolute(2);
            rs.updateString("email", "bumblebee@gmail.com");
            rs.updateRow();*/


            //chèn thêm bản ghi vào
/*
            rs.moveToInsertRow();
            rs.updateString("email", "a@gmail.com");
            rs.updateString("pwd", "234");
            rs.updateFloat("salary", new Float(1000));
            rs.insertRow();
*/

 /*           do {
                String email = rs.getString("email");
                Double salary = rs.getDouble("salary");
                System.out.println(email);
                System.out.println(salary);
            } while (rs.next());*/
            //rs.absolute(1);
            //rs.deleteRow();

            Statement stm = conn.createStatement();
            String mail = "luann4099@gmail.com";
            String pwd = "123456";
            float salary = 1000;
            //stm.executeUpdate("INSERT INTO users(email,pwd,salary) VALUES ('"+mail+"','"+pwd+"',"+salary+")");

            PreparedStatement pstm = conn.prepareStatement("INSERT INTO users(email,pwd,salary) VALUES (?,?,?)");
            pstm.setString(1, mail);
            pstm.setString(2, pwd);
            pstm.setFloat(3, salary);
            pstm.execute();

            pstm.setString(1, "beee@gmail.com");
            pstm.setString(2, "12121212");
            pstm.setFloat(3, 5000);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

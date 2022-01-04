package com.niit.java23;

import java.io.IOException;
import java.sql.SQLException;

public class Demo {
    public void calculate(int a, int b) throws IOException, SQLException {
        if (a < 0) {
            throw new IOException("a is less than 0");
        }

        if (b < 0) {
            throw new SQLException("b is lesson than 0");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.calculate(-10, 2);
        } catch (IllegalArgumentException e) {
            throw e;
            //System.out.println("Vui long nhap vao mot so lon hon 0");
        } catch (Exception e) {
            System.out.println("Vui long nhap vao mot so lon hon 0");
        }
    }
}

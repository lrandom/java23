package com.niit.java23;

import com.niit.java23.interfaces.IMobilePhone;
import com.niit.java23.interfaces.MobileOS;

public class Iphone implements IMobilePhone, MobileOS {
    @Override
    public void callPhone(String number) {

    }

    @Override
    public void smsTo(String number, String message) {

    }

    @Override
    public void bootOS() {
        System.out.println("Boot iOS");
    }

    @Override
    public void installOS() {
        System.out.println("Install iOS");
    }

    @Override
    public void shutdownOS() {
        System.out.println("Shutdown iOS");
    }
}

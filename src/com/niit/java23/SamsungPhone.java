package com.niit.java23;

import com.niit.java23.interfaces.IMobilePhone;
import com.niit.java23.interfaces.MobileOS;

public class SamsungPhone implements IMobilePhone, MobileOS {
    @Override
    public void callPhone(String number) {

    }

    @Override
    public void smsTo(String number, String message) {

    }

    @Override
    public void bootOS() {
        System.out.println("Boot Android OS");
    }

    @Override
    public void installOS() {
        System.out.println("Install Android OS");
    }

    @Override
    public void shutdownOS() {
        System.out.println("Shutdown Android OS");
    }
}

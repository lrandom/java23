package com.niit.java23;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Thread " + getName() + " is running");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }
}

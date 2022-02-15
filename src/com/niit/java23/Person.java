package com.niit.java23;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void wakeup() {
        System.out.println(this.name+" thức dậy");
    }

    public synchronized void working() {
        System.out.println(this.name+" làm việc");
        try {
            wait();
        } catch (Exception e) {

        }
        System.out.println(this.name+" tiếp tục làm việc");
    }

    public synchronized void breakfast() {
        System.out.println(this.name+" ăn sáng");
        try {
            notify();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nam");
        Thread t1 = new Thread() {
            @Override
            public void run() {
                super.run();
                person.wakeup();
                person.working();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                super.run();
                person.breakfast();
            }
        };

        t1.start();
        t2.start();
    }
}

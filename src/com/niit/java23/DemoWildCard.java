package com.niit.java23;

import java.util.ArrayList;

public class DemoWildCard {
    public void listCollection(ArrayList<? super Short> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        DemoWildCard demo = new DemoWildCard();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        demo.listCollection(list);
    }
}

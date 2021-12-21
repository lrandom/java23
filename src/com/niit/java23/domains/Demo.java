package com.niit.java23.domains;

public class Demo {
    public void inputValue(int num) {
        num++;
        num++;
    }

    public void inputRef(Human human) {
        human.name = "Jack";
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        int myNumber = 10;
        demo.inputValue(myNumber);
        System.out.println(myNumber);//10

        Human human = new Human();
        human.name = "Tom";
        demo.inputRef(human);
        System.out.println(human.name);//Jack
    }
}

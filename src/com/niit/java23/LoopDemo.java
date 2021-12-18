package com.niit.java23;

public class LoopDemo {
    public static void main(String[] args) {
/*       for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/


/*        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }*/

/*        int j = 11;
        do {
            System.out.println(j);
        } while (j<10);*/

        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
/*        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                continue;
            }
        }*/
        //0,1,2,3,5,6,7,8,9,10

        //vòng lặp để duyệt collection
       /* for (int number: numbers
             ) {
            System.out.println(number);
        }*/
        printNumber();
    }

    public static void printNumber(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==4){
                return;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

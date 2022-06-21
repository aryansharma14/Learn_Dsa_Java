package com.Aryan.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);//neglect intial capacity right now, when u learn oops ,
                                                                    // then it will make sense.......

        /*list.add(54);
        list.add(2);
        list.add(98);
        list.add(534);
        list.add(600);
        list.add(21);
        System.out.println(list);

        System.out.println(list.contains(21));

        list.set(0,99); //updateing the list
        System.out.println(list);

        list.remove(2);//deleting the element from list
        System.out.println(list);*/

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        //get item at any index.......
        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i));
        }

    }

}

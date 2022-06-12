package com.Aryan.Arrays;

import java.util.Scanner;

public class linearSearch_a {

    static int linear(int [] a , int key){
     int index  = 0;
        for (int i = 0; i < a.length; ++i) {
            if (key == a[i]){
                return i;
            }

        }
        return index;

    }

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        System.out.println("enter the key to found in array");
        int key = in.nextInt();
        int [] arr = {1,2,97,68,4,5};
        int ans =  linear(arr,key);
        if (ans == 0){
            System.out.println("some issu is there");
        }
        else {
            System.out.println("the index at which" + key + " is found  = " + ans);
        }
    }
}

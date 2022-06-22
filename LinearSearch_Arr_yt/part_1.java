package com.Aryan.LinearSearch_Arr;

import java.util.Scanner;

//find the elemnt in an array using linear search..........................................


public class part_1 {

    static int linear(int [] a , int key){

        if (a.length == 0) return -1;

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
        if(ans ==-1) System.out.println("pls reassign the array");
        else {
            System.out.println("the index at which" + key + " is found  = " + ans);
        }
    }

}

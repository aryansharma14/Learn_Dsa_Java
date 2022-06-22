package com.Aryan.LinearSearch_Arr;

import java.util.Scanner;

public class SearchIn_range_arr {


    static int Inrange(int [] a , int key , int start , int end){

        if (a.length == 0) return -1;

        int index  = 0;
        for (int i = start; i < end; ++i) {
            if (key == a[i]){
                return i;
            }

        }
        return -1;

    }






    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        System.out.println("enter the key to found in array");
        int key = in.nextInt();
        int [] arr = {1,2,97,68,4,5};
        int ans =  Inrange(arr,key , 1, 4);
        if (ans == 0){
            System.out.println("some issu is there");
        }
       else {System.out.println("the index at which" + key + " is found  = " + ans);}



    }
}

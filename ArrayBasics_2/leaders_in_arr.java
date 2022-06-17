package com.Aryan.ArrayBasics_2;

import java.util.Arrays;

public class leaders_in_arr {

    static void leaders(int[] arr){
         int largest = Integer.MIN_VALUE;
         int [] bro = new int[arr.length];
         int j = 0;
        System.out.println("without reversing the order");
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]>largest){
                largest = arr[i];
                System.out.print(arr[i]+" ");
                bro[j++] = arr[i];
            }

        }
        System.out.println();
        System.out.println("after reversing the order");

        System.out.println(Arrays.toString(bro));


    }


    public static void main(String[] args) {
        int[] nums = {2,7,6,4,1,3};

        leaders(nums);

    }
}

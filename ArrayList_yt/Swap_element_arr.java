package com.Aryan.ArrayList_yt;

import java.util.Arrays;

public class Swap_element_arr {

    static void swaper(int[] arr , int index1 , int index2 ){

        int temp = arr[index1];
        arr[index2] = arr[index1];
        arr[index1] = temp;

    }




    public static void main(String[] args) {

        int []  arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        swaper(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
}

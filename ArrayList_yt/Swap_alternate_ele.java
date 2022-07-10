package com.Aryan.ArrayList_yt;

import java.util.Arrays;

public class Swap_alternate_ele {

static void Swap_alt(int[]arr){
    int n  = arr.length;

    for (int i = 0; i<n;i = i+2){
        if (i + 1 < n){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
    }


}






    public static void main(String[] args) {

     int [] arr_even = {2,5,1,8,4,6};
     int [] arr_odd = {2,4,6,8,3,5,7};
        System.out.println(Arrays.toString(arr_even));
        System.out.println(Arrays.toString(arr_odd));
     Swap_alt(arr_even);
     Swap_alt(arr_odd);
        System.out.println(Arrays.toString(arr_even));
        System.out.println(Arrays.toString(arr_odd));
    }
}

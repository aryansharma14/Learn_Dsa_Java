package com.Aryan.Arrays;

import java.util.Scanner;

public class maxElement_Arr {



static int maxo(int [] arr){

    if (arr.length == 0) return -1;
    int max = arr[0];
int n = arr.length;

    for (int i = 0; i < n; i++) {
        if(max <  arr[i]){
            max = arr[i];
        }
    }

    return max;
}










    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

          int [] nums = {1,4,8,23,76,2,12,34};

          int ans = maxo(nums);

        System.out.println("the max element in array is =  " + ans);

    }
}

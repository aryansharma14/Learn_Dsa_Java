package com.Aryan.Arrays;

import java.util.Scanner;

public class minElemnt_arr {


    static int smallest(int[] nums){
            int min = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if(min>nums[i]){
                min = nums[i];
            }

        }
     return min;
    }

    public static void main(String[] args) {

        Scanner in  =new Scanner(System.in);

        int [] arr = {90,4,76,2,56,43};
        int ans = smallest(arr);
        System.out.println("the smallest elemnt in an aray is " + ans);

    }
}

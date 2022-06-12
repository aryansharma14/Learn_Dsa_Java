package com.Aryan.Arrays;



import java.util.Scanner;

public class deleteElement_Arr {


    static int delete(int[]arr , int key){

        int n = arr.length;
        int i = 0;

        for (; i <n ; i++){
            if(key == arr[i]){
                break;
            }

        }
        if (i == n) return n;

        for ( int j = i  ;j<n-1;j++ ){
             arr[j] = arr[j+1];
        }

        return n-1;
    }






    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

     int[] nums = {1,2,3,4,5,6,7,8,9};
     int key = 4;

     delete(nums,key);

        for (int j : nums) {
            System.out.print(j + "  ");
        }


    }
}

package com.Aryan.Arrays;

public class reverseArray {



static void reverser(int[] nums ){
 int n = nums.length;
    int start = 0;
    int end = n-1;

    while(start<=end){

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;


        start ++;
        end--;
    }


}

static void printer(int[] nums){

    for (int i = 0; i < nums.length; i++) {
        System.out.print( nums[i] + " ");


    }
}


    public static void main(String[] args) {

        //intialising an array
        int[] arr = {1,2,3,4,5,6,7,8};
                 //going inside the method
        printer(arr);
        System.out.println();
                reverser(arr);

        System.out.println("the reversed array is " );
                printer(arr);
    }
}

package com.Aryan.ArrayBasics_2;

public class maxSum_Subarray {


   static int subarray(int[] arr){
       int cursum = 0;

       int maxsum = Integer.MIN_VALUE;//maximum value after adding subrray elements

       for (int i = 0; i < arr.length; i++) {
           cursum += arr[i];
           if (maxsum<cursum){
               maxsum  = cursum;
           }
           if (cursum<0){
               cursum = 0;
           }


       }
       return maxsum;
   }

    public static void main(String[] args) {
        int[] nums = {-2,7,-6,-4,1,-3,8};

        int ans = subarray(nums);
        System.out.println(ans );

    }
}

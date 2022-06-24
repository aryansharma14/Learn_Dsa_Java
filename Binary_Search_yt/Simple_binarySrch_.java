package com.Aryan.Binary_Search_yt;

public class Simple_binarySrch_ {


    static int binary(int [] arr, int target){

        if (arr.length ==0 ) return -1;

        int start = 0;
        int end  = arr.length-1;

        while(start<=end){

            int mid = start + (end - start) /2;
            if (target < arr[mid]){
                end = mid - 1;

            }
            else if (target > arr[mid]) {
                start =  mid + 1;


            }
            else{
                return mid;

            }

        }
        return -1;


    }

    public static void main(String[] args) {


        int [] arr = { -52,-12,-4,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binary(arr,target);
        System.out.println(ans);
    }
}

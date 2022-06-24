package com.Aryan.Binary_Search_yt;

public class Order_Agnostic_binary_search {

    static int order_agnostic(int[]arr , int target){
        if (arr.length ==0 ) return -1;


        int start = 0;
        int end  = arr.length-1;



        //find wether the array is sorted in asc or dsc order;
        boolean isAsc  = arr[start] < arr[end];


        while(start<=end){

            int mid = start + (end - start) /2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;

                }
                else  {
                    start =  mid + 1;


                }
            }else
            {
                if (target > arr[mid]){
                    end = mid - 1;

                }
                else {
                    start =  mid + 1;


                }
            }


        }
        return -1;


    }




    public static void main(String[] args) {
        int [] arr = { -52,-12,-4,3,4,15,16,18,22,45,89};
        int [] nums = { 52,43,31,10,4,-15,-16,-18,-22};
        int target = 22;
        int target1=10;
        int ans = order_agnostic(arr,target);

        System.out.println(ans);
        int mas = order_agnostic(nums,target1);

        System.out.println(mas);


    }
}

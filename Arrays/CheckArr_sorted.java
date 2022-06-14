package com.Aryan.Arrays;

public class CheckArr_sorted {


   static void sorter(int[] arr){
        if (arr.length <1) {
            System.out.println("there is an error check the giver array or code");
        }


        if (arr[0] < arr[1]) {
            int count =0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    count++;
                }


            }
            if (count == arr.length - 1) {
                System.out.println("the array id sorted");

            }
            else{
                System.out.println("the array is not sorted");
            }
        }
        else if (arr[0] > arr[1]) {


       int mount = 0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]){
                    mount++;
                }


            }
            if (mount == arr.length-1){
                System.out.println("the array id sorted");
            }
            else {
                System.out.println("the array is not sorted");
            }

        }
        else {
            System.out.println("array is not sorted");
        }



    }






    public static void main(String[] args) {

       int[] nums = {1,3,2,4,5,6,7};
       int[] mob = {9,8,7,6,5,4};
       int[] sos = {45,45,34,9,6,23};

        System.out.println("one");


       sorter(nums);
        System.out.println("two");
       sorter(mob);
       System.out.println("three");
       sorter(sos);


    }
}

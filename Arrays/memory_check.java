package com.Aryan.Arrays;

import java.util.Arrays;

public class memory_check {

    static void heaperStacker(int [] arr){

        arr[0] =12;

    }


    public static void main(String[] args) {

        int [] nums = {1,2,3,4,56,75};
        System.out.println(Arrays.toString(nums));


        //arrays can be chaged but primitive dattatypes cant be changed
        heaperStacker(nums);
        System.out.println(Arrays.toString(nums));

    }
}

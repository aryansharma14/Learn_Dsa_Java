package com.Aryan.TwoDimesional_arr;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimesional_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][]; //adding the rows is mandatory but columns are not.......

        //or u can initialise this way toooo....

/*
        int [][] bro = { //variable or refence goes in stack

                 {1,2,3}, //all the objects go in heap , linked to refrence varible in stack    //0index
                {4,5,6},                              //1st index
                {7,8,9}                                   //second index

        };
*/
        // how to take input..........

        int[][] nums = new int[3][3]; //
        for (int row = 0; row < nums.length; row++) {
            //for each column in every row
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = in.nextInt();


            }

        }
        //now output
       /* for (int row = 0; row < nums.length; row++) {
            //for each column in every row
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row ] [col] + " ");


            }
            System.out.println();//for new line to look exclty like matrix

        }*/


        //another way of 2d output........................
        for (int row = 0; row < nums.length; row++) {
            System.out.println(Arrays.toString(nums[row]));

        }

        //last method to print 2d output is ...
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));

        }

    }
}
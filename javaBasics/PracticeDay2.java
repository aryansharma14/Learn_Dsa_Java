package com.Aryan.javaBasics;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;

public class PracticeDay2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);




//to find the larger elemsnts in an array which are greater than the average of all elimentys in array ..............

/*        int[] arr = new int[5];

        //enter elemnts ina an array
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = in.nextInt();
        }
        int sum = 0;
        //summing all elemts of an array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        //getiing average
        double average = (int)(sum / arr.length);
        //getting results..
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > average){
               System.out.print(arr[i] + " ");
           }

        }*/


//java program that takes a number input from user and print table till 10 times........................................

     /*   System.out.println("enter the number of ur choice");
        int num = in.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println( num + " * " + i + " = " + num * i);

        }*/


//write a java program to sum all elemets in an array..............
     /*   int[] arr = new int[5];
        //fillling elemts in ana array
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = in.nextInt();;

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println("sum of elements of array is " + sum);
        */



//to find the factorial of a number inputed byt user ;ile 5! = 5*4*3*2*1;
     /* int fact = in.nextInt();
      int prod = 1;
      while(fact!=0){
          prod *=fact;
          fact--;
      }
        System.out.println("the afctporial of a given number is "  + prod);*/



//to fin min and max element in an array using liner search .............................

  /*   int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]  = in.nextInt();
        }

        int min  = arr[0];
        int max =arr[0];
        //for getting min value in arraya......
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("the minimum value in a array is " + min);

        //for getting max value in arraya......
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("the minimum value in a array is " + max);*/

//to print the fiv=booncai series using methods..........................


    /*    System.out.println("enter the number of ur choice to frint fibbonacci");
        int N = in.nextInt();

        // Function Call
        Fibonacci(N);
        //function is wrten outside this class.at below ......

*/


//write a java method/function to  get smallest number among three numbers/................................

         int num1 = in.nextInt();
         int num2 = in.nextInt();
         int num3 = in.nextInt();


         int small = min(num3 , min(num1,num2));
        System.out.println("the smallest number is " + small);


//Write a java program to sorts/segregate 0s on left side and 1s on right side of an array of 0s and 1s in random order.................
/*
        public static void segregater(int[] arr1) {
            //intialising the counter for 0;
            int count = 0;

            //zeroes are counted
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == 0) {
                    count++;
                }
            }
            System.out.println(count);
            //lets segragte 0s first
            for (int j = 0; j < count; j++) {
                arr1[j] = 0;

            }
            //lets segragte 1's
            for (int j = count; j < arr1.length; j++) {
                arr1[j] = 1;

            }


        }





        public static void printer(int[] arr) {


            System.out.print(Arrays.toString(arr));

        }






        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);


            //intialised the array
            int[] arr1 = {0,1,0,0,1,0,1,1};



            segregater(arr1 );

            printer(arr1);
        }
*/




        }

        //it fibonaaci funtion ...................
        /*static void Fibonacci(int N)
        {
            int num1 = 0, num2 = 1;

            int counter = 0;

            // Iterate till counter is N
            while (counter < N) {

                // Print the number
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }*/

    }



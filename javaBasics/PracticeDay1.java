package com.Aryan.javaBasics;

import java.util.Scanner;

import static java.lang.Math.max;

public class PracticeDay1 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

// Write a java program to take two inputs form user and prints out product of two numbers..................

      /*  System.out.println("Enter first number ");
        int num1 = in.nextInt();
        System.out.println("Enter second Number");
        int num2 = in.nextInt();

        int product = num1 * num2;
        System.out.println("the product of two numbers is " + product);
      */


// write a program to print area and parameter of a circle................................................
    /*    System.out.println("enter the radius of ur choice");
        int radius = in.nextInt();
        double prameter = 2 * 3.145 * radius;
        double area = radius * radius * 3.145;
        System.out.println("the paremieter of circle is " + prameter);
        System.out.println("the area of circle is " + area);
    */

// write a program to convert inches to  meters............................................................

    /* System.out.println("enter the number in inches of ur choice");
        int num1 = in.nextInt();
        double meters = num1 * 0.0254;
        System.out.println("the value in meters is " + meters);
    */

// Take three numbers form user and fin greatest...............................................................

   /*  System.out.println("enter three numbers :-");
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();

     int maximum = max(c,  max(a,b));
        System.out.println("the maximum of three numbers is " + maximum);
    */

//write  a program to swap two numbers..........................................................................

     System.out.println("enter the first number of ur wish" ) ;
        int num1 = in.nextInt();
        System.out.println("enter the second number of ur wish" ) ;
        int num2 = in.nextInt();
        System.out.println("the two numbers without swapping is " + num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("the two numbers with swapping is " + num1 + " " + num2);




    }
}

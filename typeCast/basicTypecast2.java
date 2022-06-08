package com.Aryan.typeCast;

import java.util.Scanner;

public class basicTypecast2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//java progrm to convert char to int ........................


     /*char a = '5';
     char b = 'd';

     //typcasting
        int num1 = a;
        int num2 = b;
        System.out.println(num1 + "  " + num2);*/

//char to int using getNumericValue() method........................
        // create char variables
        char a = '5';
        char b = '9';

        // convert char variables to int
        // Use getNumericValue()
        int num1 = Character.getNumericValue(a);
        int num2 = Character.getNumericValue(b);

        // print the numeric value of characters
        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }
}

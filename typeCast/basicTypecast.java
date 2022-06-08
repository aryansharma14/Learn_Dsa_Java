package com.Aryan.typeCast;

import java.util.Arrays;
import java.util.Scanner;

public class basicTypecast {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//Convert char to string ..............................

    /* char ch = 'c';
     String str1 = Character.toString(ch);

        System.out.println(str1);
        System.out.println(ch);
    */


//convert char array to string .......................................

       /* char[] ch1 = {'a' , 'b' , 'c' , 'd' , 'e'};
          //one way
        String str = String.valueOf(ch1);
         // another way
        String str2 = new String(ch1);
        System.out.println(str);
        System.out.println(str2);*/

//convert string to char array............
        String st = "This is great";

        char[] chars = st.toCharArray();

        System.out.println(Arrays.toString(chars));
    }
}

package com.Aryan.LinearSearch_Arr_yt;

public class leetcode1295_yt_kk {


    static public  int findNumbers(int[] nums){

        int count = 0;

        for (int num : nums)
        {
            if(even(num)){
                count++;
            }
        }
        return  count;

    }

    static boolean even(int num){
        int  numberOfdigits = digits(num);

        return numberOfdigits%2 ==0;

    }


    static int digits2(int num){
        if (num<0){
            num = num* -1;
        }
        return(int)(Math.log10(num) +1);
    }

    static int digits(int num){
        if (num<0){
            num = num*-1;
        }

        if (num ==0){
            return -1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
      return count;

    }






    public static void main(String[] args) {

int[] nums = {12 ,345,2,6,7896};
        System.out.println(findNumbers(nums));

        System.out.println(digits2(-345678));
    }




}

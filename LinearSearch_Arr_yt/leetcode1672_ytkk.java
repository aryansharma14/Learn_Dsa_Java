package com.Aryan.LinearSearch_Arr_yt;

public class leetcode1672_ytkk {
    public static void main(String[] args) {
      int[][] num =   {{1,5},{7,3},{3,5}};
     int x =  maximumWealth(num);
        System.out.println(x);
    }

        static int maximumWealth ( int[][] accounts){
            // person = rol
            // account = col
            int ans = Integer.MIN_VALUE;
            for (int[] ints : accounts) {
                // when you start a new row, take a new sum for that row
                int sum = 0;
                for (int anInt : ints) {
                    sum += anInt;
                }
                // now we have sum of accounts of person
                // check with overall ans
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
        }
    }


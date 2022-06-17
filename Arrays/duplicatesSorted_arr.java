package com.Aryan.Arrays;

import java.util.Arrays;

public class duplicatesSorted_arr {

    
    static int duplicates(int [] arr ){
        int a = arr.length;
        if (a==0 || a==1)
            return a;

        int[] temp = new int[a];

        int q = 0;
        for (int i=0; i<a-1; i++)
            if (arr[i] != arr[i+1])
                temp[q++] = arr[i];

        temp[q++] = arr[a-1];

        for (int p=0; p<q; p++)
            arr[p] = temp[p];

        System.out.println(Arrays.toString(arr));
        return q;
    }



    public static void main(String[] args) {

        int[] nums = {2,3,3,3,4,6,6,8,8,8,8};
       int ans = duplicates(nums);
        System.out.println(ans);

        
    }
}

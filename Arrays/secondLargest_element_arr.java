package com.Aryan.Arrays;

public class secondLargest_element_arr {
    

    static int secondLarge(int[] arr){
        if (arr.length<2) return -1;


        int largest = 0;
        int secondlargest = -1;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > arr[largest]){
                secondlargest = largest;
                largest = i;
            }
            else if (arr[i]  < arr[largest]){
                if (secondlargest == -1 || arr[i] > arr[secondlargest]){
                    secondlargest = i;
                }
        }

    }

return arr[secondlargest];

    }



    public static void main(String[] args) {

        int[] nums = {1,12,56,32,98,12};
        int ans = secondLarge(nums);

        System.out.println("second largest elementr in an arraay is " + ans);

    }
}

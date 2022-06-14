package com.Aryan.Arrays;

public class thirdLargest_elemnt_arr {
    static int thirdlarge(int[] arr){
        if (arr.length<2) return -1;


        int largest = 0;
        int secondlargest = -1;
        int thirdlargest = -2;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > arr[largest]){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = i;
            }
            else if (arr[i]  < arr[largest]){
                if (secondlargest == -1 || arr[i] > arr[secondlargest]){
                    secondlargest = i;
                }
            }
            else if(arr[i] < arr[secondlargest] ){
                if (thirdlargest == -2 || arr[i] > arr[thirdlargest] ){
                      thirdlargest = i;
                }

            }

        }

        return arr[thirdlargest];

    }



    public static void main(String[] args) {

        int[] nums = {1,2,56,12,98,9};
        int ans = thirdlarge(nums);

        System.out.println("third largest elementr in an arraay is " + ans);

    }
}

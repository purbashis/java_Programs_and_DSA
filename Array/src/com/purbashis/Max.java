package com.purbashis;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 88,99,122,12,7,85};

        System.out.println( mx(arr));

        System.out.println( mxRange(arr,1,4));
    }
//imagine array is not empty


    // if its empty
    //int max =Integer.MIN_VALUE;
 static int mx(int[] arr) {
    int maxVal =arr[0];
        for (int i = 0; i<arr.length;i++)

        {
            if (arr[i] > maxVal){
                maxVal=arr[i];
            }

    }
        return maxVal;

    }
    static int mxRange(int[] arr ,int start ,int end ) {
        int maxVal =arr[0];
        for (int i = start; i<= end ;i++)

        {
            if (arr[i] > maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;

    }


}

package com.purbashis;

import java.util.Arrays;

public class Find_the_largest_element_in_array {
    public static void main(String[] args) {
        int [] arr = {5,88,99,122,4,2,3};
        int ans = Max(arr);
        System.out.println("Here is the array "+Arrays.toString(arr));
        System.out.println(ans +" is the max value of this array ");
    }
    static  int Max(int []arr)
    {
        int maxi= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }
        return maxi;
    }


}

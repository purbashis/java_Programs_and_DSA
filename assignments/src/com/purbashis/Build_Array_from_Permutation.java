package com.purbashis;
//https://leetcode.com/problems/build-array-from-permutation/description/

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int [] arr = {0,2,1,5,3,4};
        int[] ans =buildArray(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] buildArray(int[] nums) {
        int  n= nums.length;
        int []ans = new int [n];
        for (int i  = 0 ; i< n;i++)
        {
            ans[i]= nums[nums[i]];

        }
        return ans;



    }
}

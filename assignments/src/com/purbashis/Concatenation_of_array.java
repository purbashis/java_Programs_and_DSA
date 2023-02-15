package com.purbashis;
//https://leetcode.com/problems/concatenation-of-array/description/

import java.util.Arrays;

public class Concatenation_of_array {
    public static void main(String[] args) {
        int [] arr = {0,2,1,5,3,4};
        int[] ans =getConcatenation(arr);
        System.out.println(Arrays.toString(ans));


    }
   static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans =new int [2*n];

        for (int i =0; i<n;i++)
        {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

}

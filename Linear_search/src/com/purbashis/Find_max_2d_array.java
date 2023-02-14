package com.purbashis;

import java.util.Arrays;

public class Find_max_2d_array {

    public static void main(String[] args) {
        int [][] arr= {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
        int[]ans = search(arr,target);// format of return value {row,col}
        int[]maxi= max(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(maxi));
    }
    static int [] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                {
                    //here we have to initialize the  array with new keyword (to declare the array,
                    //  so we have to use new keyword as an object )and return it
                    return new int[]{row, col};     //[2,2]
                }

            }

        }
        return new int[]{-1,-1};// if it's not find the target its print -1


    }
    static int [] max(int[][] arr) {

        int max =Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max)
                {
                    max =   arr[row][col]; // 99
                }

            }

        }
        return new int[]{max};


    }

}


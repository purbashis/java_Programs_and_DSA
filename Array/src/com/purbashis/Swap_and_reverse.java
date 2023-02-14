package com.purbashis;

import java.util.Arrays;

public class Swap_and_reverse  {
    public static void main(String[] args) {
int [] arr = {1,3,23,9,18,99,78,44};
swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
             rev(arr);
        System.out.println("After reverse of this array "+ Arrays.toString(arr));
    }

static void swap(int[] arr, int index1, int index2) {
    int temp = arr [index1];
    arr[index1]= arr[index2];
    arr[index2]= temp;

    }
static  void rev (int [] arr)
{
    int start= 0;
    int end= arr.length-1;
    while(start<end){
        //swap
        swap(arr,start,end);
        start++;
        end--;

    }

}

}

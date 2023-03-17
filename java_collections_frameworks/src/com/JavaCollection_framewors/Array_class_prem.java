package com.JavaCollection_framewors;

import java.util.Arrays;

public class Array_class_prem{
    public static void main(String[] args) {
        //array class
        // binary search --log(n)
//      int [] a = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        int index = Arrays.binarySearch(a,12);
//        System.out.println("the index of element 12 in the array is "+ index);

        int [] a ={56,154,45,98,1,2,3,6,48,95,655,10,123};
        Arrays.sort(a);//parallel  sort  // 8192 --if x >8192 ---quick sort

      //  Arrays.fill(a,12);//fill all elements as val mentioned
        for(int i : a ){
            System.out.print(i+ " ");
        }




    }
}

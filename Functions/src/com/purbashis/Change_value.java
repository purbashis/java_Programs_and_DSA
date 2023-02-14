package com.purbashis;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_value {

    public static void main(String[] args) {
        // create an array
        int [] arr={1,2,3,4,56,750};
        change(arr);
       //  when an object ( arr ) reference passed to the
        //  parameter   'change(arr)' the actual reference itself  is  called by value
    // because the value is being passed refers to the object


        // so the nums point to change('arr') object

        // in java we don't have pointers

        System.out.println(Arrays.toString(arr));
    }

    static  void change(int[]nums){
        nums[0]=99;
        //here we are modifying the array.
        // if you make change to the object via this ref variable
        //same object will be changed
    }
}

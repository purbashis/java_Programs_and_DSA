package com.purbashis;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        //array of primitives
        int [] arr = new int [5];
        arr[0]=23;
        arr[1]=24;
        arr[2]=21;
        arr[3]=27;
        arr[4]=237;
       // [23,24,21,27,237]



        System.out.println(arr[3]);


        //input using for loops
        for (int i = 0; i <arr.length;i++){
            arr[i]=in.nextInt();
        }
               // print array using for loops



        for (int i = 0; i <arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

        //by using to string
        System.out.println(Arrays.toString(arr));

              //       System.out.println(arr[5]);// index out of bound error

             // array of objects
                String [] str = new String[4];
                for (int i= 0; i< str.length;i++){
                    str[i]=in.next();
                }
                System.out.println(Arrays.toString(str));

    }
}

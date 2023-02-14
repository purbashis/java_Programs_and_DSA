package com.purbashis;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        //Q: find the nth fibo number
        Scanner in =new Scanner(System.in );
        System.out.println("Enter the nth number ,  you want of Fibo series : ");
        int n =in.nextInt();




        int a =0 ,b = 1;
        int count = 2;

        while (count <=n) {
            int temp =b ;
            b= b+a ;
            a =temp ;
            count++ ;

        }

        System.out.println("the fibo no is finally here  : "+b);





    }
}

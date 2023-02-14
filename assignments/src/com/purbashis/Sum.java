package com.purbashis;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = in.nextInt();
        System.out.println("Enter the 2nd number ");
        int b = in.nextInt();
        int c = add(a,b);
        System.out.println("Addition of two number is : "+ c );


    }

    static int add(int a ,int b ){
        int x = a+b;
        return  x ;

    }
}

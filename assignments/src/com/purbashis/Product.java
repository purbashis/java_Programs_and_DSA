package com.purbashis;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        float a = in.nextFloat();
        System.out.println("Enter 2nd number ");
        float b = in.nextFloat();

        float c = Mul(a,b);

        System.out.println("the product of these 2 number "+a+" "+"and "+b+" is : "+c);



    }

 static float Mul(float a, float b) {
       float mul= a*b;

        return  mul;
    }
}

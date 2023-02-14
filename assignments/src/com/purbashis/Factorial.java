package com.purbashis;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double a = in.nextDouble();
        double f =fact(a);
        System.out.println("the factorial of the number is :  "+ f );

    }

  static double fact(double a) {
        double result=1;
        for (double i = 1; i <= a; i++)
        {
            result= result*i;
        }

            return result;
    }
}

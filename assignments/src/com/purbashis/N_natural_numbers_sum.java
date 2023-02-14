package com.purbashis;

import java.util.Scanner;

public class N_natural_numbers_sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Nth number : ");

        int input = in.nextInt();

        double n = natural(input);
        System.out.println("the sum of n natural number is "+ n);

    }

 static double natural(int input) {
        int sum = 0;

    for (int i = 1; i<= input; i++)
    {
        sum=sum+i;

    }
    return sum;
    }

}

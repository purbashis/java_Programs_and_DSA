package com.purbashis;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number :");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number :");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("the sum is :" + sum);
//type casting
        int a = (int) 50.56f;
        System.out.println(a);

        // automatic type promotion in expression

        int number = 'A';
        if (number == 65) {
            System.out.println("नमस्ते " + number);
        } else {
            System.out.println("शुक्रिया " + number);

        }


        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        //for loop
        for (int c = 1; c != 5; c++) {

            System.out.println(c);

        }
    }
}

package com.purbashis;

import java.util.Scanner;

public class Vote_eligibility {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();

        boolean x =check(age);

        if (x){
            System.out.println("you are eligible for vote  .");
        }
        else {
            System.out.println("you are not eligible for vote .");
        }

    }

     static boolean check(int a ) {
        if (a>=18){
            return true;
        }else {
            return false;
        }

    }
}

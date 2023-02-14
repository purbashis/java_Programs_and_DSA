package com.purbashis;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your first number : ");
        int a =in.nextInt();

        boolean res = even_or_odd_check(a);
        if (res==true){
            System.out.println(a+"  is  even number .");
        }
        else {
            System.out.println(a+"  is odd number ");
        }


    }

  static boolean  even_or_odd_check(int a ) {

        if (a%2==0){
            return true;

        }
        else {
            return false;
        }


  }
}

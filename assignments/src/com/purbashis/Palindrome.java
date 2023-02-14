package com.purbashis;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = in.nextInt();
       boolean chk= Palin(a);
        if (chk){
            System.out.println(a+" is Palindrome ");
        }else {
            System.out.println(a+ " is not Palindrome ");
        }
    }

  static boolean Palin(int a) {
        int original=a;
        int rev= 0;
        while (a>0) {
            int dig = a % 10;
            rev = rev * 10 + dig;
            a /= 10;
        }
        return original == rev;

        }



    }


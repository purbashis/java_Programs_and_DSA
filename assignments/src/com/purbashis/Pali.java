package com.purbashis;

import java.util.Scanner;

public class Pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a = sc.nextInt();
        boolean check = isPalindrome(a);
        if(check){
            System.out.println("the number "+a+"is Palindrome ");
        }

        else
        {
            System.out.println("the number "+a+"is not Palindrome ");
        }


    }
   static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedStr = sb.toString();
        return str.equals(reversedStr);
    }

}

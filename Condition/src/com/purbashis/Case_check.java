package com.purbashis;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);
        System.out.println("Enter the text ");
        char ch =in.next().trim().charAt(0);
        //hello
        //String word = "hello";
        //System.out.println("hello of 0th index is : "+ word.charAt(0));

        if (ch>= 'a' && ch<='z') {
            System.out.println("Lowercase ");

        }
        else {
            System.out.println("UpperCase");


        }
        System.out.println(ch);




    }
}

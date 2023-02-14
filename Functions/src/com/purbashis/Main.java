package com.purbashis ;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Q:take input of 2 numbers  and print the sum
        Scanner in =new Scanner(System.in);
        int num1 ,num2 ,num3 ;


        System.out.println("enter the first number : ");
        num1 =in.nextInt();
        System.out.println("enter the Second  number : ");
        num2 =in.nextInt();
        num3 = num1+num2;
        System.out.println("the total number is : "+ num3);


        //imagine the person ask you to run these 100 times with different wording it will be difficult
               //don't repeat yourself ----- -_-
        //so we used methods



    }
}
package com.purbashis;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Q : find the largest of these 3 numbers .

        Scanner in =new Scanner( System.in) ;

        System.out.println("enter your 1st number : ");

        int a  = in.nextInt();
        System.out.println("enter your 2nd  number : ");
        int b = in.nextInt();
        System.out.println("enter your 3rd  number : ");
        int c =in.nextInt();

        int max = a ;
        if (b>max){
            max=b;
        }if (c > max){
            max=c;
        }
        System.out.println("The largest number is  :"+max);

        // by using Math.max()

        int x =Math.max(c,Math.max(a,b));
        System.out.println("The Largest number is by  using Math.max() is : "+x);


    }
}

package com. purbashis;
import java.util.Scanner;

public class Large_among_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number :  ");
        int a = in.nextInt();
        System.out.println("Enter the 2nd  number :  ");
        int b = in.nextInt();
        System.out.println("Enter the 3rd number :  ");
        int c = in.nextInt();

        int largest=large(a,b,c);

        System.out.println("Greatest number among 3 is :  "+ largest);
        System.out.println("Smallest number among 3 is :  "+ small(a,b,c));


    }
           // this method is use for find the largest value of among 3
    static int large(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;

    }
        // this method is use for find the smallest value among 3
    static int small(int a, int b, int c) {
          int min = a ;
          if (b<min){
             min=b;

          }
          if (c<min){
              min=c;
          }
        return min;
    }




}
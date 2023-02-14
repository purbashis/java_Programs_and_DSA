package com.purbashis;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        /*for loop :   for (initialisation ; condition ; increment / decrement )


         {
         //body

         }


        */

        // Q : print number from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name  : ");
        String p = input.nextLine();
        System.out.print("enter the how many times you want to print    : ");

        int n = input.nextInt();


        for (int  num = 1 ; num <= n ; num += 1)
        {
            System.out.println(num+"  "+p);
        }





    }
}

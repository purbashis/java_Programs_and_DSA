package com.purbashis;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {


        /* while loops


        Syntax :
        while (condition ){

        //body

        ++ or --
        }



         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name  : ");
        String p = input.nextLine();
        System.out.print("enter the how many times you want to print    : ");
        int n = input.nextInt();
        int x=1;
        while (x<=n)
        {
            System.out.println(x+"  "+p);
            x+=1;
        }






    }


}

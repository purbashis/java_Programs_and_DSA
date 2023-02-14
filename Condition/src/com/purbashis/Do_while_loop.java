package com.purbashis;

import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {

        /*

        in the do while loop the

        do while :
        do {
        //body

        }while (condition ) ;




         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name  : ");
        String p = input.nextLine();
        System.out.print("enter the how many times you want to print    : ");
        int n = input.nextInt();
        int x=1;

        do { System.out.println(x+"  "+p);
            x=x+1;

        }while (x<=n);





    }
}

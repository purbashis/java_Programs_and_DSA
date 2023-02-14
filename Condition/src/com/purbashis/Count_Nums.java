package com.purbashis;

import java.util.Scanner;

public class Count_Nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = in.nextInt();
        int count = 0;

        while (n> 0)
        {
            int rem = n%10;
            if (rem== 5)
            {
                count++;

            }
            n= n/10 ;

        }
        System.out.println(count);

    }
}

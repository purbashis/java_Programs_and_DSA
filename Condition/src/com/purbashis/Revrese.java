package com.purbashis;

import java.util.Scanner;

public class Revrese {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  a number you want to reverse  it : ");
        int n =in.nextInt();


        int ans = 0;

        while (n>0){
            int rem= n%10;
            n/=10;

            ans=ans*10+rem;

        }
        System.out.println("the reverse  of this number of : "+n+"  is this : "+ ans);

    }
}

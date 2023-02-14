package com.purbashis;

import java.util.Scanner;

public class Armstrong {
// check digit is armstrong or not  and print 3 digit all armstrong numbers
public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean ans = isArmstrong(n);

    System.out.println(ans);


    for (int i= 100 ;i<1000;i++  ){
        if (isArmstrong(i)){
            System.out.println(i+ "  ");
        }
    }

}
static  boolean isArmstrong(int n ){
    int original = n;
    int sum = 0;
    while (n >0 ){
        int rem = n%10;
        n= n/10 ;
        sum=sum+rem*rem*rem;
    }

    return sum == original;
}

}

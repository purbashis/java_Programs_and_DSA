package com.purbashis;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean chk = Prime(a);
        if (chk){
            System.out.println("its prime .");
        }else {
            System.out.println("its not prime ");

        }
    }

 static boolean Prime(int a) {
        if (a<=1){
            return false;

        }

        for (int c = 2; c*c<=a ;c++){
            if(a%c==0){
                return false;
            }
        }
        return true;
    }
}

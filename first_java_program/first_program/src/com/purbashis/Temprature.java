package com.purbashis;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter temp in C :");

        float  tempC=in.nextFloat();
        float tempF =(tempC * 9/5)+32;
        System.out.println("the temp in F is :" + tempF);
    }
}

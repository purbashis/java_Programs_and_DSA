package com.purbashis;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String ");

        String input= in.nextLine();
        String ans = Rev(input);
        System.out.println("after reverse of the string :"+ ans);


    }
    static  String Rev(String str){
        int len = str.length();
        String r="";
        for (int i = len-1; i >=0 ; i--) {
            r=r+str.charAt(i);
        }

         return r;
        }

}
package com.purbashis;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String ");

        String input= in.nextLine();
        String ans = Rev3(input);
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

        // 2nd approach  by using character  array .
        static  String Rev2(String str){
        char[] a= str.toCharArray();
            String r="";

        for (int i= a.length -1 ; i>=0;i--)
        {
            r= r+a[i];

        }

              return r;
        }

        //3rd approach by using String Buffer class
        static  String Rev3(String str){
        StringBuilder sb = new StringBuilder(str);
        String ans = String.valueOf(sb.reverse());
        return ans;


        }

}

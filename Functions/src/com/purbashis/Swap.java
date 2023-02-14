package com.purbashis;

public class Swap {

    public static void main(String[] arg ) {

        int a =10 ;
        int b= 20;

        //swap number code
//        int temp =a ;
//        a=b;
//        b=temp;
           swap(a,b);
        System.out.println(a+ "  "+b);

        String name = "purbashis ";
        changeName(name);
        System.out.println(name);

    }

     static void changeName(String name) {
        name = "Rahul kumar";

        //here we are creating the new object
         // also you can not modify strings because its in a final class
    }

    static void swap(int a , int b){
        int temp =a;
        a=b;
        b=temp;

    }


}
////not swapping anything coz java is call by value not by reference .
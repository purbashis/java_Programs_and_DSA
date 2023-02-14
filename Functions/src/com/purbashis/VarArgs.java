package com.purbashis;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2,6,66,99,665,74,85,9,6,88,25);
        //  o or more than 0 arguments
         fun();
         multiple(1,6,"love");

         demo(2,6,8);
         demo("noob","lol","oh_god","ok");
    }

     static void multiple(int a, int b, String... x){
        System.out.println(Arrays.toString(x));

    }

    static  void demo (int ...v){
        System.out.println(Arrays.toString(v));

    }

    static  void demo (String ...v){
        System.out.println(Arrays.toString(v));

    }
    static  void fun (int ...v){
        //it takes array of integer or collection of integer
        System.out.println(Arrays.toString(v));
    }
}

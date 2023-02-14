package com.purbashis;

public class Shadowing {

    static int x = 90;// its has its own scope
    //static means object independent : you can not use object dependent things in object independent things

    public static void main(String[] args) {
        System.out.println(x);//  90
        int x= 40;
        //scope is begins when value is initialised .
        System.out.println(x); // 40  : why because the x = 90 will be shadowed
        //which means the lower level is overriding to the upper level. so higher level is shadowed .

        fun(); // 90

        /*
        what is shadowing in java ?
        it is a practice in java which is  using 2 variables in same name
         within the scope which overlapped .
         */


    }

    static void fun(){
        System.out.println(x);
    }
}

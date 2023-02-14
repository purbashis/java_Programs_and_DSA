package com.purbashis;

public class Overloading {
    public static void main(String[] args) {

        fun(67);
        fun("mom");


    }

    // method overloading means function names  are  same with dif arguments in single class .

    static void fun(int a )
    {

    }
    static void fun(String name)
    {

    }

}

/*
So, the key difference between overloading and overriding is that
 overloading allows multiple methods with the same name,
 but different parameters within the same class or in different classes,
 while overriding is about a subclass providing a new implementation for
 a method that is already defined in its superclass.
 */
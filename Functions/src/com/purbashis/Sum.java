package com.purbashis;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        sum();
      float ans= sum2();//function call
        System.out.println("here i used sum 2 () so in this function the vale of th e output is added with +10  : "+ ans);

        int wow = calc(20,30);
        System.out.println("the ans wil be 20 + 30 : "+ wow);

    }
    static int sum2(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 =in.nextInt();
        System.out.println("enter the Second  number : ");
        int num2 =in.nextInt();
        float total =num1+num2+10;
        return (int) total;
    }
// here return type is type integer



        /*

        method definition

        access modifier    return_type    method_name()
        {
        //body

        return statement ;

        }
        */

    //when u call the method suppose in this case its sum()
    /* when you call the function what is the value of this sum(); line  call going to be
    and when the function finish the execution  sum (); have a particular value . the value what ever
    you returned in the function below line no 43 .so that is the return type .
     */


    //function generation
    static void sum(){
            Scanner in =new Scanner(System.in);
            System.out.println("enter the first number : ");
            int num1 =in.nextInt();
            System.out.println("enter the Second  number : ");
            int num2 =in.nextInt();
            int num3 = num1+num2;
            System.out.println("the total number is : "+ num3);
    }
    /*
    return_type name (arguments ) {
    // body
    return statements ;
    }
    what is arguments :
    let say you don't want to add scanner inside a method again and again
    lets say you want to pass  the number when you're calling the function in main
       we can do it by using arguments / its also known as parameters
    */

    static  int  calc(int a ,int b ){
        int calculate = a+b;
        return  calculate;
    }

}

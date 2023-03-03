package com.OOPs_Poly;

import java.util.Scanner;

class Shape{

    String color;
    public void area(){
        System.out.println("display the area.");
    }


}// Shape is the Parent  class.
class Triangle extends Shape{
    public void area1 (int l ,int h){
        System.out.println("Area of Triangle is: " + ((l * h) / 2));

    }

}//Triangle Child class
/*
 Inheritance  :
Inheritance is a process in which one object
acquires all the properties and behaviors of its parent object automatically.

* re-usability of code .

the class whose members are inherited is called' Base class'(parent class ).
the class which inherits the members of another class is called 'Derived class'(child class ).

 */

public class Polymorphism_R_T {


    public static void main(String[] args) {
        Triangle t1 =new Triangle();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the triangle");
        int l= in.nextInt();
        System.out.println("enter the height of the triangle ");
        int h=in.nextInt();
        t1.color="red";
        System.out.println(t1.color);
        t1.area1(l,h);

    }
}
